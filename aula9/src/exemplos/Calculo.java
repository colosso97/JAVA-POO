package exemplos;

public class Calculo {
	public static void main(String[] args) {
		int num1 = 10, num2 = 50;
		
		//boolean resposta = num1 == num2;
		String resultado;
		
		if (num1 > num2) {
			System.out.println("O maior n° é:"+num1);
		} else {
			System.out.println("O maior n° é:"+num2);
		}
		
		resultado = ((num1 > num2)?"O maior é o primeiro"+num1 : "O maior n° é o segundo"+num2);
		System.out.println(resultado);
	}
	
}
