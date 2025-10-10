//Ação de Combate do monge

package com.rpg.combate;

public class EnxuradaDeGolpes implements AcaoDeCombate {
    private String nomeAtaque;
    private double sorte;
    private int ataquesAdicionais;
    public EnxuradaDeGolpes (String nomeAtaque, double sorte, int ataquesAdicionais) {
        this.nomeAtaque = nomeAtaque;
        this.sorte = sorte;
        this.ataquesAdicionais = ataquesAdicionais;
    }

    public String getNome() {
        return nomeAtaque;
    }

    public void executar(Combatente usuario, Combatente alvo) {
        if (sorte > 0.3) {
            System.out.println("O Monge respira fundo e da uma enchurada de golpes no inimigo");
            int i;
            for (i=0; i < ataquesAdicionais; i++) {
                usuario.atacar(alvo);
            }
        }
        else {
            System.out.println("O Monge respira fundo, mas pensamentos malignos invadem a sua mente");
            System.out.println("O Monge perde a oportunidade de atacar nesse turno");
        }
    }
}
