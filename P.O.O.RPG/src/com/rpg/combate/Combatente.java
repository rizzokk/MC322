// Interface que determina metodos basicos para todos os Personagens

package com.rpg.combate;

import com.rpg.personagem.Personagem;

public interface Combatente {
    public String getNome();
    public boolean estaVivo(Personagem alvo);
    public void receberDano(int dano);
    public void receberCura(int cura);
    public void atacar(Combatente alvo);
    public void escolherAcao(Combatente alvo);
}