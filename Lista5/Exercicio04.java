package Lista5;

import java.util.Scanner;

public class Exercicio04 {
    public static double lerNota(Scanner scanner, int indice) {
        System.out.print("Digite a nota " + indice + ": ");
        return scanner.nextDouble();
    }

    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3.0;
    }

    public static String verificarSituacao(double media) {
        if (media >= 6.0) {
            return "Aprovado";
        } else if (media >= 4.0) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public static void mostrarResultado(double media, String situacao) {
        System.out.printf("Média: %.2f\n", media);
        System.out.println("Situação: " + situacao);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double n1 = lerNota(scanner, 1);
        double n2 = lerNota(scanner, 2);
        double n3 = lerNota(scanner, 3);
        
        double media = calcularMedia(n1, n2, n3);
        String situacao = verificarSituacao(media);
        mostrarResultado(media, situacao);
        
        scanner.close();
    }
}