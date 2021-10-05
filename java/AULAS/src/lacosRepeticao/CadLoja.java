package lacosRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class CadLoja {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		//VARIAVEIS
		String codigoProduto[] = {"X01","X02","X03"};
		String nomeProduto[] = {"CALÇA","CAMISA","SAIA"};
		int estoque[] = {20,20,20};
		double valorProduto[]= {100.50,50.75,70.99};
		String auxCodigo;
		int teste=0;
		int auxQtde=0;
		
		//MOSTRANDO NA TELA
		System.out.println("LOJA DA TURMA 37GEN");
		System.out.println();
		System.out.println("CODIGO\tPRODUTO\tESTQOUE\tVALOR");
		for (int x=0; x<nomeProduto.length; x++) {
			System.out.printf("%s\t%s\t%d\t%.2f\n",codigoProduto[x],nomeProduto[x],estoque[x],valorProduto[x]);
		}
		System.out.println();
		System.out.println("Digite o codigo do produto que deseja comprar: ");
		auxCodigo = leia.next().toUpperCase();
	
		System.out.println("PRODUTO ESCOLHIDO");
		System.out.println("CODIGO\tPRODUTO\tESTQOUE\tVALOR");
		for (int x=0; x<nomeProduto.length; x++) {
			if(codigoProduto[x].equals(auxCodigo)) {
				System.out.printf("%s\t%s\t%d\t%.2f\n",codigoProduto[x],nomeProduto[x],estoque[x],valorProduto[x]);
				teste = x;
				break;
			}else {
				teste++;
			}
		}
		if(teste == codigoProduto.length) { //Simulando que não sabe o tamanho do vetor
			System.out.println("Produto não existente!");
		} else {
			System.out.println("Quantos você deseja comprar: ");
			auxQtde = leia.nextInt();
			if(estoque[teste]==0) {
				System.out.println("Prodto indisponível!");
			}else if(auxQtde > estoque[teste]) {
				System.out.println("Quantidade indisponivel!");
			}
			else {
				System.out.println("Total a pagar: "+(auxQtde*valorProduto[teste]));
				estoque[teste] -= auxQtde;
			}
		}
		System.out.println("CODIGO\tPRODUTO\tESTQOUE\tVALOR");
		for (int x=0; x<nomeProduto.length; x++) {
			System.out.printf("%s\t%s\t%d\t%.2f\n",codigoProduto[x],nomeProduto[x],estoque[x],valorProduto[x]);
		}
		
	}

}
