package Lista4;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] controle = new int[9]; // Para guardar os números e verificar duplicatas
        int index = 0;
        boolean temRepetido = false;

        System.out.println("Digite os 9 valores da matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int valor = sc.nextInt();
                
                // Verifica se já existe
                for (int k = 0; k < index; k++) {
                    if (controle[k] == valor) {
                        temRepetido = true;
                    }
                }
                controle[index++] = valor;
            }
        }

        if (temRepetido) System.out.println("A matriz POSSUI números repetidos.");
        else System.out.println("Sudoku Válido! A matriz NÃO possui números repetidos.");
        sc.close();
    }
}