package com.rpg.util;

import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InputManagerTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    private void provideInput(String data) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
    }

    @BeforeEach
    void setupInput() {
        provideInput("s\nSim\n");
        InputManager.reinicializarScanner(System.in);
    }

    @Test
    public void testLerString_ValidInput() {
        provideInput("Sim\n");
        InputManager.reinicializarScanner(System.in);
        String resultado = InputManager.lerString("Digite uma palavra");
        assertEquals("Sim", resultado);
    }

    @Test
    public void testLerSimNao_ValidInput() {
        boolean resultado = InputManager.lerSimNao("Deseja continuar?");
        assertTrue(resultado);
    }
}