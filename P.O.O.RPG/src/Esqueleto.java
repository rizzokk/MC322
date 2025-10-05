import java.util.ArrayList;
import java.util.Random;

public class Esqueleto extends Monstro{
    private int dano;
    private ArrayList<AcaoDeCombate> acoes;
    private SocoVeloz ataqueVeloz;
    private AtaqueAmplo ataqueAmplo;

    public Esqueleto(String nome, int pontosDeVida, int forca, int xpConcedido) {
        super(nome, pontosDeVida, forca, xpConcedido);
        this.dano = 5 + forca;
        acoes = new ArrayList<>();
        ataqueVeloz = new SocoVeloz("Soco Veloz");
        acoes.add(ataqueVeloz);
        ataqueAmplo = new AtaqueAmplo("Ataque Amplo");
        acoes.add(ataqueAmplo);
    }

    public void escolherAcao(Combatente alvo) {
        Random aleatorio = new Random();
        acoes.get(aleatorio.nextInt(acoes.size() - 1)).executar(this, alvo);
    }

    public void atacar(Combatente alvo) {
		System.out.println("O Esqueleto ataca com sua espada enferrujada");
		System.out.println("O Esqueleto causa " + dano + " de dano");

        alvo.receberDano(dano);
    }
}