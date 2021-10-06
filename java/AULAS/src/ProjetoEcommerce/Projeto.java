package ProjetoEcommerce;

import java.util.Locale;
import java.util.Scanner;

public class Projeto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		String[][] loja = {{"G4-1","Teclado", "40.0", "10", "0"}, 
							{"G4-2", "Mouse", "20.0", "10", "0"}, 
				            {"G4-3", "Cadeira", "500.0", "10", "0"},
				            {"G4-4", "Gabinetes", "400.0", "10", "0"},
				            {"G4-5", "Memoria ram", "45.0", "10", "0"},
				            {"G4-6", "Monitor", "600.0", "10", "0"},
				            {"G4-7", "Headset", "40.0", "10", "0"},
				            {"G4-8", "SuporteNote", "80.0", "10", "0"},
				            {"G4-9", "Mousepad", "10.0", "10", "0"},
				            {"G4-10", "Notebook", "2000.0", "10", "0"}};

		String desejo, codigoProduto, confirmaCompra = " ";
		boolean repete = true;
		int opcaoPagamento = 0;
		double quantidadeCompra, totalCompra, valorCompra, imposto, valor10Porcento, aumento15Porcento = 0.0;
		
		
		System.out.println("BEM VINDES A LOJA DEVSTORE");
		System.out.println("LOJA DO DESENVOLVEDORE");
		
		while(repete) {
			System.out.println("Olá, deseja fazer compras? [S/N]: ");
			desejo = leia.next().toUpperCase();
			while(desejo.equals("S") && desejo.equals("N")) {
				System.out.println("Opção inválida!");
				System.out.println("Digite S ou N: ");
				desejo = leia.next().toUpperCase();
			}
			
			if(desejo.equals("N")) {
				System.out.println("---ATÉ BREVE!---");
				break;
			}
			
			for (int i=0;i>1;i++) {
				System.out.println("-----------RELAÇÃO DOS PRODUTOS----------");
				System.out.println("CODIGO      PRODUTO     VALOR     ESTOQUE");
				System.out.println("-----------------------------------------");
				for (int linha=0;linha<10;linha++) {
					for (int coluna=0;coluna<4;coluna++) {
						System.out.println("[ "+loja[linha][coluna]+" ]\t");
					}
					System.out.println("-------------------------------------");
				}
			}
			do {
				System.out.println("---Escolha seus produtos---");
				System.out.println("Digite o código do produto que deseja comprar: ");
				codigoProduto = leia.next().toUpperCase();
				System.out.println("CODIGO     PRODUTO     VALOR     ESTOQUE");
				for (int linha=0;linha<10;linha++) {
					if(codigoProduto == loja[linha][0]) {
						System.out.println(loja[linha][0]+"   "+"\t"+ loja[linha][1]+"\t"+loja[linha][2]+"\t"+loja[linha][3]);
					}
				}
			System.out.println("---------------------------");
			System.out.println("Digite a quantidade do produto: ");
			quantidadeCompra = leia.nextDouble();
			for (int linha=0;linha<10;linha++) {
				if (codigoProduto == loja[linha][0]) {
					if (quantidadeCompra < Double.parseDouble(loja[linha][3])) { //falta mudar o tipo para comparar.
						loja[linha][4] = Double.valueOf(quantidadeCompra).doubleValue(); // falta conversão
					}
					else {
						System.out.println("Não possui estoque suficiente.");
					}
				}
			}
			System.out.println("---------------------------");
			System.out.println("SEU CARRINHO DE COMPRAS: ");
			System.out.println("--------------------------");
			
			for (int linha=0;linha<10;linha++) {
				if (loja[linha][4].equals("0")) {
					System.out.println("CODIGO: "+loja[linha][0]+"PRODUTO: "+loja[linha][1]+" "+loja[linha][2]+"QUANTIDADE ESTOQUE: "+loja[linha][3]+"QUANTIDADE SELECIONADA"+loja[linha][4]);
				}
			}
			System.out.println("---------------------------");
			System.out.println("Deseja continuar comprando? [S/N]");
			confirmaCompra = leia.next();
			if (confirmaCompra.equals("N")) {
				break;
			}			
			}while(repete);
		}
		// parei na linha 116 portugol
		
	}

}
