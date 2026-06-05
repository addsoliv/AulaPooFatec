package Lista3;

import java.util.Scanner;

public class exercício7 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int pos = 0, neg = 0;

			for (int i = 1; i <= 10; i++) {
			    System.out.print("Digite o " + i + "º número: ");
			    int num = scanner.nextInt();
			    if (num > 0) pos++;
			    else if (num < 0) neg++;
			}
			System.out.println("Positivos: " + pos + " | Negativos: " + neg);
		}
    }
}