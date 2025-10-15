package com.rpg.exceptions;

import java.lang.Exception;
import com.rpg.personagem.*;

public class VerificarEsqueleto {
    public static Esqueleto VerificarExistencia(Esqueleto alvo) {
        try {
            String nome = alvo.getNome();
            return alvo;
        } 
        catch (NullPointerException e ) {
            System.out.println("O Monstro não existia, então foi criado um novo Monstro da classe Monstro de nivel Dificuldade FACIL");
            alvo = new Esqueleto("Esqueleto", 25, 1, 50);
            return alvo;
        }
    }
}
