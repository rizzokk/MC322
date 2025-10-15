// Interface que determina metodos basicos para gerar fases

package com.rpg.cenario;

import java.util.ArrayList;

public interface GeradorDeFases {
    public ArrayList<FaseDeCombate> gerar(int quantidadeDeFases, Dificuldade dificuldade);
}
