// Item do tipo arma que pode ser dropada de um monstro e equipada pelo heroi

public abstract class Arma implements Item {

	private String nomeArma;
	private int minNivel;
	private int dano;

	public Arma(String nomeArma, int minNivel, int dano) {
		this.nomeArma = nomeArma;
		this.minNivel = minNivel;
		this.dano = dano;
	}

	public int getminNivel() {
		return minNivel;
	}

	public int getDano() {
		return dano;
	}

	public String getNome() {
		return nomeArma;
	}
}
