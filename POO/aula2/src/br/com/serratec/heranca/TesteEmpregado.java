
package br.com.serratec.heranca;

public class TesteEmpregado {

	public static void main(String[] args) {
		//Polimorfismo
		Gerente gerente = new Gerente("Carla","c@gmail.com","2222",10, 5500.); 
		Diretor diretor = new Diretor("Carlos", "ca@gmail.com", "233" ,"ADM",9000.);
		
		System.out.println(gerente.getNome() + "-"+ gerente.getEmail());
		System.out.println(gerente.getNumEmpregadoGerenciados());
		
		gerente.aumentarSalario(10.);
		diretor.aumentarSalario(10.);
		
		System.out.println("Novo Salário:" + gerente.getSalario());
		System.out.println("Novo Salário:" + diretor.getSalario());
	
		System.out.println(gerente.toString());
		System.out.println(diretor);
	
	}
	

}
