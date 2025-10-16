// Classe principal do RPG.
// Responsável por iniciar o jogo, criar personagens, monstros e controlar o fluxo da batalha.

package com.rpg.game;

import java.util.ArrayList;
import com.rpg.cenario.*;
import com.rpg.personagem.*;
import com.rpg.exceptions.*;

public class Main {

	public static void main(String[] args) {

		// Inicializa o gerador de fases
		GeradorDeFases gerador = new ConstrutorDeCenarioFixo(3);

		// Escolhe a dificuldade inicial
		Dificuldade dificuldadeFase = MenuPrincipal.MenuInicial();

		// Gera as fases do jogo
		ArrayList<FaseDeCombate> fases = gerador.gerar(3, dificuldadeFase);

		// Cria o herói principal
		Monge monge = new Monge("Shang Chi", 100, 20, 1, 0);
		monge = VerificarMonge.VerificarExistencia(monge);
		
		System.out.println("\n");
		System.out.println("--------「A BATALHA COMEÇA」--------");
		System.out.println("\n");
		for (FaseDeCombate fase : fases) {
			fase.iniciar(monge);
			
			if (!monge.estaVivo(monge)) {
				break;
			}
		}
		if (monge.estaVivo(monge)) {
			System.out.println("--------「VITORIA DO HEROI」--------\n");
		}
	}
}
