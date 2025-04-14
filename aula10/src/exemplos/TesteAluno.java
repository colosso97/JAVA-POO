package exemplos;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno a1 = new Aluno(); 
		Aluno a2 = new Aluno(); 
		
		//referencia de aluno
		Aluno a3 = new Aluno(); 
		Aluno a4 = a3;
		
		System.out.println(a3);
		System.out.println(a4);
		if (a3==a4) {
			System.out.println("São iguais");
		}else {
			System.out.println("São diferentes");
		}
		a1.matricula = 10;
		a1.nome = "Marcelo";
		a1.telefone = "324343";
		
		a2.nome = "Roni";
		
		System.out.println(a1.nome);
		System.out.println(a2.nome);
	}

}
