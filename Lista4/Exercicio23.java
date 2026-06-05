package Lista4;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] rotacionada = new int[3][3];

        System.out.println("Digite a matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
                rotacionada[j][2 - i] = matriz[i][j]; // Fórmula para rotação de 90° à direita
            }
        }

        System.out.println("\nMatriz Rotacionada (90 graus):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(rotacionada[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}