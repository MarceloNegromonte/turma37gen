package ProjetoEcommerce;

public class Produtos {

	private int qtde;
	private String[] nome;
	
	public Produtos(int qtde, String[] nome) {
		super();
		this.qtde = qtde;
		this.nome = nome;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public String[] getNome() {
		return this.nome;
	}
	public void setNome(String[] nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Produtos [qtde=" + this.qtde + ", nome=" + this.nome + "]";
	}
	
	
}
