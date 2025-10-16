package com.rpg.cenario;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.rpg.personagem.Monstro;
import com.rpg.personagem.Esqueleto;


public class DificuldadeTest {

    @Test
    public void testDificuldadeAumentaPontosDeVida() {
        Monstro monstroFacil = new Esqueleto("Esqueleto", 50, 10, 20);
        Monstro monstroDificil = new Esqueleto("Esqueleto", 100, 20, 40);
        assertTrue(monstroDificil.getPontosDeVida() > monstroFacil.getPontosDeVida());
    }
}