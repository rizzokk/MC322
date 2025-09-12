import java.util.ArrayList;

public class ConstrutorDeCenario {
	public static ArrayList<Fase> gerarFases(int nFases) {

		ArrayList<Fase> fases = new ArrayList<Fase>();
		Fase fase = new Fase(0,"");
		for (int i = 0; i <= nFases; i++) {
			fase = fase.getFase(i, "Calvario Amaldiciodo" + i+1);
			fases.add(fase);
		}

		return fases;
	}
}


