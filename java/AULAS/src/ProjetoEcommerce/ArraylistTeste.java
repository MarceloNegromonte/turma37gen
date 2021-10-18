package ProjetoEcommerce;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArraylistTeste {
//Teclado,Mouse,Cadeira,Gabinetes
	public static void main(String[] args) {
		
		String[] produtos = {"Teclado","Mouse","Cadeira","Gabinetes","Memoria ram", "Monitor", "Headset","SuporteNote", "Mousepad", "Notebook"};
		ArrayList<String> listaProdutos = new ArrayList<>();
		
		
		for(int x=0;x<produtos.length;x++) {
		listaProdutos.add(produtos[x]);
		}
		
		//for(int x=0;x) {
		for (int x=0;x<1;x++) {
		System.out.println("\t Produtos : "+listaProdutos);
		}
	}
		
}
