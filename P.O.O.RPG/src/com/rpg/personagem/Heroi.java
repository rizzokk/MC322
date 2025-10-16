// Classe abstrata que representa heróis jogáveis no RPG.
// Herda de Personagem e adiciona lógica de experiência, nível e habilidades especiais.
package com.rpg.personagem;

import com.rpg.itens.Arma;

public abstract class Heroi extends Personagem{
    private int nivel , experiencia, expProximoNivel;
	private double sorte;

    public Heroi(String nome, int pontosDeVida, int forca, int nivel, int experiencia) {
        super(nome, pontosDeVida, forca);
        this.nivel = nivel;
        this.experiencia = experiencia;
		this.expProximoNivel = 100;
		sorte = Math.random();
    }

    private void subirDeNivel() {
		if (experiencia >= expProximoNivel) {
			experiencia = experiencia - expProximoNivel;
			expProximoNivel = expProximoNivel+(expProximoNivel*1/10);
			nivel++;
			setForca(getForca()+1);
		}
    }

	public double getSorte() {
		return this.sorte;
	}

	public double setSorte() {
		this.sorte = Math.random();
		return this.sorte; 
	}

    public void ganharExperiencia(int expGanha) {
        experiencia = experiencia + expGanha;
        subirDeNivel(); 
    }

	public void equiparArma(Arma novaArma) {
		if (novaArma.getminNivel() <= this.nivel) {
			if(checkArma()) {
				if( novaArma.getDano() > getArma().getDano() ) {
					setArma(novaArma);
					System.out.println("Arma " + novaArma.getNome() + " equipada com sucesso!");
				} else {
					System.out.println("A arma " + novaArma.getNome() + " não é melhor que a arma atual.");
				}
			} else {
				setArma(novaArma);
				System.out.println("Arma " + novaArma.getNome() + " equipada com sucesso!");
			}
		}
		else {
			System.out.println("Nivel insuficiente para equipar a arma " + novaArma.getNome() + ".");
		}
	}

    @Override
    public void exibirStatus(){
        super.exibirStatus();
		System.out.println("Nivel: " + this.nivel);
        System.out.println("Experiencia: " + this.experiencia);
    }
    
    public abstract void usarHabilidadeEspecial(Personagem alvo);

	public int getPontosDeVida() {
		return super.getPontosDeVida();
	}
}