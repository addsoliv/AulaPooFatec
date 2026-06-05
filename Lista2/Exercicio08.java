package Lista2;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite três números: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int maior = n1;
        if (n2 > maior) maior = n2;
        if (n3 > maior) maior = n3;

        System.out.println("O maior número é: " + maior);
        sc.close();
    }
}