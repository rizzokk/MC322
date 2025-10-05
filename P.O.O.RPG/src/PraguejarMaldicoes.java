public class PraguejarMaldicoes implements AcaoDeCombate {
    private String nomeAtaque;

    public PraguejarMaldicoes(String nomeAtaque) {
        this.nomeAtaque = nomeAtaque;
    }

    public String getNome() {
        return nomeAtaque;
    }

    public void executar(Combatente usuario, Combatente alvo) {
        System.out.println("O Cultista le paginas de um livro velho e recita palavras estranhas");
        System.out.println("Oshiete oshiete yo sono shikumi wo");
        System.out.println("Boku no naka ni");
        System.out.println("Dare ga iru no?");
        System.out.println("Kowareta kowareta yo kono sekai de");
        System.out.println("Kimi ga warau");
        System.out.println("Nani mo miezu ni");
        usuario.atacar(alvo);
    }
}
