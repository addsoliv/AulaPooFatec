package Jogos;

import java.util.Scanner;

public class AdivinhacaoDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secreto = (int) (Math.random() * 100) + 1;
        int limiteTentativas = 10;
        int tentativas = 0;
        boolean acertou = false;

        System.out.println("=== JOGO DA ADIVINHAÇÃO ===");

        do {
            int palpite = 0;
            boolean entradaValida = false;

            while (!entradaValida) {
                System.out.print("\nTentativa " + (tentativas + 1) + " de " + limiteTentativas + " - Digite seu palpite: ");
                if (scanner.hasNextInt()) {
                    palpite = scanner.nextInt();
                    if (palpite >= 1 && palpite <= 100) {
                        entradaValida = true;
                    } else {
                        System.out.println("Atenção: Palpite fora do intervalo! Digite um número entre 1 e 100.");
                    }
                } else {
                    System.out.println("Atenção: Entrada inválida! Digite apenas números.");
                    scanner.next();
                }
            }

            tentativas++;

            if (palpite == secreto) {
                System.out.println("Você acertou!");
                acertou = true;
            } else if (palpite > secreto) {
                System.out.println("O número secreto é menor!");
            } else {
                System.out.println("O número secreto é maior!");
            }

        } while (tentativas < limiteTentativas && !acertou); // Condição checada no final

        if (!acertou) {
            System.out.println("\nFim de jogo! O número secreto era: " + secreto);
        }

        scanner.close();
    }
}