package Lista4;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			char[][] tabuleiro = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
			char jogador = 'X';
			int jogadas = 0;

			while (jogadas < 9) {
			    // Imprimir tabuleiro
			    System.out.println("\nTabuleiro:");
			    for (int i = 0; i < 3; i++) {
			        System.out.println(" " + tabuleiro[i][0] + " | " + tabuleiro[i][1] + " | " + tabuleiro[i][2]);
			        if (i < 2) System.out.println("---|---|---");
			    }

			    System.out.println("Jogador " + jogador + ", digite linha e coluna (0 a 2): ");
			    int l = sc.nextInt();
			    int c = sc.nextInt();

			    if (l < 0 || l > 2 || c < 0 || c > 2 || tabuleiro[l][c] != ' ') {
			        System.out.println("Jogada inválida! Tente novamente.");
			        continue;
			    }

			    tabuleiro[l][c] = jogador;
			    jogadas++;

			    // Checar vitória (simples)
			    boolean venceu = false;
			    for (int i = 0; i < 3; i++) {
			        if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) venceu = true;
			        if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) venceu = true;
			    }
			    if ((tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
			        (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador)) venceu = true;

			    if (venceu) {
			        System.out.println("O Jogador " + jogador + " venceu!");
			        return; // Encerra o jogo
			    }

			    jogador = (jogador == 'X') ? 'O' : 'X';
			}
			System.out.println("Deu velha! Empate.");
			sc.close();
		}
    }
}