package entities;

public abstract class Conta {

	//atributo
	private int numero;
	private String cpf;
	protected double saldo;
	private boolean ativo;
	
	//construtor
	public Conta(int numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
	}

	//encapsulamento
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public void ativaConta() {
		this.ativo = true;
	}
	
	public void debito(double valor) {
		if (valor <=0) {
			System.out.println("Impossível");
	    } else if (saldo < valor) {
			System.out.println("valor insuficiente");
	    } else if (saldo >= valor) {
			this.saldo = this.saldo - valor;
	    }
	}
	
	public void credito(double valor) {
		this.saldo = this.saldo + valor;
		System.out.println("Operação de crédito realizada");
	}
	
	
	
}
