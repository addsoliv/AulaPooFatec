package Lista3;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, soma = 0;

        do {
            System.out.print("Digite um número (0 para sair): ");
            num = scanner.nextInt();
            soma += num;
        } while (num != 0);

        System.out.println("Soma total: " + soma);
    }
}