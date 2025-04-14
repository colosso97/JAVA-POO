package exercicios;

public class Pessoa {
	//modificador de acesso padrão
	private	int id;
	private	String nome;
	private	double peso, altura;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		}else {
			System.out.println("Você Digitou um valor invalido!");
		}

	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	private double calcularIMC() {
		return peso / (altura * altura);
	}
	
	public String resultado() {
		
		
		if (calcularIMC() < 18.5) {
			return"abaixo do peso";
		}else if(calcularIMC() <= 24.9){
			return "no peso certo";
		}else {
			return"acima do peso";
		}
	}
}
