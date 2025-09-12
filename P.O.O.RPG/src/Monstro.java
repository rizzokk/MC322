// Classe abstrata que representa monstros inimigos do RPG.
// Herda de Personagem e adiciona lógica de experiência concedida ao ser derrotado.
import java.util.ArrayList;
import java.util.Random;
public abstract class Monstro extends Personagem {
    private int xpConcedido;
    private ArrayList<Arma> listaDeArmasParaLargar;

    public Monstro(String nome, int pontosDeVida, int forca, int xpConcedido) {
        super(nome, pontosDeVida, forca);
        this.xpConcedido = xpConcedido;
        OssoGigante arma1 = new OssoGigante("Osso Gigante", 3, 8);
        Cajado arma2 = new Cajado("Cajado de Arvore Ancestral", 3, 10);
        Bracadeiras arma3 = new Bracadeiras("Punhos de Ki", 3, 10);
        listaDeArmasParaLargar = new ArrayList<Arma>();
        listaDeArmasParaLargar.add(arma1);
        listaDeArmasParaLargar.add(arma2);
        listaDeArmasParaLargar.add(arma3);
    }

	public String getNome() {
    	return super.getNome();
	}

	public int getXpConcedido() {
		return xpConcedido;
	}

    public Arma largarArma() {
        Random numeroRandom = new Random();
        Arma armaSorteada = listaDeArmasParaLargar.get(numeroRandom.nextInt(listaDeArmasParaLargar.size()-1));
        System.out.println("O Monstro deixou cair " + armaSorteada.getNomeArma());
        return armaSorteada;
    }

    @Override
    public void exibirStatus(Personagem alvo) {
        super.exibirStatus(alvo);
        System.out.println("Experiencia Concedida ao morrer: " + this.xpConcedido);
    }
}