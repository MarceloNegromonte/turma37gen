package Lista5;

public class Tarefa1Cliente {

	/*Crie uma classe cliente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/

	private String nome;
	private int idade;
	private String codigo;
	private char pronome;
	
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
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public char getPronome() {
		return pronome;
	}
	public void setPronome(char pronome) {
		this.pronome = pronome;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + getNome() + ", idade=" + getIdade() + ", codigo=" + getCodigo() + ", pronome=" + getPronome() + "]";
	}
	
	

}
