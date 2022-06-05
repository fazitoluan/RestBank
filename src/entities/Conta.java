package entities;

public class Conta {
	private String name;
	private String cpf;
	private int agencia;
	private int conta;
	private double saldo;
	private static int contadorContas = 0;
	
	public Conta(String name, String cpf, int agencia, int conta, int saldo) {
		this.name = name;
		this.cpf = cpf;
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
	}
	
	public Conta(String name, String cpf, int agencia, int conta) {
		this.name = name;
		this.cpf = cpf;
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static final int getContadorContas() {
	    return contadorContas;
	}

	public static final void incrementaContadorContas() {
	    contadorContas++;
	}

	public String getCpf() {
		return cpf;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valorDepositar) {
		if(valorDepositar>0) {
			this.saldo += valorDepositar;
		}
		else {
			System.out.println("Não é possível depositar um valor menor ou igual a R$0,00");
		}
	}
	
	public void sacar(double valorSacar) {
		if(valorSacar > 0) {
			if(this.saldo > valorSacar) {
				this.saldo -= valorSacar;
			}
			else {
				System.out.printf("Seu saldo é %.2f, portanto, não é possível sacar os %.2f!\n", this.saldo, valorSacar);
			}
		}
		else {
			System.out.println("Não é possível sacar um valor menor ou igual a R$0,00");
		}
	}
	
	public String toString() {
		return String.format(
				"Nome: %s\n" + 
				"Agencia: %d\n" +
				"Conta: %d\n" +
				"Saldo: %.2f\n\n", 
				this.name, this.agencia, this.conta, this.saldo);
	}
	
	
}
