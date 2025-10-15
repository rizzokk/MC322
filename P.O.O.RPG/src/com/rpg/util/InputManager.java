package com.rpg.util;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputManager {
    
    private static final Scanner scanner = new Scanner(System.in);
    
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


    public static String lerString(String mensagem) {
        while (true) {
            System.out.print(mensagem + ": ");
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Entrada vazia. Por favor, digite um texto.");
        }
    }

    public static boolean lerSimNao(String mensagem){
        while (true) {
            System.out.print(mensagem + " (s/n): ");
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("s")) {
                return true;
            } else if (input.equals("n")) {
                return false;
            }
            System.out.println("Entrada invalida. Por favor, digite 's' ou 'n'.");
        }
    }

    public static void esperarEnter(){
        System.out.print("Pressione ENTER para continuar...");
        scanner.nextLine();
    }

    public static void fecharScanner(){
    scanner.close();
    }

}
