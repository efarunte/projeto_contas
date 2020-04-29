package entities;

public class ContaPoupanca implements ContaBancaria {

	private Double saldo;

	public ContaPoupanca(Double saldo) {
		this.saldo = saldo;
	}

	public ContaPoupanca() {

	}

	public Double getSaldo() {
		return saldo;
	}

	@Override
	public void deposito(Double value) {
		saldo = saldo + value;

	}

	@Override
	public void saque(Double value) {
		if (saldo - value >= saldo) {
			saldo = saldo - value;
		}
		System.out.println("Saldo insuficiente para operação");
	}

}
