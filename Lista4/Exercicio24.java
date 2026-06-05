package Lista4;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        System.out.println("Preencha a matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite um número para buscar: ");
        int x = sc.nextInt();
        boolean encontrou = false;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("O número " + x + " aparece na Linha " + i + ", Coluna " + j);
                    encontrou = true;
                }
            }
        }

        if (!encontrou) System.out.println("O número não foi encontrado na matriz.");
        sc.close();
    }
}