package com.targetsistemas.demo.exercicios_04_05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        //5) Escreva um programa que inverta os caracteres de um string.
        //
        //IMPORTANTE:
        //a) Essa string pode ser informada através de qualquer entrada
        // de sua preferência ou pode ser previamente definida no código;
        //b) Evite usar funções prontas, como, por exemplo, reverse;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a string para inverter:");
        String input = scanner.nextLine();
        scanner.close();
        String inverted = inverterString(input);
        System.out.println("String invertida: " + inverted);
    }

    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;
        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio++;
            fim--;
        }
        return new String(caracteres);
    }
}
