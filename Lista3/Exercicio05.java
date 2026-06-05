package Lista3;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite um número: ");
			int num = scanner.nextInt();
			
			for (int i = 1; i <= 10; i++) {
			    System.out.println(num + " x " + i + " = " + (num * i));
			}
		}
    }
}