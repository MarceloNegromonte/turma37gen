package Entites;

	


public class Produto {

	//variaveis
    private String codigo;
    private String nome;
    private double valor;
    private int quantidade;

    //Instancia vazia para os metodosuteis
    public Produto() {
    }

   //construtor
    public Produto(String codigo, String nome, double valor, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    // Getters e Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
    @Override
    public String toString() {
        return 
                "\tCOD " + codigo + "  "+  nome + 
                "\tVALOR " + valor +
                "\tQUANTIDADE " + quantidade ;
    }
}