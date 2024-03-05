package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculoVenda {
    public static void main(String[] args) {
        int valorFixo = 800;
        int bonus = 50;


        int qtdSoftware;
        System.out.println("INFORME QUANTOS SOFTWARES FORAM VENDIDOS: ");
        Scanner ler = new Scanner(System.in);
        qtdSoftware = ler.nextInt();

        int vlBonus = qtdSoftware * bonus;
        System.out.println();

        int vlTotal = vlBonus + valorFixo;

        System.out.println("O SALARIO FIXO EH: " + valorFixo);
        System.out.println("O VALOR DO BONUS EH " + vlBonus);
        System.out.println("O VALOR DO SALARIO TOTAL EH: " + vlTotal);
    }
}
