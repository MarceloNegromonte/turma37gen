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
		double quantidadeCompra, totalCompra=0.0, valorCompra, imposto, valor10Porcento, aumento15Porcento = 0.0;
		
		
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
					if(codigoProduto.equals(loja[linha][0])) {
						System.out.println(loja[linha][0]+"   "+"\t"+ loja[linha][1]+"\t"+loja[linha][2]+"\t"+loja[linha][3]);
					}
				}
			System.out.println("---------------------------");
			System.out.println("Digite a quantidade do produto: ");
			quantidadeCompra = leia.nextDouble();
			for (int linha=0;linha<10;linha++) {
				if (codigoProduto == loja[linha][0]) {
					if (quantidadeCompra < Double.parseDouble(loja[linha][3])) { //falta mudar o tipo para comparar.
					//	loja[linha][4] //= Double.valueOf(quantidadeCompra).doubleValue(); // falta conversão
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
		for (int linha=0;linha<10;linha++) {
			//valorCompra = tp.cadeia_para_real(loja[l][2]) * tp.cadeia_para_real(loja[l][4])
	//falta ajeitar				//loja[l][3] = //tp.real_para_cadeia(tp.cadeia_para_real(loja[l][3]) - tp.cadeia_para_real(loja[l][4]))
					//totalCompra += valorCompra;
		}
		System.out.println("Valor total da compra "+totalCompra);
		imposto = totalCompra * 0.09;
		System.out.println("Terá"+imposto+"em imposto sobre a compra ");
		valor10Porcento = totalCompra * 0.10;
		System.out.println("Caso o valor seja pago a vista terá: "+valor10Porcento+" de desconto");
		System.out.println("Caso o valor seja pago no cartão terá: "+valor10Porcento+" de acrescimo");
		System.out.println("Caso o valor seja pago no cartão em 2x terá: "+aumento15Porcento+" de acrescimo");
		System.out.println("---------------------------------------------");
		System.out.print("Escolha uma das opções de pagamento: 1- À vista, 2- Cartão, 3-Três vezes ");
		opcaoPagamento = leia.nextInt();
		
		while (repete) {
			if (opcaoPagamento == 1 || opcaoPagamento == 2 || opcaoPagamento == 3) {
				break;
				//falta colocar pra simular a nota
			}
			else {
				System.out.println("OPÇÃO INVÁLIDA! DIGITE UMA DAS 3 OPÇÕES!");
				opcaoPagamento = leia.nextInt();
			}
		}
		System.out.println("-----------------------------------------------------------");
		System.out.println("========================NOTA FISCAL========================");
		System.out.println("-----------------------------------------------------------");
		System.out.println("VALOR DA COMPRA SEM IMPOSTO: "+totalCompra);
		System.out.println("VALOR DA COMPRA COM IMPOSTO: "+(totalCompra+imposto));
		System.out.println("ITENS DA COMPRA: ");
		
		for (int linha=0;linha<10;linha++) {
			if (loja[linha][4] != "0") {
				System.out.println("PRODUTO: "+loja[linha][0]+ "PREÇO: "+loja[linha][1]+" QUANTIDADE COMPRADA: "+loja[linha][4]);
			}
		}
		System.out.println("----------------------------------------------------------");
		System.out.println("SELECIONAR FORMA DE PAGAMENTO: ");
		switch(opcaoPagamento) {
			case 1:
				System.out.println("FORMA SELECIONADA: ");
				System.out.println("PAGAMENTO À VISTA, DESCONTO DE 10%, VALOR FINAL: "+((totalCompra+imposto)-valor10Porcento));
				break;
			case 2:
				System.out.println("FORMA SELECIONADA:");
				System.out.println("PAGAMENTO NO CARTÃO, ACRESCIMO DE 10%, VALOR FINAL: "+((totalCompra+imposto)-valor10Porcento));
			case 3:
				System.out.println("FORMA SELECIONADA: ");
				System.out.println("PAGAMENTO NO CARTÃO EM 2X, ACRESCIMO DE 15%, VALOR DAS PARCELAS: ");
				//FALTA AJEITAR mat.arredondar(((( totalCompra+imposto ) + aumento15Porcento ) / 2 ) , 2 )
				break;
		}
		System.out.println("-----------------------------------------------------------");
		System.out.println("OBRIGADO POR CONFIAR NA NOSSA LOJA!");
		
	}

}

/*se (sn == 's' ou sn == 'S'){ // Validar a quantidade de compra
escreva("\nQual a quantidade? \n") // Pergunta ao clietne
leia(quantidade)				// ler a quantidade

se (quantidade > 0 e quantidade <= estoque[i]){ 
	carrinho = quantidade * preco[i]  //Coloca no carrinho a quantidade para exibição
	escreva("CARRINHO ATUAL: ", quantidade, " x ", produto[i],"\t Valor unitário: RS", preco[i], "\t TOTAL: R$", carrinho,"\n")// exibe carrinho para validação do cliente
	escreva("\nESTA TUDO CERTO? CONFIRME SEU PEDIDO [S OU N] \n")  //Confirmação com o cliente
	leia(sn)
	se (sn == 's' ou sn == 'S'){ // desvio condicional para validação de estoque
						  // Se o pedido for válido, faz as alterações
	QuantdeCompra = QuantdeCompra + quantidade //Coloca a quantidade de compras = quantidade que estava no carrinho
	ValorFinal = ValorFinal + carrinho //valor final da compra soma com o que foi colocado no carrinho
	estoque[i] = estoque[i] - quantidade//Retira a quantidade solicitada de produtos do estoque
	ProdutoFinal[i] = produto[i] //Coloca o produto pedido no vetor do carrinho
	se (produto[i] == ProdutoFinal[i]){//Condicional para validaer se o produto já está no carrinho
		VALORFINAL[i] = VALORFINAL[i] + carrinho//Se já estiver, soma o valor atual do carrinho atualizado
		QuantFinal[i]+= quantidade //se jaáestiver, soma a quantidade do carrinho para mostrar atualizado
		
		}
	}
}senao{
escreva("ESTOQUE INDISPONÓVEL! \nVERIFIQUE A LISTA E INFORME UMA QUANTIDADE VÁLIDA\nAPERTE ENTER PARA CONTINUAR\n\n")
leia(y)
}


}escreva("\nSALDO RESTANTE: ", produto[i],"\t",estoque[i],"\n") //exibe a quantidade atualizada do estoque do produto
}
*/