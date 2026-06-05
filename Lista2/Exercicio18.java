package Lista2;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (true) {
            System.out.println("1 - Somar | 2 - Subtrair | 3 - Sair");
            System.out.print("Escolha a opção: ");
            opcao = sc.nextInt();

            if (opcao == 3) {
                System.out.println("A sair...");
                break;
            }

            System.out.print("Digite dois números: ");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            switch (opcao) {
                case 1: System.out.println("Soma: " + (n1 + n2)); break;
                case 2: System.out.println("Subtração: " + (n1 - n2)); break;
                default: System.out.println("Opção inválida.");
            }
        }
        sc.close();
    }
}