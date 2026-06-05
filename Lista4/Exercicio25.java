package Lista4;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaSecundaria = 0;

        System.out.println("Preencha a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
                
                // A condição para a diagonal secundária numa matriz de tamanho N é: i + j == N - 1
                if (i + j == 2) { 
                    somaSecundaria += matriz[i][j];
                }
            }
        }

        System.out.println("Soma da diagonal secundária: " + somaSecundaria);
        sc.close();
    }
}