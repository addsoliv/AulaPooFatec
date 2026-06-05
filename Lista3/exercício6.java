package Lista3;

import java.util.Scanner;

public class exercício6 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int maior = Integer.MIN_VALUE;

			for (int i = 1; i <= 5; i++) {
			    System.out.print("Digite o " + i + "º número: ");
			    int num = scanner.nextInt();
			    if (num > maior) {
			        maior = num;
			    }
			}
			System.out.println("O maior número digitado foi: " + maior);
		}
    }
}