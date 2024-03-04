package org.example;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner tiago = new Scanner(System.in);

        int idade;
        int numero;
        String nomeCompleto;

        System.out.println("INFORME A IDADE: " );
        idade = tiago.nextInt();
        System.out.println("INFORME O NUMERO: ");
        numero = tiago.nextInt();

        System.out.println("A IDADE EH " + idade + " ANOS");
        System.out.println("O NUMERO INFORMADO FOI: " + numero );

        System.out.println("INFORME O NOME COMPLETO: ");
        tiago.nextLine();
        nomeCompleto = tiago.nextLine();
        System.out.println("O NOME COMPLETO EH : " + nomeCompleto);


        ;

    }
}
