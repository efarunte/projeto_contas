package entities;

import services.recebeValor;

public class ContaCorrente implements ContaBancaria {

	private final Double taxa = 1.00;

	private Double saldo;

	public ContaCorrente(Double saldo) {
		this.saldo = saldo;
	}

	public ContaCorrente() {

	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void deposito(Double value) {
		saldo = saldo + value;

	}

	@Override
	public void saque(Double value) {
		if (saldo - value >= taxa) {
			saldo = saldo - value - (taxa);
		}else {
		System.out.println("Saldo insuficiente para operação");}
	}

}
