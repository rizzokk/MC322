package com.rpg.exceptions;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.rpg.personagem.Monge;
import com.rpg.personagem.Esqueleto;
import com.rpg.exceptions.VerificarMonge;
import com.rpg.exceptions.VerificarEsqueleto;

public class ExcecoesTest {

    @Test
    public void testVerificarMonge_Excecao() {
        Monge monge = null;
        monge = VerificarMonge.VerificarExistencia(monge);
        assertNotNull(monge);
    }

    @Test
    public void testVerificarEsqueleto_Excecao() {
        Esqueleto esqueleto = null;
        esqueleto = VerificarEsqueleto.VerificarExistencia(esqueleto);
        assertNotNull(esqueleto);
    }
}