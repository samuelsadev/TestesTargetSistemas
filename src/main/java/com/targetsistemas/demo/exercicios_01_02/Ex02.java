package com.targetsistemas.demo.exercicios_01_02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        //2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será
        // a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
        // escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência
        // de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um numero para verificar se ele pertence a sequencia de Fibonacci: ");
        int numero = scanner.nextInt();
        int a = 0;
        int b = 1;

        if (numero == a || numero == b) {
            System.out.println("O numero " + numero + " pertence a sequencia de Fibonacci.");
        } else {
            int c = a + b;
            boolean pertence = false;

            while (c <= numero) {
                if (c == numero) {
                    pertence = true;
                    break;
                }
                a = b;
                b = c;
                c = a + b;
            }

            if (pertence) {
                System.out.println("O numero " + numero + " pertence a sequencia de Fibonacci.");
            } else {
                System.out.println("O numero " + numero + " não pertence a sequencia de Fibonacci.");
            }
        }
        scanner.close();
    }
}
