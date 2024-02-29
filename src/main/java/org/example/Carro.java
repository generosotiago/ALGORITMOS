package org.example;

public class Carro {
    public static void main(String[] args) {

        double vlCarro = 20000;
        double vendedor = vlCarro * 0.25;
        double impostos = vlCarro * 0.45;

        double vLfinal = vlCarro + vendedor + impostos;

        System.out.println("o valor final do carro eh " + vLfinal);

    }
}
