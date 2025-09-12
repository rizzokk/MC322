// Classe base abstrata para todos os personagens do RPG (heróis e monstros).
// Define atributos comuns e métodos essenciais para manipulação de vida, dano e status.
// Outras classes como Heroi e Monstro herdam desta classe.

public abstract class Personagem {
    private String nome;
    private int forca, pontosDeVida;
	private Arma arma;

    public Personagem(String nome, int pontosDeVida, int forca) {
        this.nome = nome;
        this.forca = forca;
        this.pontosDeVida = pontosDeVida;
		arma = null;
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
		if (alvo.arma != null) {
			System.out.println("Arma equipada: " + alvo.arma.getNomeArma());
		} else {
			System.out.println("Nenhuma arma equipada.");
		}
    }

	public boolean checkArma() {
		if (this.arma != null) {
			return true;
		}
		return false;
	}

	public Arma getArma() {
		return this.arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}
	
	public String getNome() {
   		return this.nome;
	}

	public int getForca() {
		return this.forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
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
