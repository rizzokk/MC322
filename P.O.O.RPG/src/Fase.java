import java.util.ArrayList;
public class Fase {

	private int nivel;
	private String ambiente;
	private ArrayList<Monstro> monstro;
	
	public Fase(int nivel, String ambiente) {
		this.nivel = nivel;
		this.ambiente = ambiente;
		this.monstro = new ArrayList<Monstro>();
	}

	public Fase getFase(int nivel, String ambiente) {
		Fase fase = new Fase(nivel, ambiente);
		for (int i = 0; i <= nivel + 2; i++) {
			if (i < 5) {
				Esqueleto esqueleto = new Esqueleto("esqueleto", 55, 10, 25);
				monstro.add(esqueleto);
			}
			else if (5 <= i && i < 7) {
				Esqueleto esqueleto = new Esqueleto("esqueleto gigante", 110, 15, 75);
				monstro.add(esqueleto);
			}
			else {
				Cultista cultista = new Cultista("Sombra", 100, 25, 100);
				monstro.add(cultista);
			}
		}
		
		return fase;
	}

}
