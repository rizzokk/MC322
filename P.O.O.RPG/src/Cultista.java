public class Cultista extends Monstro {
    private int dano;

    public Cultista(String nome, int forca, int pontosDeVida, int xpConcedido) {
        super(nome, forca, pontosDeVida, xpConcedido);
        this.dano = 5;
    }

    public void atacar(int dano, Personagem alvo) {
        System.out.println("O Cultista le paginas de um livro velho e recita palavras estranhas");
        System.out.println("Oshiete oshiete yo sono shikumi wo");
        System.out.println("Boku no naka ni");
        System.out.println("Dare ga iru no?");
        System.out.println("Kowareta kowareta yo kono sekai de");
        System.out.println("Kimi ga warau");
        System.out.println("Nani mo miezu ni");
        System.out.println("O Heroi sofre " + dano + " de dano psicologico");
        receberDano(dano, alvo);
    }
}