// Classe principal do RPG.
// Responsável por iniciar o jogo, criar personagens, monstros e controlar o fluxo da batalha.

package com.rpg.game;

import java.util.ArrayList;
import com.rpg.cenario.*;
import com.rpg.personagem.*;

public class Main {

	public static void main(String[] args) {

		GeradorDeFases gerador = new ConstrutorDeCenarioFixo(3);
		ArrayList<FaseDeCombate> fases = gerador.gerar(3);
		
		Monge monge = new Monge("Shang Chi", 170, 20, 1, 0);
		
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
			System.out.println("--------「VITORIA DO MONGE」--------\n");
		}
	}
}