//Interface que determina os metodos basicos para todas as fases

package com.rpg.cenario;

import com.rpg.personagem.Heroi;

public interface Fase {
    public void iniciar(Heroi heroi);
    public boolean isConcluida();
    public String getTipoDeCenario(TipoCenario cenario);
}
