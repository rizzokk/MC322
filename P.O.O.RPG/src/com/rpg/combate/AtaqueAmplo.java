//Ação de Combate do esqueleto

package com.rpg.combate;

import com.rpg.personagem.Combatente;

public class AtaqueAmplo implements AcaoDeCombate {
    private String nomeAtaque;
    public AtaqueAmplo(String nomeAtaque) {
        this.nomeAtaque = nomeAtaque;
    }

    public String getNome() {
        return nomeAtaque;
    }

    public void executar(Combatente usuario, Combatente alvo) {
        usuario.atacar(alvo);
    }
}