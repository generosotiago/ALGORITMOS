package org.example;

public class Valores {
    public static void main(String[] args) {
        double productValue = 1000;
        double fivePercent = productValue * 0.05;
        double parcela = fivePercent + productValue / 3;
        double discountValue = productValue - fivePercent;
        System.out.println("O VALOR DE CADA PARCELA EH DE " + parcela);
        System.out.println("O VALOR EM DUAS PARCELAS EH DE " + productValue / 2 );
        System.out.println("O VALOR COM 5% DE DESCONTO EH " + discountValue);
    }
}
