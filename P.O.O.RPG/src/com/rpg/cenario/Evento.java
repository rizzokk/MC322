package com.rpg.cenario;

import com.rpg.personagem.Heroi;

public interface Evento {
    public boolean verificarGatilho(TipoCenario cenario);
    public void executar(Heroi heroi);
}
