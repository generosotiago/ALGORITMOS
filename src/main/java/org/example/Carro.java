package org.example;

import java.util.Scanner;

public class Carro {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double vlCarro;

        System.out.println("QUAL O VALOR DE FABRICA DO CARRO: ");
        vlCarro = ler.nextInt();

        double vendedor = vlCarro * 0.25;
        double impostos = vlCarro * 0.45;

        double vLfinal = vlCarro + vendedor + impostos;

        System.out.println("o valor final do carro eh " + vLfinal);

    }
}
