package br.org.serratec;

import java.util.InputMismatchException;
import java.util.Scanner;

public class mainHora {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Parte 1: Frase em maiúsculas
        System.out.print("Digite uma palavra ou frase: ");
        String entrada = scanner.nextLine();
        System.out.println("Em maiúsculas: " + entrada.toUpperCase());

        // Parte 2: toUpperCase() com null
        String textoNulo = null;
        try {
            String resultado = textoNulo.toUpperCase();
            System.out.println("Resultado com null: " + resultado);
        } catch (NullPointerException e) {
            System.out.println("Erro: tentativa de usar toUpperCase() em uma variável null.");
        }

        // Parte 3: Leitura e validação de idade
        try {
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // <-- esta linha resolve o erro de leitura pendente

            if (idade < 0 || idade > 120) {
                throw new IllegalArgumentException("Idade inválida. Deve estar entre 0 e 120.");
            }

            System.out.println("Idade registrada: " + idade);
        } catch (InputMismatchException e) {
            System.out.println("Erro: idade deve ser um número inteiro.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}