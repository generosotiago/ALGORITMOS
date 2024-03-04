package org.example;

import java.util.Scanner;
public class Nomes {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome1;
        String nome2;
        String nome3;

        System.out.println("LER NOME 1: ");
        nome1 = ler.nextLine();
        System.out.println("LER NOME 2: ");
        nome2 = ler.nextLine();
        System.out.println("LER NOME 3");
        nome3 = ler.nextLine();

        System.out.println("OS NOMES SÃO: " + nome1 + ", " + nome2 + " e " + nome3);
    }
}
