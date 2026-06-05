package Lista2;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = sc.next().charAt(0);
        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        switch (operacao) {
            case '+': System.out.println("Resultado: " + (n1 + n2)); break;
            case '-': System.out.println("Resultado: " + (n1 - n2)); break;
            case '*': System.out.println("Resultado: " + (n1 * n2)); break;
            case '/': 
                if (n2 != 0) System.out.println("Resultado: " + (n1 / n2));
                else System.out.println("Erro: Divisão por zero.");
                break;
            default: System.out.println("Operação inválida.");
        }
        sc.close();
    }
}