package Lista2;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tentativas = 0;
        boolean sucesso = false;

        while (tentativas < 3) {
            System.out.print("Utilizador: ");
            String user = sc.nextLine();
            System.out.print("Palavra-passe: ");
            String pass = sc.nextLine();

            if (user.equals("admin") && pass.equals("1234")) {
                System.out.println("Acesso permitido!");
                sucesso = true;
                break;
            } else {
                tentativas++;
                System.out.println("Acesso negado. Tentativas restantes: " + (3 - tentativas));
            }
        }

        if (!sucesso) {
            System.out.println("Conta bloqueada");
        }
        sc.close();
    }
}