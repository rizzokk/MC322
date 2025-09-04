// Classe abstrata que representa monstros inimigos do RPG.
// Herda de Personagem e adiciona lógica de experiência concedida ao ser derrotado.

public abstract class Monstro extends Personagem {
    private int xpConcedido;

    public Monstro(String nome, int pontosDeVida, int forca, int xpConcedido) {
        super(nome, pontosDeVida, forca);
        this.xpConcedido = xpConcedido;
    }

	public String getNome() {
    	return super.getNome();
	}

	public int getXpConcedido() {
		return xpConcedido;
	}

    @Override
    public void exibirStatus(Personagem alvo) {
        super.exibirStatus(alvo);
        System.out.println("Experiencia Concedida ao morrer: " + this.xpConcedido);
    }
}