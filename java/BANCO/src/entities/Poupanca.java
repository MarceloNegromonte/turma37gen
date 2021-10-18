package entities;

public class Poupanca extends Conta {

	private int diaAniversarioConta;

	public Poupanca(int numero, String cpf, int diaAniversarioConta) {
		super(numero, cpf);
		this.diaAniversarioConta = diaAniversarioConta;
	}

	public int getDiaAniversarioConta() {
		return diaAniversarioConta;
	}

	public void setDiaAniversarioConta(int diaAniversarioConta) {
		this.diaAniversarioConta = diaAniversarioConta;
	}
	
	public void correca(int diaAtual) {
		if (diaAtual == diaAniversarioConta) {
			super.credito(super.getSaldo()*0.0005);
		}
	}
	
}
