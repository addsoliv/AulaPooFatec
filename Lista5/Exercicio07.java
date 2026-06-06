package Lista5;

public class Exercicio07 {
    public static void mostrarNumeros() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void mostrarPares() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void mostrarImpares() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Todos os números:");
        mostrarNumeros();
        
        System.out.println("\nNúmeros pares:");
        mostrarPares();
        
        System.out.println("\nNúmeros ímpares:");
        mostrarImpares();
    }
}