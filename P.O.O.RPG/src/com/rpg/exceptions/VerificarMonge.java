package com.rpg.exceptions;

import java.lang.Exception;
import com.rpg.personagem.*;

public class VerificarMonge {
    public static Monge VerificarExistencia(Monge alvo) {
        try {
            String nome = alvo.getNome();
            return alvo;
        } 
        catch (NullPointerException e ) {
            System.out.println("O heroi não existia, então foi criado um novo heroi da classe monge de nivel 1");
            alvo = new Monge("Shang Chi", 100, 20, 1, 0);
            return alvo;
        }
    }
}

