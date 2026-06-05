package Lista2;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o salário: ");
        double salario = sc.nextDouble();
        double imposto = 0;

        if (salario <= 2000) {
            System.out.println("Isento de imposto.");
        } else if (salario >= 2001 && salario <= 5000) {
            imposto = salario * 0.10;
            System.out.println("Imposto a pagar: " + imposto);
        } else {
            imposto = salario * 0.20;
            System.out.println("Imposto a pagar: " + imposto);
        }
        sc.close();
    }
}