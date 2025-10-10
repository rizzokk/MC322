// Controe um determinado numero de fases e os armazena em uma lista

package com.rpg.cenario;

import java.util.ArrayList;

public class ConstrutorDeCenarioFixo implements GeradorDeFases {

	private int nFases;
	public ConstrutorDeCenarioFixo(int nFases) {
		this.nFases = nFases;
	}
	
	public int getNumFases() {
		return nFases;
	}

	public ArrayList<FaseDeCombate> gerar(int nFases) {
		ArrayList<FaseDeCombate> fases = new ArrayList<FaseDeCombate>();
		FaseDeCombate fase = new FaseDeCombate(0, TipoCenario.FLORESTA);
		
		for (int i = 0; i < nFases; i++) {
			fase = fase.getFase(i,TipoCenario.values()[i]);
			fases.add(fase);
		}

		return fases;
	}
}


