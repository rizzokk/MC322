package com.rpg.personagem;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CombatenteTest {

    @Test
    public void testHeroiReceberDano() {
        Heroi heroi = new Monge("Shang Chi", 100, 20, 1, 0);
        heroi.receberDano(30);
        assertEquals(70, heroi.getPontosDeVida());
    }

    @Test
    public void testMonstroLootavel() {
        Monstro monstro = new Esqueleto("Esqueleto", 50, 10, 20);
        assertNotNull(monstro.droparLoot());
    }
}