public class Monge extends Heroi{
    private int ataquesAdicionais;

    public Monge(String nome, int pontosDeVida, int forca, int nivel, int experiencia) {
        super(nome, pontosDeVida, forca, nivel, experiencia);
    }

    private int calcularDano(int forca) {
        return (6 + forca);
    }

    public void atacar(Personagem alvo) {
        public int dano;
        dano = calcularDano(forca);

    }
}