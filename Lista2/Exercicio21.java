package Lista2;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 0.0;
        
        System.out.println("--- LOGIN ---");
        System.out.print("Utilizador: ");
        String user = sc.nextLine();
        System.out.print("Palavra-passe: ");
        String pass = sc.nextLine();

        if (user.equals("admin") && pass.equals("1234")) {
            System.out.println("Login efetuado com sucesso!");
            
            while (true) {
                System.out.println("\n--- MENU ---");
                System.out.println("1 - Ver saldo");
                System.out.println("2 - Depositar");
                System.out.println("3 - Sacar");
                System.out.println("4 - Sair");
                System.out.print("Escolha uma opção: ");
                int opcao = sc.nextInt();

                if (opcao == 4) {
                    System.out.println("Sessão encerrada.");
                    break;
                }

                switch (opcao) {
                    case 1:
                        System.out.println("Saldo atual: " + saldo);
                        break;
                    case 2:
                        System.out.print("Valor a depositar: ");
                        double deposito = sc.nextDouble();
                        if(deposito > 0) {
                            saldo += deposito;
                            System.out.println("Depósito realizado com sucesso!");
                        } else {
                            System.out.println("Valor inválido.");
                        }
                        break;
                    case 3:
                        System.out.print("Valor a sacar: ");
                        double saque = sc.nextDouble();
                        if (saque > 0 && saque <= saldo) {
                            saldo -= saque;
                            System.out.println("Saque realizado com sucesso!");
                        } else if (saque > saldo) {
                            System.out.println("Erro: Não há saldo suficiente.");
                        } else {
                            System.out.println("Valor inválido.");
                        }
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            }
        } else {
            System.out.println("Acesso negado.");
        }
        sc.close();
    }
}