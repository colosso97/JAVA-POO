package br.com.serratec.heranca;

public class Diretor extends Empregado{
	private String area;
	
	public Diretor(String nome, String email, String teledone, String area, Double salario) {
		super(nome, email, teledone, salario);
		this.area = area;
	}
	@Override
	public String toString() {
		return "Diretor [area:" + area + "]";
	}
	public String getArea() {
		return area;
	}

	
}
