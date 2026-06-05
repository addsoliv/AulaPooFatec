package Lista4;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nValores únicos:");
        for (int i = 0; i < numeros.length; i++) {
            boolean duplicado = false;
            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) {
                    duplicado = true;
                    break;
                }
            }
            if (!duplicado) {
                System.out.println(numeros[i]);
            }
        }
        sc.close();
    }
}