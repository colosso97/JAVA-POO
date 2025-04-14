package exemplos;

import java.util.Iterator;

public class ExercicioAula {
		public static void main(String[] args) {
			
//			Faça um programa que percorra todos os número de 1 até 22. 
//			Para os números múltiplos de 2, imprima a palavra “Java”, 
//			e mostre o total de múltiplos de 2 encontrado.
			int i;
			int total = 0;
			for (i = 1; i <= 22; i++) {
				if (i % 2 == 0) {
					total++;
					System.out.println("Java");
					System.out.println("teste");
				}

			}
			System.out.println("Total de pares"+total);
		}
		
}
