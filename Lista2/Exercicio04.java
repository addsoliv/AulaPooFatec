package Lista2;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("O maior é: " + n1);
        } else if (n2 > n1) {
            System.out.println("O maior é: " + n2);
        } else {
            System.out.println("Os números são iguais.");
        }
        sc.close();
    }
}