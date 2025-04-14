package exercicios;

public class Veiculo {
	String placa;
	String tipo;
	double valor;
	
	public double calcularIPVA() {
		if (tipo.equalsIgnoreCase("Flex") || tipo.equalsIgnoreCase("Gasolina")) {
			return valor * 0.04;
		}else {
			return valor * 0.015;
		}
	}
}