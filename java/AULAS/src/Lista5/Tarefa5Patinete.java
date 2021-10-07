package Lista5;

public class Tarefa5Patinete {

	/*Crie uma classe patinete e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto patinete, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/
	
	private String cor;
	private int velocidadeAtual;
	private int velocidadeMaxima;
	private String modelo;
	
	
	
	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int quantidade) {
		this.velocidadeAtual = quantidade;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Patinete [cor=" + getCor() + ", velocidadeAtual=" + getVelocidadeAtual() + ", modelo=" + getModelo() + "]";
	}
	
}
