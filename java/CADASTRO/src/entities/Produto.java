package entities;

public class Produto {

	public String codigo;
	public String nome;
	public double valor;
	public int estoque;
	
	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", valor=" + valor + ", estoque=" + estoque + "]";
	}
	//public int calcularIdade(int ano) {
//	return ano - anoNascimento;
//}
	public int tiraEstoque (int qtde) {
		return estoque - qtde;
	}
	public int addEstqoue (int qtde) {
		return estoque + qtde;
	}
	
}
