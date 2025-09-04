public class Mago extends Heroi{
    private int mana, dano, BolaDeFogo = 20;

    public Mago(String nome, int pontosDeVida, int forca, int nivel, int experiencia) {
        super(nome, pontosDeVida, forca, nivel, experiencia);
        this.mana = nivel + 1;
        this.dano = 1 + forca;
    }

    public void atacar(Personagem alvo) {
        System.out.println("Causou " + dano + "de dano");
        receberDano(dano, alvo);
    }

    public void usarHabilidadeEspecial(Personagem alvo) {
        if (mana > 0) {
            System.out.println("O Mago abre seu grimorio e começa a conjurar um grande feitiço");
            System.out.println("Habataitara");
            System.out.println("Modoranai to itte");
            System.out.println("Mezashita no wa");
            System.err.println("Aoi aoi ano sora");
            System.out.println("Uma grande bola de fogo atinge os inimigos");
            atacar(alvo);
            mana--;
        }
        else {
            System.out.println("A mana do Mago acabou...");
            System.out.println("O Mago acerta " + alvo + " com o seu cajado");
            System.out.println(".............");
            System.out.println("Não parece muito efetivo");
            receberDano(BolaDeFogo, alvo);
        }
    }
}