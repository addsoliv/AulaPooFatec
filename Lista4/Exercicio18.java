package Lista4;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat1 = new int[3][3];
        int[][] mat2 = new int[3][3];
        int[][] matSoma = new int[3][3];

        System.out.println("Preenchendo a PRIMEIRA matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Preenchendo a SEGUNDA matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat2[i][j] = sc.nextInt();
                matSoma[i][j] = mat1[i][j] + mat2[i][j]; // Soma no mesmo loop
            }
        }

        System.out.println("\nMatriz Soma:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matSoma[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}