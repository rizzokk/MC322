package com.rpg.util;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputManager {
    
    public static int LerInteiro (String mensagem, int min, int max) {
        while (true) {
            System.out.print(mensagem + " (" + min + " - " + max + "): ");
            String input = null;
            try {
                input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    System.out.println("Entrada vazia. Digite um numero entre " + min + " e " + max + ".");
                    continue;
                }
            
            int valor = Integer.parseInt(input);
            if (valor < min || valor > max) {
                System.out.println("Fora do intervalo. Digite um numero entre " + min + " e " + max + ".");
                continue;
            }
            
            return valor;
        } catch (NumberFormatException e) {
            System.out.println("Valor invalido. Digite um numero inteiro.");
        } catch (NoSuchElementException e) {
            throw new RuntimeException("Entrada nao disponivel.", e);
        }
    }
}

    public static String lerString(String mensagem){}

    public static boolean lerSimNao(String mensagem){}

    public static void esperarEnter(String mensagem){}

    public static void fecharScanner(){}

}
