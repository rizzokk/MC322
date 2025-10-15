// Classe principal do RPG.
// Responsável por iniciar o jogo, criar personagens, monstros e controlar o fluxo da batalha.

package com.rpg.game;

import java.util.ArrayList;
import com.rpg.cenario.*;
import com.rpg.personagem.*;
import com.rpg.exceptions.*;

public class Main {

	public static void main(String[] args) {

		GeradorDeFases gerador = new ConstrutorDeCenarioFixo(3);
		Dificuldade dificuldadeFase = MenuPrincipal.MenuInicial();
		ArrayList<FaseDeCombate> fases = gerador.gerar(3, dificuldadeFase);
		
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