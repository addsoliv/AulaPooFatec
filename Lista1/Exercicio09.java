package Lista1;

public class Exercicio09 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        System.out.println("Antes da troca: a=" + a + ", b=" + b);
        
        // Variável temporária para guardar o valor de 'a'
        int aux = a; 
        a = b;
        b = aux;
        
        System.out.println("Depois da troca: a=" + a + ", b=" + b);
    }
}