public abstract class Monstro extends Personagem {
    private int xpConcedido;

    public Monstro(String nome, int forca, int pontosDeVida, int xpConcedido) {
        super(nome, forca, pontosDeVida);
        this.xpConcedido = xpConcedido;
    }

    @Override
    public void exibirStatus(Personagem alvo) {
        super.exibirStatus(alvo);
        System.out.println("Experiencia Concedida ao morrer: " + this.xpConcedido);
    }
}