package br.com.serratec.heranca;

public class Gerente extends Empregado{
	private Integer numEmpregadoGerenciados;

	public Gerente(String nome, String email, String teledone, Integer numEmpregadoGerenciados, Double salario) {
		super(nome, email, teledone, salario);
		this.numEmpregadoGerenciados = numEmpregadoGerenciados;
	}

	public Integer getNumEmpregadoGerenciados() {
		return numEmpregadoGerenciados;
	}
	
	@Override
	public Double aumentarSalario(Double valor) {
		return salario =  super.aumentarSalario(valor) + 1000;
	}
	
	@Override
	public String toString() {
		return super.toString() + "n/ Emp:" + numEmpregadoGerenciados;
	}
	
}
