package utils;
import java.util.ArrayList;

import Entites.Produto;

public class MetodosUteis {

	

	    
	 public ArrayList<Produto> pegarListaProdutos(){

	        //Cria instância de uma lista de produtos vazia
	        ArrayList<Produto> listaProdutos = new ArrayList<>();

	        //Adiciona os produtos na lista passando o novo objeto (NEW) direto como parâmetro
	        listaProdutos.add(new Produto("G4-1", "Teclado", 40.0, 10));
	        listaProdutos.add(new Produto("G4-2", "Mouse  ", 5.0, 10));
	        listaProdutos.add(new Produto("G4-3", "Cadeira", 100.0, 10));
	        listaProdutos.add(new Produto("G4-4", "Gabinete", 110.0, 10));
	        listaProdutos.add(new Produto("G4-5", "Memoria ram",45.0, 10));
	        listaProdutos.add(new Produto("G4-6", "Monitor ",600.0, 10));
	        listaProdutos.add(new Produto("G4-7", "Headset  ",40.0, 10));
	        listaProdutos.add(new Produto("G4-8", "SuporteNote",80.0, 10));
	        listaProdutos.add(new Produto("G4-9", "Mousepad ",10.0, 10));
	        listaProdutos.add(new Produto("G4-10", "Notebook ",2000.0, 10));






	        //Retorna a lista de produtos preenchida para quem chamar esse método
	        return listaProdutos;

	    }

	    /**
	     * Imprime a tabela de produtos com os valores atualizados na tela
	     * @param listaProdutosAtualizada
	     */
	    public void imprimirTabelaDeProdutos(ArrayList<Produto> listaProdutosAtualizada){

	        System.out.println("\nLista de Produtos da Loja devStore");
	        System.out.println("\nA loja do desenvolvedore!\n");

	        for (Produto produtoIterado : listaProdutosAtualizada) {
	            System.out.println(produtoIterado.toString());
	        }

	    }

	    /**
	     * Realiza a busca do produto na lista de produtos
	     * @param codigoProduto
	     * @param listaProdutosParaBusca
	     * @return
	     */
	    public Produto buscaProdutoPorCodigo(String codigoProduto, ArrayList<Produto> listaProdutosParaBusca){

	        //Passa por cada item da lista verificando se o código pertence a algum produto
	        for (Produto produtoIterado: listaProdutosParaBusca) {

	            //Verifica se o código informado é de algum dos produtos da lista
	            if (codigoProduto.equals(produtoIterado.getCodigo())){

	                //Se o código do produto bater com um dos códigos da lista retorna o produto para quem chamou o método e encerra a execução desse metodo
	                return produtoIterado;
	            }
	        }

	        //Se o código não bater com nenhum dos produtos da lista, ele vai passar por todos itens, não vai encontrar nada, vai sair do FOR e vai retornar um valor vazio/nulo
	        return null;

	    }

	    /**
	     * Calcula o valor total da compra a partir de uma lista de carrinho de compras e retorna o valor double do total
	     * @param listaProdutosParaCalcular
	     * @return
	     */
	    public double calcularValorTotalCompra(ArrayList<Produto> listaProdutosParaCalcular){

	        double valorTotal = 0.0;

	        for (Produto produtoIterado: listaProdutosParaCalcular) {

	            valorTotal = valorTotal + produtoIterado.getValor();


	       }

	        return valorTotal;

	    }

	
}