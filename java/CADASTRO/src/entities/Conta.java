package entities;

public class Conta {

	//atributos
	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativa;
	
	//construtor - pedreiro
	//se reconhece um construtor por ter o mesmo nome da classe
	
	public Conta(int numero, String cpf) {
		this.numero = numero;
		this.cpf = cpf; //this = tá aqui dentro
	}
	//conhecido como sobrecarga de construtor
	
	public Conta(int numero, String cpf, double saldo, boolean ativa) {
		super(); // a mãe
		this.numero = numero;
		this.cpf = cpf;
		this.saldo = saldo;
		this.ativa = ativa;
	}

	//encapsulamento getters e setters
	
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
	/*
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	*/

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	//metodos
	
	public void ativarConta() {
		ativa = true;
		System.out.println("Conta ativada!");
	}
	
	public void debito(double valor) { //void retorna nada
		saldo = saldo + valor;
	}

	public void credito(double valor) {
		saldo = saldo + valor;
	}
}
