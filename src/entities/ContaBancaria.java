package entities;

interface ContaBancaria {
	
	// esta é a classe interface de ContaBancaria, da qual derivam ContaCorrente, ContaPoupanca e ContaSalario

	public void deposito(Double value);

	public void saque(Double value);

}
