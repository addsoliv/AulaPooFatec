package Lista3;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			int opcao;

			do {
			    System.out.println("\n--- MENU ---");
			    System.out.println("1 - Somar");
			    System.out.println("2 - Subtrair");
			    System.out.println("3 - Sair");
			    System.out.print("Escolha: ");
			    opcao = scanner.nextInt();

			    if (opcao == 1 || opcao == 2) {
			        System.out.print("Valor A: ");
			        int a = scanner.nextInt();
			        System.out.print("Valor B: ");
			        int b = scanner.nextInt();
			        
			        if (opcao == 1) System.out.println("Resultado: " + (a + b));
			        else System.out.println("Resultado: " + (a - b));
			    }
			} while (opcao != 3);
		}
        System.out.println("Programa encerrado.");
    }
}