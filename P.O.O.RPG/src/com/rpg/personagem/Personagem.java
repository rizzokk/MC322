// Classe base abstrata para todos os personagens do RPG (heróis e monstros).
// Define atributos comuns e métodos essenciais para manipulação de vida, dano e status.
// Outras classes como Heroi e Monstro herdam desta classe.

package com.rpg.personagem;

import com.rpg.combate.Combatente;
import com.rpg.itens.Arma;

public abstract class Personagem implements Combatente{
    private String nome;
    private int forca, pontosDeVida;
	private Arma arma;

    public Personagem(String nome, int pontosDeVida, int forca) {
        this.nome = nome;
        this.forca = forca;
        this.pontosDeVida = pontosDeVida;
		arma = null;
    }

    private void DiminuirVida(int dano) {
        this.pontosDeVida = this.pontosDeVida - dano;
    }

    public void receberDano(int dano) {
        DiminuirVida(dano);
    }

	private void AumentarVida(int cura) {
		this.pontosDeVida = this.pontosDeVida + cura;
	}

	public void receberCura(int cura) {
		AumentarVida(cura);
	}

    public void exibirStatus() {
        System.out.println("Nome do Personagem: " + this.nome);
        System.out.println("Pontos de Vida: " + this.pontosDeVida);
        System.out.println("Força: " + this.forca);
		if (this.arma != null) {
			System.out.println("Arma equipada: " + this.arma.getNome());
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

    public abstract void atacar(Combatente alvo);

	public abstract void escolherAcao(Combatente alvo);
}
