package entities;

public class ContaEstudantil extends Conta {

	private double limiteEstudantil = 5.000;

	public ContaEstudantil(int numero, String cpf, double limiteEstudantil) {
		super(numero, cpf);
		this.limiteEstudantil = limiteEstudantil;
	}

	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}

	public double usarEstudantil(double valor) {
		this.limiteEstudantil = limiteEstudantil - valor; 
		return this.saldo;
	}	
}
