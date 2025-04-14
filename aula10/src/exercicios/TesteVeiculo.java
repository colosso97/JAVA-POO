package exercicios;

public class TesteVeiculo {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo();
		veiculo.placa = "KYC-3430";
		veiculo.tipo = "Gasolina";
		veiculo.valor = 90000;
		
		System.out.println("O valor do IPVA é:" + veiculo.calcularIPVA());
		
		//inferência
		var texto = "Aula de java";
		var aula = veiculo;
		
		
		String nome = "Antõnio";
		int idade = 50;
		double altura = 1.59;
		
		System.out.printf("%s tem %d anos e %.2f de altura", nome, idade, altura);
	}

}