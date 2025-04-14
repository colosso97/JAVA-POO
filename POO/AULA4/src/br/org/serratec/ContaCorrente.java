package br.org.serratec;

import br.org.serratec.exception.ContaCorrenteException;

public class ContaCorrente implements Conta {
	private String titular;
	private Double saldo;

	public ContaCorrente(String titular, Double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "titular:" + titular + ", saldo=" + saldo + "]";
	}

	public String getTitular() {
		return titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	@Override
	public Boolean saque(Double valor) {

		if (saldo >= valor) {
			saldo -= valor;
			return true;
		}
		throw new ContaCorrenteException("Saldo insuficiente!");
	}
    
	@Override
	public void deposito(Double valor) {
        
        if (valor > 0) {
            saldo += valor;
			System.out.println("saldo atual:" + saldo);
		}
            throw new ContaCorrenteException("Deposito deve ser maior que zero!");
		

	}

}