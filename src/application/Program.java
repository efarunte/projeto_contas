package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaCorrente;
import entities.ContaPoupanca;
import entities.ContaSalario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // padroniza��o de idioma
		Scanner sc = new Scanner(System.in); // leitor
		
		int entrada; // vari�vel para indicar o tipo de conta a ser criada
		double saldoInicial; // valor do saldo inicial - premissa "contas s� podem ser criadas com algum
								// saldo, mesmo zero"

		// o bloco abaixo imprime na tela os tipos de conta que podem ser criados
		System.out.println("1. Conta Corrente");
		System.out.println("2. Conta Poupan�a");
		System.out.println("3. Conta Sal�rio");
		System.out.println("Selecione o tipo de conta a criar: ");
		entrada = sc.nextInt(); // l� o tipo de conta selecionado pelo usu�rio

		// o bloco abaixo solicita e l� o valor de saldo inicial
		System.out.println("Informe o saldo inicial: ");
		saldoInicial = sc.nextDouble();
		
		// estrutura switch case para cria��o da conta, do tipo correspondente ao
		// selecionado pelo usu�rio
		switch (entrada) {
		case 1:
			// instancia na mem�ria uma contaCorrente, do tipo ContaCorrente, com o saldo
			// inicial indicado
			ContaCorrente contaCorrente = new ContaCorrente(saldoInicial); // instanciacao de um objeto da classe ContaCorrente, com o nome contaCorrente

			// aqui eu fiquei enrolado, pois em cada case eu preciso dar um nome diferente
			// ao objeto, o que me obriga
			// a fazer chamadas espec�ficas para o m�todo de cada classe, em cada um dos
			// cases
			System.out.println(contaCorrente.getSaldo());
			System.out.println("Digite o valor a ser depositado: ");
			contaCorrente.deposito(sc.nextDouble());
			System.out.println("Saldo atual: " + contaCorrente.getSaldo());
			System.out.println("Digite o valor a ser sacado: ");
			contaCorrente.saque(sc.nextDouble());
			System.out.println("Saldo atual: " + contaCorrente.getSaldo());
			break;

		case 2:
			ContaPoupanca contaPoupanca = new ContaPoupanca(saldoInicial);  // instanciacao de um objeto da classe ContaPoupanca, com o nome contaPoupanca

			System.out.println(contaPoupanca.getSaldo());
			System.out.println("Saldo atual: " + contaPoupanca.getSaldo());
			System.out.println("Digite o valor a ser depositado: ");
			contaPoupanca.deposito(sc.nextDouble());
			System.out.println("Saldo atual: " + contaPoupanca.getSaldo());
			System.out.println("Digite o valor a ser sacado: ");
			contaPoupanca.saque(sc.nextDouble());
			System.out.println("Saldo atual: " + contaPoupanca.getSaldo());
			break;

		case 3:
			ContaSalario contaSalario = new ContaSalario(saldoInicial);   // instanciacao de um objeto da classe ContaSalario, com o nome contaSalario

			System.out.println(contaSalario.getSaldo());
			System.out.println("Saldo atual: " + contaSalario.getSaldo());
			System.out.println("Digite o valor a ser depositado: ");
			contaSalario.deposito(sc.nextDouble());
			System.out.println("Saldo atual: " + contaSalario.getSaldo());
			System.out.println("Digite o valor a ser sacado: ");
			contaSalario.saque(sc.nextDouble());
			System.out.println("Saldo atual: " + contaSalario.getSaldo());
			break;

		default:
			sc.close();
			return;

		}

		sc.close();
	}

}