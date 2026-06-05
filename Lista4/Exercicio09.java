package Lista4;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        Arrays.sort(numeros); // Método prático do Java para ordenar arrays

        System.out.println("\nArray ordenado:");
        for (int num : numeros) {
            System.out.println(num);
        }
        sc.close();
    }
}