package Lista2;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Utilizador: ");
        String usuario = sc.nextLine();
        System.out.print("Palavra-passe: ");
        String senha = sc.nextLine();

        if (usuario.equals("admin") && senha.equals("1234")) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }
        sc.close();
    }
}