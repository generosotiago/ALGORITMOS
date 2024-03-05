package org.example;

import java.util.Scanner;

public class Avaliacao {
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;

        Scanner ler = new Scanner(System.in);

        System.out.println("DIGITE A NOTA 1: ");
        n1 = ler.nextInt();
        System.out.println("DIGITE A NOTA 2: ");
        n2 = ler.nextInt();
        System.out.println("DIGITE A NOTE 3: ");
        n3 = ler.nextInt();

        int prova1;
        int prova2;
        int prova3;

        prova1 = n1 * 2/10;
        prova2 = n2 * 3/10;
        prova3 = n3 * 5/10;

        int media = (prova1 + prova2 + prova3);

        System.out.println("A MEDIA FINAL EH: " + media );

    }
}
