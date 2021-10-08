package ProjetoEcommerce;

import java.util.Scanner;

public class Projeto2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String loja [][] = {
				{"G4-1","Teclado", "40.0", "10", "0"}, 
				{"G4-2", "Mouse", "20.0", "10", "0"}, 
				{"G4-3", "Cadeira", "500.0", "10", "0"},
				{"G4-4", "Gabinetes", "400.0", "10", "0"},
				{"G4-5", "Memoria ram", "45.0", "10", "0"},
				{"G4-6", "Monitor", "600.0", "10", "0"},
				{"G4-7", "Headset", "40.0", "10", "0"},
				{"G4-8", "SuporteNote", "80.0", "10", "0"},
				{"G4-9", "Mousepad", "10.0", "10", "0"},
				{"G4-10", "Notebook", "2000.0", "10", "0"}};
		 String desejo, codigoProduto,confirmaCompra = " ";
		 boolean repete = true;
		 int opcaoPagamento = 0;
		 double totalCompra = 0.0, valorCompra = 0.0, imposto = 0.0, valor10Porcento = 0.0, aumento15Porcento=0.0;
		 int qtdCompra = 0;
		 
		 while(repete) {
			 System.out.println("Olá, deseja fazer compra? (s/n): ");
			 desejo = leia.next();
			 desejo = desejo.toUpperCase();			 
			 while(desejo.equals("N") && desejo != "S") {
				System.out.println("Opção invalida!");
				System.out.println("Digite s ou n:");
				desejo = leia.next();
			 }
			 if (desejo.equals("N")) {
				 System.out.println("---- ATÉ BREVE! ----");
				 break;
			 }
			 for(int i=0;i<1;i++) {
				 System.out.println("\n          RELAÇÃO DE PRODUTOS                ");
				 System.out.println("\n CÓDIGO      PRODUTO      VALOR      ESTOQUE  "); 
				 for(int l=0;l<10;l++) {
					 for(int c=0;c<4;c++) {
						 System.out.println("[ "+loja[l][0]+" ]\t"+
								 			"[ "+loja[l][1]+" ]\t"+
								 			"[ "+loja[l][2]+" ]\t"+
								 			"[ "+loja[l][3]+" ]\t");
					 }
					 
				 }
			 }
			 
			 do {
				 System.out.println("\n     ESCOLHA SEUS PRODUTOS     \n");
				 System.out.println("Digite o código do produto que deseja comprar: ");
				 codigoProduto = leia.next();
				 System.out.println("  CÓDIGO      PRODUTO      VALOR      ESTOQUE  \n"); 
				 for(int l=0;l<10;l++) {
					 if(codigoProduto == loja[l][0]) {
						 System.out.println(loja[l][0]+ " " +
								 			"\t"+loja[l][1]+ " "+
								 			"\t"+loja[l][2]+ " "+
								 			 "\t"+ loja[l][3]+ "\n");
					 }
				 }
				 	System.out.println("\nDigite a quantidade do produto: ");
				 	qtdCompra = leia.nextInt();
				
				for(int l=0;l<10;l++) {
					if(qtdCompra < Integer.parseInt(loja[l][3])) {
						loja [l][4] = String.valueOf(qtdCompra);
					} else {
						System.out.println("Não possui estoque suficiente. \n");
					}
				}
				System.out.println("                                                  \n ");
				System.out.println("SEU CARRINHO DE COMPRAS:  \n");
				for(int l=0;l<10;l++) {
					if (loja[l][4]!="0") {
						System.out.println("CÓDIGO:" + " "+
											loja[l][0]+"PRODUTO: "+
											loja[l][1]+" "+
											loja[l][2]+ " QUANTIDADE ESTOQUE: "+ loja[l][3]+
											" QUANTIDADE SELECIONADA: "+ loja[l][4] + " \n");
					}
				}
				System.out.println("                                              \n");
				System.out.println("\nDeseja continuar comprando? (s/n): ");
				confirmaCompra = leia.next();
				if (confirmaCompra == "n") {
					break;
				}
				
			 }while(repete);
			 for(int l=0;l<10;l++) {
				 valorCompra = Double.parseDouble(loja[l][2])* Double.parseDouble(loja[l][4]);
				 loja [l][3] = String.valueOf( Double.parseDouble(loja[l][3]) - Double.parseDouble(loja[l][4]));
				 totalCompra += valorCompra; 
			 }
			 System.out.println("Valor total da compra: " + totalCompra + "\n");
			 imposto = totalCompra*0.09;
			 System.out.println("Terá " + imposto + "em imposto em compra\n");
			 valor10Porcento = totalCompra *0.10;
			 System.out.printf("Caso o valor seja pago a vista terá:"+ valor10Porcento + " de desconto\\n");
			 System.out.printf("Caso o valor seja pago no cartão terá: "+ valor10Porcento +" de acrescimo\n");
			 aumento15Porcento = totalCompra * 0.15;
			 System.out.printf("Caso o valor seja pago no cartão em 2 vezes terá: "+ aumento15Porcento +" de acrescimo\n");
			 System.out.println("                                                                                        ");
			 System.out.println("escolha uma das opção de pagamento: 1- A Vista; 2 - Cartão; 3 - Três vezes no cartão \n");
			 opcaoPagamento = leia.nextInt();
			 
			 while (repete);
			 if (opcaoPagamento == 1 || opcaoPagamento ==2 || opcaoPagamento ==3) {
				 break;
			 } else {
				 System.out.println("OPÇÃO INVÁLIDA, DIGITE UMA DAS 3 OPÇÕES \n");
				 opcaoPagamento = leia.nextInt();
			 }
			 
		 }
		 System.out.println("-----------------------------------------------------------\n");
		 System.out.println("========================NOTA FISCAL========================\n");
		 System.out.println("-----------------------------------------------------------\n");
		 System.out.println("VALOR DA COMPRA SEM IMPOSTO: "+totalCompra+"\n");
		 System.out.println("VALOR DA COMPRA COM IMPOSTO: "+(totalCompra+imposto)+"\n");
		 System.out.println("ITENS DA COMPRA: \n");
		 for (int l=0; l<10; l++) {
			 if(loja[l][4]!= "0") {
				 System.out.printf("PRODUTO: ", loja[l][1] ,"PREÇO :", loja[l][2] ,
							"QUANTIDADE COMPRADA: ", loja[l][4] ,"\n");
			 }
		 }
		 System.out.println("                                                               ");
		 System.out.println("SELECIONAR FORMA DE PAGAMENTO: \n");
		 switch (opcaoPagamento) {
		 case 1:
			 System.out.println("FORMA SELECIONADA: ");
			 System.out.printf("PAGAMENTO A VISTA, DESCONTO DE 10%, VALOR FINAL: ",
					(( totalCompra+imposto ) - valor10Porcento ),"\n");
			 break;
			 
		 case 2:
			 System.out.println("FORMA SELECIONADA: \n");
			 System.out.printf("PAGAMENTO NO CARTÃO, ACRESCIMO DE 10%, VALOR FINAL: ",
						(( totalCompra + imposto ) + valor10Porcento ),"\n");
			 break;
		 case 3: 
			 System.out.println("FORMA SELECIONADA: \n");
			 System.out.println("PAGAMENTO NO CARTÃO EM 2X, ACRESCIMO DE 15%, VALOR DAS PARCELAS: " +
						Math.ceil(((( totalCompra+imposto ) + aumento15Porcento ) / 2 ) + 2 )+"\n");
			 break;	 
		 }
		 System.out.println("-----------------------------------------------------------\n");
		 System.out.println("OBRIGADO POR CONFIARE NA NOSSA LOJA!\n");
		 
		 leia.close();
	}
}
