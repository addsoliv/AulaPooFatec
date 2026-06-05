package Lista3;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			int num;

			do {
			    System.out.print("Digite um número entre 1 e 10: ");
			    num = scanner.nextInt();
			} while (num < 1 || num > 10);

			System.out.println("Número válido: " + num);
		}
    }
}