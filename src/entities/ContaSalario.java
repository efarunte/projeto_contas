package entities;

public class ContaSalario implements ContaBancaria {

	// não implementei nenhuma diferença prática entre as contas do tipo ContaSalario e ContaPoupanca. Os métodos são idênticos.
	
	private Double saldo;

	public ContaSalario(Double saldo) {
		this.saldo = saldo;
	}

	public ContaSalario() {

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
