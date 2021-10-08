package Lista6;

public class Animal {

	//variaveis
	String nome;
	int idade;
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	//construtores
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//metodos
	public void emitirSom() {
		System.out.println("Emitindo som...");
	}
	
	public void correr() {
		System.out.println("correndo...");
	}
	
}
