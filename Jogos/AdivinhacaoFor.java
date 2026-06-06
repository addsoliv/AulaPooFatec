package Jogos;

import java.util.Scanner;

public class AdivinhacaoFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     
        int secreto = (int) (Math.random() * 100) + 1;
        int limiteTentativas = 10;
        boolean acertou = false;

        System.out.println("=== JOGO DA ADIVINHAÇÃO ===");
        
        for (int tentativas = 1; tentativas <= limiteTentativas; tentativas++) {
            int palpite = 0;
            boolean entradaValida = false;

           
            while (!entradaValida) {
                System.out.print("\nTentativa " + tentativas + " de " + limiteTentativas + " - Digite seu palpite: ");
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

            if (palpite == secreto) {
                System.out.println("Você acertou!");
                acertou = true;
                break; 
            } else if (palpite > secreto) {
                System.out.println("O número secreto é menor!");
            } else {
                System.out.println("O número secreto é maior!");
            }
        }

        if (!acertou) {
            System.out.println("\nFim de jogo! O número secreto era: " + secreto);
        }

        scanner.close();
    }
}