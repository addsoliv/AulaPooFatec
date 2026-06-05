package Lista4;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Digite um valor X para buscar: ");
        int x = sc.nextInt();
        int ocorrencias = 0;

        for (int num : numeros) {
            if (num == x) ocorrencias++;
        }

        System.out.println("O valor " + x + " aparece " + ocorrencias + " vezes.");
        sc.close();
    }
}