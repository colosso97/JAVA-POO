package apostila;

public class Exercicio2 {
    public static void main(String[] args) {
        for (int numero = 1; numero < 11; numero++) {
            int fatorial = 1;

            for (int i = numero; i > 0; i--) { 
                fatorial *= i; 
            }

            System.out.println("O fatorial de " + numero + " é: " + fatorial); 
        }
    }
}