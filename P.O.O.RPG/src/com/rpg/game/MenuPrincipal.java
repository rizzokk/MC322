package com.rpg.game;

import com.rpg.util.*;
import com.rpg.itens.*;
import com.rpg.personagem.*;
import com.rpg.cenario.*;

public class MenuPrincipal {

    private static int numEscolha;

    public static Dificuldade MenuInicial() {
        while(true) {
            System.out.println("--------「Baldur's Gate 4」--------");
            System.out.println("==================================");
            System.out.println("[1] Iniciar Novo Jogo");
            System.out.println("[2] Ver Informações das Classes de Heróis");
            System.out.println("[3] Ver Informações das Classes de Monstros");
            System.out.println("[4] Sair do Jogo");
            System.out.println("==================================");
            
            numEscolha = InputManager.LerInteiro("Digite um Numero entre:", 1, 4);
            
            switch (numEscolha){
                case 1:
                System.out.println("\n" + "--------「Escolha a dificuldade」--------");
                    System.out.println("==================================");
                    System.out.println("[1] FACIL");
                    System.out.println("[2] MEDIO");
                    System.out.println("[3] DIFICIL");
                    System.out.println("==================================" + "\n");
                    
                    numEscolha = InputManager.LerInteiro("Digite um Numero entre:", 1, 3);
                    
                    switch (numEscolha) {
                        case 1:
                            return Dificuldade.FACIL;
                        case 2:
                            return Dificuldade.MEDIO;
                        case 3:
                            return Dificuldade.DIFICIL;
                    }
                    break;
                case 2:
                    System.out.println("\n" + "--------「Classes de Heróis」--------");
                    System.out.println("\n" + "--------「Mago」--------");
                    System.out.println("O Mago é um mestre das artes arcanas, capaz de manipular os elementos e lançar poderosos feitiços.");
                    System.out.println("Habilidade Especial: Invocação da Bola de Fogo - O mago conjura uma enorme esfera flamejante que incinera todos os inimigos em seu caminho." + "\n");
                    System.out.println("--------「Monge」--------");
                    System.out.println("O Monge é um guerreiro disciplinado que domina técnicas de combate corpo a corpo e movimentos ágeis.");
                    System.out.println("Habilidade Especial: Rajada de Golpes - O monge executa uma sequência de ataques rápidos, atingindo o inimigo várias vezes em um único turno." + "\n");
                    break;
                case 3:
                    System.out.println("\n" + "--------「Classes de Monstros」--------");
                    System.out.println("\n" + "--------「Esqueleto」--------");
                    System.out.println("Criatura reanimada por magia sombria, são bem frageis portanto você nunca encontra um esqueleto andando sozinho." + "\n");
                    System.out.println("--------「Cultista」--------");
                    System.out.println("Devoto de forças obscuras, o Cultista utiliza rituais para enfraquecer seus inimigos e podem invocar esqueletos e outras criaturas das trevas." + "\n");
                    break;
                case 4:
                    System.out.println("--------「Ate uma proxima aventura」--------");
                    InputManager.fecharScanner();
                    System.exit(0);
            }
        }
    }

    public static void PosTurno(Heroi heroi, Arma arma) {
        while(true) {  
            System.out.println("==================================");
            System.out.println("[1] Interagir com o Loot");
            System.out.println("[2] Ver Informações do Personagem");
            System.out.println("[3] Desistir do jogo");
            System.out.println("==================================");
            
            numEscolha = InputManager.LerInteiro("Digite um Numero entre:", 1, 3);
            
            switch (numEscolha) {
                case 1:
                    if (arma == null) {
                        System.out.println("O monstro não deixou nada para trás");
                        break;
                    }
                    else {
                        System.out.println("\n" + "Nome da arma: " + arma.getNome());
                        System.out.println("Dano: " + arma.getDano());
                        System.out.println("Nivel Minimo do Heroi: " + arma.getminNivel() + "\n");
                        System.out.println("==================================");
                        boolean SimNao = InputManager.lerSimNao("Deseja equipar a arma?");
                        if (SimNao) {
                            heroi.equiparArma(arma);
                        }
                        else {
                            System.out.println("\n" + "Arma não equipada");
                        }
                        break;
                    }
                case 2:
                    System.out.println("--------STATUS DO HEROI--------\n");
                    heroi.exibirStatus();
                    break;
                case 3:
                    InputManager.fecharScanner();
                    System.out.println("\n" + "--------「Ate uma proxima aventura」--------");
                    System.exit(0);
            }
        }
    }
}

