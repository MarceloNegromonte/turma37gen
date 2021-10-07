package app;

import java.util.Scanner;

import entities.Pessoa;
import entities.Produto;

public class CadProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		Pessoa p2 = new Pessoa();
		
		p2.nome = "Maria";
		p2.pronome = 'a';
		
		Produto celular = new Produto();
		celular.codigo = "G01";
		celular.estoque = 20;
		
		celular.addEstqoue(5);
		celular.tiraEstoque(2);
		
		System.out.println(p2.toString());
		System.out.println(celular.toString());
	}

}
