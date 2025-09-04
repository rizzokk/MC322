// Classe concreta que representa um monstro do tipo Cultista.
// Define comportamentos e características específicas de cultista.

public class Cultista extends Monstro {
    private int dano;

    public Cultista(String nome, int pontosDeVida, int forca, int xpConcedido) {
        super(nome, pontosDeVida, forca, xpConcedido);
        this.dano = 5 + forca;
    }

    public void atacar(Personagem alvo) {
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