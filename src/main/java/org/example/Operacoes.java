package org.example;

import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {
        int n1;
        int n2;

        Scanner ler = new Scanner(System.in);

        System.out.println("INSIRA O NUMERO 1: ");
        n1 = ler.nextInt();
        System.out.println("INSIRA O NUMERO 2: ");
        n2 = ler.nextInt();

        int soma = n1 + n2;
        int subtracao = n1 - n2;
        int multiplicacao = n1 * n2;
        int divisao = n1 /  n2;

        System.out.println("A SOMA DOS DOIS NUMEROS EH: " + soma);
        System.out.println("A SUBTRACAO DOS DOIS NUMEROS EH: " + subtracao);
        System.out.println("A MULTIPLICACAO DOS DOIS NUMEROS EH: " + multiplicacao);
        System.out.println("A DIVISAO DOS DOIS NUMEROS EH: " + divisao);

    }
}
