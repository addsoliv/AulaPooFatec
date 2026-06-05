package Lista2;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        double valor = sc.nextDouble();

        if (valor >= 100) {
            valor = valor - (valor * 0.10); // Desconto de 10%
        }
        
        System.out.println("Valor final: " + valor);
        sc.close();
    }
}