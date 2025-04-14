package br.org.serratec;

import br.org.serratec.exception.ContaCorrenteException;

public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente("Carlos", 1000.);
		try {
			cc.saque(2000.);
            cc.deposito(0.0);
		} catch (ContaCorrenteException ex) {
			System.out.println(ex.getMessage());
			//ex.printStackTrace();
		} finally {
			System.out.println("Saldo atual:" + cc.getSaldo());
		}

	}

}
