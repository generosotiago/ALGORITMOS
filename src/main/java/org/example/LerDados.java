package org.example;

import java.util.Scanner;
public class LerDados {
    public static void main(String[] args) {
        String nome;
        int idade;
        double salario;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        nome = ler.nextLine();
        System.out.println("Digite a sua idade: ");
        idade = ler.nextInt();
        System.out.println("Digite o salario: ");
        salario = ler.nextDouble();

        System.out.println("O NOME EH " + nome);
        System.out.println("A IDADE EH " + idade);
        System.out.println("O SALARIO EH " + salario);
    }
}
