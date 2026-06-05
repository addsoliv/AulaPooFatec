package Lista2;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do saque: ");
        int valor = sc.nextInt();

        System.out.println("Notas entregues:");
        System.out.println(valor / 100 + " notas de 100"); valor %= 100;
        System.out.println(valor / 50 + " notas de 50");  valor %= 50;
        System.out.println(valor / 20 + " notas de 20");  valor %= 20;
        System.out.println(valor / 10 + " notas de 10");  valor %= 10;
        System.out.println(valor / 5 + " notas de 5");    valor %= 5;
        System.out.println(valor / 2 + " notas de 2");    valor %= 2;
        System.out.println(valor + " notas de 1");
        
        sc.close();
    }
}