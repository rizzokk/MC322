// Classe concreta que determina metodos e atributos basicos para as fases de combate

package com.rpg.cenario;

import java.util.ArrayList;

import com.rpg.personagem.Cultista;
import com.rpg.personagem.Esqueleto;
import com.rpg.personagem.Heroi;
import com.rpg.personagem.Monstro;
import com.rpg.game.MenuPrincipal;
import com.rpg.itens.*;
import com.rpg.exceptions.*;

public class FaseDeCombate implements Fase {

	private int nivel;
	private TipoCenario ambiente;
	private ArrayList<Monstro> monstro;
	private Dificuldade dificuldade;
	
	public FaseDeCombate(int nivel, TipoCenario ambiente, Dificuldade dificuldade) {
		this.nivel = nivel;
		this.ambiente = ambiente;
		this.monstro = new ArrayList<Monstro>();
		this.dificuldade = dificuldade;
	}

	public TipoCenario getAmbiente() {
		return ambiente;
	}

	public int getNivelFase() {
		return nivel;
	}

	public ArrayList<Monstro> getMonstros() {
		return monstro;
	}

	public Dificuldade getDificuldade() {
		return dificuldade;
	}

	public boolean isConcluida() {
		if (!monstro.get(0).estaVivo(monstro.get(0))) {
			monstro.remove(monstro.get(0));
		}
		return monstro.isEmpty();
	}

	public void iniciar(Heroi heroi) {
		System.out.println("--------「" + ambiente + "」--------");
		System.out.println("\n");
		System.out.println(ambiente.getDescricao());
		System.out.println("\n");
		Evento armadilha = new ArmadilhaDePedras(50, Math.random());
		Arma drop = null;
		if (armadilha.verificarGatilho(ambiente) && heroi.estaVivo(heroi)) {
				armadilha.executar(heroi);
			}
		for (Monstro monstroAtual : monstro) {
			while (heroi.estaVivo(heroi) && monstroAtual.estaVivo(monstroAtual)) {
				System.out.println("Um " + monstroAtual.getNome() + " aparece!");
				heroi.escolherAcao(monstroAtual);
				if (monstroAtual.estaVivo(monstroAtual)) {
					monstroAtual.escolherAcao(heroi);
				}
				
				if (!heroi.estaVivo(heroi)) {
					System.out.println("O Monge foi derrotado...\n" +
					"\n--------「Game Over」--------\n");
				} 
				
				else if (!monstroAtual.estaVivo(monstroAtual)) {
					System.out.println("✺ O Monge derrotou o " + monstroAtual.getNome() + " e ganhou " + monstroAtual.getXpConcedido() + " de experiência ✺");
					heroi.ganharExperiencia(monstroAtual.getXpConcedido());
					if (heroi.setSorte() > 0.5) {
						drop = monstroAtual.droparLoot();
						System.out.println("O monstro deixou algo para trás");
					}
					else {
						System.out.println("O monstro não deixou nada para trás");
					}
				}
				
				System.out.println("\n");
				System.out.println("--------STATUS DO HEROI--------\n");
				heroi.exibirStatus();
				System.out.println("\n");
				System.out.println("--------STATUS DO MONSTRO--------\n");
				monstroAtual.exibirStatus();
				System.out.println("----------------------------------");
				System.out.println("\n");
				
			}
			if (!heroi.estaVivo(heroi)) {
				break;
			}

			MenuPrincipal.PosTurno(heroi, drop);

		}
	}

	public String getTipoDeCenario(TipoCenario cenario) {
		return cenario.getDescricao();
	}

	public FaseDeCombate getFase(int nivel, TipoCenario ambiente, Dificuldade dificuldade) {
		FaseDeCombate fase = new FaseDeCombate(nivel, ambiente, dificuldade);
		for (int i = 0; i <= dificuldade.getQuantMontros(); i++) {
			if (i < 2) {
				Esqueleto esqueleto = new Esqueleto("esqueleto", 25*dificuldade.getMultDificuldade(), 1*dificuldade.getMultDificuldade(), 25*dificuldade.getMultXP());
				esqueleto = VerificarEsqueleto.VerificarExistencia(esqueleto);
				fase.monstro.add(esqueleto);
			}
			else if (2 <= i && i < 4) {
				Esqueleto esqueleto = new Esqueleto("esqueleto gigante", 40*dificuldade.getMultDificuldade(), 3*dificuldade.getMultDificuldade(), 75*dificuldade.getMultXP());
				esqueleto = VerificarEsqueleto.VerificarExistencia(esqueleto);
				fase.monstro.add(esqueleto);
			}
			else {
				Cultista cultista = new Cultista("Sombra", 50*dificuldade.getMultDificuldade(), 5*dificuldade.getMultDificuldade(), 100*dificuldade.getMultXP());
				fase.monstro.add(cultista);
			}
		}
		
		return fase;
	}

}
