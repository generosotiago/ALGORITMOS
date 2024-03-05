package org.example;

import java.util.Scanner;

public class LerSalario {
    public static void main(String[] args) {
        int salario = 800;
        int valorVenda;

        Scanner ler = new Scanner(System.in);
        System.out.println("QUAL O VALOR DAS VENDAS?: ");
        valorVenda = ler.nextInt();

        double comissao = valorVenda * 0.15;
        double valorFinal = comissao + salario;


        System.out.println("O SALARIO FIXO EH: " + salario);
        System.out.println("O VALOR DA COMISSAO EH DE: " + comissao);
        System.out.println("O VALOR TOTAL NO MES EH DE " + valorFinal);
    }
}
