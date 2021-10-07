package Lista5;

public class Tarefa6Banco {

	/*Crie uma classe conta bancaria e apresente os atributos e métodos
	referentes esta classe, em seguida crie um objeto conta bancaria, defina
	as instancias deste objeto e apresente as informações deste objeto no
	console.*/

	private String nome;
	private int codigo;
	private double saldo;
	private double saldoAtual;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldoAtual() {
		return saldoAtual;
	}
	public void setSaldoAtual(double retirada) {
		this.saldoAtual = saldo - retirada;
	}
	@Override
	public String toString() {
		return "Tarefa6Banco [nome=" + getNome() + ", codigo=" + getCodigo() + ", saldo=" + getSaldo() + ", saldoAtual=" + getSaldoAtual()
				+ "]";
	}


	
}
