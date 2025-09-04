public class Monge extends Heroi{
    private int ataquesAdicionais, dano;

    public Monge(String nome, int pontosDeVida, int forca, int nivel, int experiencia) {
        super(nome, pontosDeVida, forca, nivel, experiencia);
        this.ataquesAdicionais = nivel + 1;
        this.dano = 6 + forca;
    }

    public void atacar(int dano, Personagem alvo) {
        System.out.println("O Monge acerta um golpe desarmado em " + alvo + " e causa: " + dano + " de dano");
        receberDano(dano, alvo);
    }

    public void usarHabilidadeEspecial(Personagem alvo) {
        System.out.println("O Monge respira fundo e da uma enchurada de golpes no inimigo");
        int i;
        for (i=0; i < ataquesAdicionais; i++) {
            atacar(dano, alvo);
        }
    }
}