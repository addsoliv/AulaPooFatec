package Jogos;

import java.util.Random;
import java.util.Scanner;

public class CofreMisterioso {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continuar = true;
        int pontuacaoTotal = 0;

        System.out.println("Bem-vindo ao Cofre Misterioso!");

        // while para manter o jogo ativo
        while (continuar) {
            int maxIntervalo = escolherDificuldade(scanner);
            int secreto = random.nextInt(maxIntervalo) + 1;
            boolean cofreAberto = false;
            int maxTentativas = 5;

            // for para controlar tentativas
            for (int tent = maxTentativas; tent > 0; tent--) {
                System.out.printf("\nTentativa %d/%d - Seu palpite: ", (maxTentativas - tent + 1), maxTentativas);
                int palpite = lerInteiroValido(scanner);

                if (palpite == secreto) {
                    System.out.println("Acertou! Cofre aberto. Código: " + secreto);
                    pontuacaoTotal += 10;
                    cofreAberto = true;
                    break; 
                } else {
                    if (palpite > secreto) {
                        System.out.println("O código é MENOR. Restam " + (tent - 1) + " tentativas.");
                    } else {
                        System.out.println("O código é MAIOR. Restam " + (tent - 1) + " tentativas.");
                    }
                    pontuacaoTotal -= 2;
                    if (pontuacaoTotal < 0) pontuacaoTotal = 0; // Pontuação mínima é 0
                }
            }

            if (!cofreAberto) {
                System.out.println("\nTentativas esgotadas! O código secreto era: " + secreto);
            }

            System.out.println("Pontuação atual: " + pontuacaoTotal);

            // do-while para validar resposta jogar novamente (s/n)
            String resposta;
            do {
                System.out.print("Deseja jogar novamente? (s/n): ");
                resposta = scanner.nextLine().trim().toLowerCase();
                if (!resposta.equals("s") && !resposta.equals("n")) {
                    System.out.println("Entrada inválida. Digite 's' ou 'n'.");
                }
            } while (!resposta.equals("s") && !resposta.equals("n"));

            if (resposta.equals("n")) {
                continuar = false;
            }
        }

        System.out.println("\nFim do jogo. Pontuação final: " + pontuacaoTotal);
        scanner.close();
    }

    private static int escolherDificuldade(Scanner scanner) {
        int opcao = 0;
        boolean valido = false;
        while (!valido) {
            System.out.print("\nEscolha a dificuldade [1-Fácil(20) | 2-Médio(50) | 3-Difícil(100)]: ");
            opcao = lerInteiroValido(scanner);
            if (opcao >= 1 && opcao <= 3) {
                valido = true;
            } else {
                System.out.println("Opção inválida. Escolha 1, 2 ou 3.");
            }
        }
        
        if (opcao == 1) return 20;
        if (opcao == 2) return 50;
        return 100;
    }

    // Garante que o programa não quebre com letras (validação de entrada não numérica)
    private static int lerInteiroValido(Scanner scanner) {
        while (true) {
            try {
                String entrada = scanner.nextLine().trim();
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida! Digite apenas números: ");
            }
        }
    }
}