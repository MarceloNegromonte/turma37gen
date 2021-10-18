package entities;

public class Funcionario {

	//variaveis
	private String matricula;
	private String nome;
	private int horasTrabalhadas;
	private double valorHora;
	
	
	//construtor
	public Funcionario(String matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}
	
	//encapsulamento
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) { // variavel : valorHora
		this.valorHora = valorHora; // atributo : valorHora
	}
	
	//metodos, Tipo : double, faltou usar o this pra referenciar um atributo e não variavel.
	public double calculoSalario() {
		return this.horasTrabalhadas * this.valorHora;
	}
}
