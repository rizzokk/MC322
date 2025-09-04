public class Esqueleto extends Monstro {
    private int dano;

    public Esqueleto(String nome, int pontosDeVida, int forca, int xpConcedido) {
        super(nome, pontosDeVida, forca, xpConcedido);
        this.dano = 5 + forca;
    }

    public void atacar(Personagem alvo) {
		System.out.println("O Esqueleto ataca com sua espada enferrujada");
		System.out.println("O Esqueleto causa " + dano + " de dano");

        receberDano(dano, alvo);
    }
}