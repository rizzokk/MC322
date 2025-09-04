// Classe base abstrata para todos os personagens do RPG (heróis e monstros).
// Define atributos comuns e métodos essenciais para manipulação de vida, dano e status.
// Outras classes como Heroi e Monstro herdam desta classe.

public abstract class Personagem {
    private String nome;
    private int forca, pontosDeVida;

    public Personagem(String nome, int pontosDeVida, int forca) {
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

	public String getNome() {
   		return this.nome;
	}

	public boolean estaVivo(Personagem alvo) {
		if (alvo.pontosDeVida > 0) {
			return true;
		}
		alvo.pontosDeVida = 0;
		return false;
	}

    public abstract void atacar(Personagem alvo);
}