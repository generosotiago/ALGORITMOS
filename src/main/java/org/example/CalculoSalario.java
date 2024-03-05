package org.example;

import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        int salarioBruto;

        Scanner ler = new Scanner(System.in);

        System.out.println("DIGITE O VALOR DO SALARIO BRUTO: ");
        salarioBruto = ler.nextInt();

        double inss = salarioBruto * 0.9;
        double vlLiquido = salarioBruto - inss;

        System.out.println("O VALOR BRUTO EH: " + salarioBruto);
        System.out.println("O VALOR DESCONTADO EH: " + inss);
        System.out.println("O VALOR LIQUIDO EH: " + vlLiquido);
    }
}
