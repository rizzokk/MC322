// Classe concreta que representa um herói do tipo Mago.
// Implementa habilidades específicas de mago.

package com.rpg.personagem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.rpg.combate.*;

public class Mago extends Heroi{
    private int mana, dano, danoBolaDeFogo = 50;
    private List<AcaoDeCombate> acoes;
    private AtaqueFisico ataqueBase;
    private BolaDeFogo magiaDeFogo;

    public Mago(String nome, int pontosDeVida, int forca, int nivel, int experiencia) {
        super(nome, pontosDeVida, forca, nivel, experiencia);
        this.mana = nivel + 1;
        this.dano = 1 + forca + getArma().getDano();
        acoes = new ArrayList<>();
        ataqueBase = new AtaqueFisico("Cajadada");
        acoes.add(ataqueBase);
        magiaDeFogo = new BolaDeFogo("Bola de Fogo", mana, setSorte(), danoBolaDeFogo);
        acoes.add(magiaDeFogo);
    }

    public void atacar(Combatente alvo) {
        System.out.println("Causou " + dano + "de dano");
        alvo.receberDano(dano);
    }

    public void escolherAcao(Combatente alvo) {
        Random aleatorio = new Random();
        acoes.get(aleatorio.nextInt(acoes.size() - 1)).executar(this, alvo);
    }

    public void usarHabilidadeEspecial(Personagem alvo) {

        if (mana > 0 && getSorte() > 0.2 && getSorte() <= 0.8) {
            System.out.println("O Mago abre seu grimorio e começa a conjurar um grande feitiço");
            System.out.println("Habataitara");
            System.out.println("Modoranai to itte");
            System.out.println("Mezashita no wa");
            System.err.println("Aoi aoi ano sora");
            System.out.println("Uma grande bola de fogo atinge os inimigos");
			alvo.receberDano(danoBolaDeFogo);
            mana--;
        }
        else if (mana > 0 && getSorte() <= 0.2) {
			System.out.println("O Mago tenta conjurar um feitiço, mas erra a pronúncia");
			System.out.println("O feitiço falha miseravelmente");
			System.out.println("O Mago acerta " + alvo.getNome() + " com o seu cajado");
			System.out.println(".............");
			System.out.println("Não parece muito efetivo");
			mana--;
		}
		else if (mana > 0 && getSorte() > 0.8) {
            System.out.println("O Mago abre seu grimorio e começa a conjurar um grande feitiço");
            System.out.println("Habataitara");
            System.out.println("Modoranai to itte");
            System.out.println("Mezashita no wa");
            System.err.println("Aoi aoi ano sora");
            System.out.println("Uma bola de fogo assustadoramente grande atinge os inimigos (dano crítico)");
			alvo.receberDano(danoBolaDeFogo*3);
			mana--;
		}
		else {
			System.out.println("A mana do Mago acabou...");
            System.out.println("O Mago acerta " + alvo.getNome() + " com o seu cajado");
            System.out.println(".............");
            System.out.println("Não parece muito efetivo");
			atacar(alvo);
        }
    }
}