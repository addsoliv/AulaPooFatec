package Lista4;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[] somaLinhas = new int[3];
        int[] somaColunas = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                
                somaLinhas[i] += matriz[i][j];
                somaColunas[j] += matriz[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Soma da Linha " + i + ": " + somaLinhas[i]);
        }
        for (int j = 0; j < 3; j++) {
            System.out.println("Soma da Coluna " + j + ": " + somaColunas[j]);
        }
        sc.close();
    }
}