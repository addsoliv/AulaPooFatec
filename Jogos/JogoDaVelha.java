package Jogos;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] tabuleiro = new char[3][3];
        
        inicializarTabuleiro(tabuleiro);
        char jogadorAtual = 'X';
        boolean jogoAtivo = true;
        int jogadasFeitas = 0;

        System.out.println("=== JOGO DA VELHA ===");

        // Usar while para o loop principal da partida
        while (jogoAtivo) {
            imprimirTabuleiro(tabuleiro);
            System.out.println("Vez do jogador " + jogadorAtual);
            
            realizarJogada(scanner, tabuleiro, jogadorAtual);
            jogadasFeitas++;

            // Usar if/else para validação e detecção de vitória/empate
            if (verificarVitoria(tabuleiro, jogadorAtual)) {
                imprimirTabuleiro(tabuleiro);
                System.out.println("Parabéns! O jogador " + jogadorAtual + " venceu!");
                jogoAtivo = false;
            } else if (verificarEmpate(jogadasFeitas)) {
                imprimirTabuleiro(tabuleiro);
                System.out.println("Deu velha! O jogo empatou.");
                jogoAtivo = false;
            } else {
                // Alterne o jogador (X -> O)
                if (jogadorAtual == 'X') {
                    jogadorAtual = 'O';
                } else {
                    jogadorAtual = 'X';
                }
            }
        }
        
        scanner.close();
    }

    private static void inicializarTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    private static void imprimirTabuleiro(char[][] tabuleiro) {
        System.out.println("\n  1   2   3 (Colunas)");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("  ---------");
        }
        System.out.println();
    }

    private static void realizarJogada(Scanner scanner, char[][] tabuleiro, char jogadorAtual) {
        boolean jogadaValida = false;

        while (!jogadaValida) {
            System.out.print("Digite a linha (1-3): ");
            int linha = lerEntradaNumerica(scanner);
            System.out.print("Digite a coluna (1-3): ");
            int coluna = lerEntradaNumerica(scanner);

            // Valide a jogada: estar entre 1 e 3, e casa não ocupada
            if (linha >= 1 && linha <= 3 && coluna >= 1 && coluna <= 3) {
                if (tabuleiro[linha - 1][coluna - 1] == ' ') {
                    tabuleiro[linha - 1][coluna - 1] = jogadorAtual;
                    jogadaValida = true;
                } else {
                    System.out.println("Esta casa já está ocupada! Tente novamente.");
                }
            } else {
                System.out.println("Posição inválida! Digite números entre 1 e 3.");
            }
        }
    }

    // Tratar entradas inválidas com mensagens claras, sem deixar quebrar
    private static int lerEntradaNumerica(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Digite apenas números: ");
            }
        }
    }

    private static boolean verificarVitoria(char[][] tab, char j) {
        // Verifica linhas e colunas
        for (int i = 0; i < 3; i++) {
            if ((tab[i][0] == j && tab[i][1] == j && tab[i][2] == j) || 
                (tab[0][i] == j && tab[1][i] == j && tab[2][i] == j)) {
                return true;
            }
        }
        // Verifica diagonais
        if ((tab[0][0] == j && tab[1][1] == j && tab[2][2] == j) || 
            (tab[0][2] == j && tab[1][1] == j && tab[2][0] == j)) {
            return true;
        }
        return false;
    }

    private static boolean verificarEmpate(int jogadasFeitas) {
        return jogadasFeitas == 9;
    }
}