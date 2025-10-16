// Classe abstrata que representa monstros inimigos do RPG.
// Herda de Personagem e adiciona lógica de experiência concedida ao ser derrotado.

package com.rpg.personagem;

import java.util.ArrayList;
import java.util.Random;
import com.rpg.itens.*;

public abstract class Monstro extends Personagem implements Lootavel{
    private int xpConcedido;
    private ArrayList<Arma> listaDeArmasParaLargar;

    public Monstro(String nome, int pontosDeVida, int forca, int xpConcedido) {
        super(nome, pontosDeVida, forca);
        this.xpConcedido = xpConcedido;
        OssoGigante arma1 = new OssoGigante("Osso Gigante", 3, 8);
        Cajado arma2 = new Cajado("Cajado de Arvore Ancestral", 3, 7);
        Bracadeiras arma3 = new Bracadeiras("Punhos de Ki", 3, 10);
        listaDeArmasParaLargar = new ArrayList<Arma>();
        listaDeArmasParaLargar.add(arma1);
        listaDeArmasParaLargar.add(arma2);
        listaDeArmasParaLargar.add(arma3);
    }

	public String getNome() {
    	return super.getNome();
	}

	public int getXpConcedido() {
		return xpConcedido;
	}

	public int getPontosDeVida() {
		return super.getPontosDeVida();
	}

    public Arma largarArma() {
        Random numeroRandom = new Random();
        Arma armaSorteada = listaDeArmasParaLargar.get(numeroRandom.nextInt(listaDeArmasParaLargar.size()-1));
        System.out.println("O Monstro deixou cair " + armaSorteada.getNome());
        return armaSorteada;
    }

    public Arma droparLoot() {
        return this.largarArma();
    }

    public abstract void escolherAcao(Combatente alvo);

    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("Experiencia Concedida ao morrer: " + this.xpConcedido);
    }
}