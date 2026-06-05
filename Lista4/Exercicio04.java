package Lista4;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[6];
        double soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextDouble();
            soma += numeros[i];
        }

        System.out.println("A média é: " + (soma / numeros.length));
        sc.close();
    }
}