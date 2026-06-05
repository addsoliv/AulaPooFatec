package Lista3;

import java.util.Scanner;

public class exercício8 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Quantos números deseja informar? ");
			int qtd = scanner.nextInt();
			double soma = 0;

			for (int i = 1; i <= qtd; i++) {
			    System.out.print("Digite o " + i + "º valor: ");
			    soma += scanner.nextDouble();
			}
			System.out.println("A média é: " + (soma / qtd));
		}
    }
}