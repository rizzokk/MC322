// Interface que determina como as açoes de combates são executadas

package com.rpg.combate;

import com.rpg.personagem.Combatente;

public interface AcaoDeCombate {
    public void executar(Combatente usuario, Combatente alvo);
}
