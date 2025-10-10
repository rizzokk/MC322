// Classe concreta que representa um monstro do tipo Cultista.
// Define comportamentos e características específicas de cultista.

package com.rpg.personagem;

import java.util.ArrayList;
import java.util.Random;
import com.rpg.combate.*;

public class Cultista extends Monstro {
    private int dano;
    private ArrayList<AcaoDeCombate> acoes;
    private AtaqueFisico ataqueBase;
    private PraguejarMaldicoes amaldicoar;

    public Cultista(String nome, int pontosDeVida, int forca, int xpConcedido) {
        super(nome, pontosDeVida, forca, xpConcedido);
        this.dano = 5 + forca;
        acoes = new ArrayList<>();
        ataqueBase = new AtaqueFisico("Facada");
        acoes.add(ataqueBase);
        amaldicoar = new PraguejarMaldicoes("Amaldiçoar");
        acoes.add(amaldicoar);
    }

    public void escolherAcao(Combatente alvo) {
        Random aleatorio = new Random();
        acoes.get(aleatorio.nextInt(acoes.size() - 1)).executar(this, alvo);
    }

    public void atacar(Combatente alvo) {
        alvo.receberDano(dano);
    }
}