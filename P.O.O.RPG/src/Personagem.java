public abstract class Personagem {
    private String nome;
    private int forca, pontosDeVida;

    public Personagem(String nome, int forca, int pontosDeVida) {
        this.nome = nome;
        this.forca = forca;
        this.pontosDeVida = pontosDeVida;
    }

    private void DiminuirVida(int dano, Personagem alvo) {
        alvo.pontosDeVida = alvo.pontosDeVida - dano;
    }

    public void receberDano(int dano, Personagem alvo) {
        DiminuirVida(dano, alvo);
    }

    public void exibirStatus(Personagem alvo) {
        System.out.println("Nome do Personagem: " + alvo.nome);
        System.out.println("Pontos de Vida: " + alvo.pontosDeVida);
        System.out.println("Força: " + alvo.forca);
    }

    public abstract void atacar(int dado, Personagem alvo);
}