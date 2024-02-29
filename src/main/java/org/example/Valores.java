package org.example;

public class Valores {
    public static void main(String[] args) {
        double productValue = 1000;
        double fivePercent = productValue * 0.05;
        int i = 3;
        double parcela = fivePercent + productValue / i;
        System.out.print("o valor de cada parcela eh de ");
        System.out.println(parcela);
        System.out.print("O VALOR EM DUAS PARCELAS EH DE " );
        System.out.println(productValue / 2);
        System.out.print("O VALOR COM 5% DE DESCONTO EH ");
        System.out.println(productValue - fivePercent);


    }
}
