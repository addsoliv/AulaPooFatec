package Lista3;

import java.util.Scanner;

public class exercício9 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite um número para o fatorial: ");
			int n = scanner.nextInt();
			long fat = 1;

			for (int i = 1; i <= n; i++) {
			    fat *= i;
			}
			System.out.println(n + "! = " + fat);
		}
    }
}