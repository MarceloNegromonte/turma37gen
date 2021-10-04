programa
{
	
	
	inclua biblioteca Texto --> tx
	inclua biblioteca Matematica --> mat
	inclua biblioteca Tipos --> tp

	funcao lojaSlogan(){
		escreva ("\n-BEM VINDE(S) A DEVSTORE-")
		escreva ("\nLOJA DO DESENVOLVEDORE!!\n")
	}
	
	funcao inicio()
	{
	
		cadeia loja [10][5] ={
			{"G4-1","Teclado", "40.0", "10", "0"}, 
			{"G4-2", "Mouse", "20.0", "10", "0"}, 
			{"G4-3", "Cadeira", "500.0", "10", "0"},
			{"G4-4", "Gabinetes", "400.0", "10", "0"},
			{"G4-5", "Memoria ram", "45.0", "10", "0"},
			{"G4-6", "Monitor", "600.0", "10", "0"},
			{"G4-7", "Headset", "40.0", "10", "0"},
			{"G4-8", "SuporteNote", "80.0", "10", "0"},
			{"G4-9", "Mousepad", "10.0", "10", "0"},
			{"G4-10", "Notebook", "2000.0", "10", "0"}}

			

		cadeia desejo, codigoProduto, confirmaCompra = " "
		logico repete = verdadeiro
		inteiro opcaoPagamento = 0
		real quantidadeCompra = 0.0, totalCompra = 0.0, valorCompra = 0.0, imposto = 0.0, valor10Porcento = 0.0, aumento15Porcento=0.0

		lojaSlogan()
		
		enquanto (repete){

			escreva ("\nOlá, deseja fazer compras? (S/N): ")
			leia (desejo)
			desejo = tx.caixa_alta(desejo)
			enquanto ((desejo != "S") e (desejo != "N")){
			escreva("Opção inválida, ")
			escreva("Digite S ou N:")
			leia (desejo)	
			desejo= tx.caixa_alta(desejo)
			}

			se (desejo == "N"){
				escreva ("\n----ATÉ BREVE!---\n")
				pare
			}
			
			para(inteiro i = 0;i<1;i++){
				escreva ("\n-------------------REALAÇÃO DE PRODUTOS-----------------")
				escreva ("\nCÓDIGO         PRODUTO         VALOR        ESTOQUE ")
				escreva ("\n------------------------------------------------------\n")
				para (inteiro l=0; l<10; l++){
					para (inteiro c=0;c<4; c++){
						escreva ("[ "+loja[l][c]+" ]\t")		
					}
					escreva ("\n-------------------------------------------------\n")
				}
			}
			
			faca{
			escreva ("\n----Escolha seus produtos----\n")
			escreva ("Digite o código do produto que deseja comprar: ")
			leia (codigoProduto)
			codigoProduto = tx.caixa_alta(codigoProduto)
			escreva ("CÓDIGO           PRODUTO          VALOR         ESTOQUE \n")
			para(inteiro l=0;l<10;l++){
				se(codigoProduto == loja[l][0]){
					escreva(
						loja[l][0],"    ",
						"\t", loja[l][1],"    ",
						"\t", loja[l][2],"    ",
						"\t",loja[l][3],"\n")
				}
			}
			escreva("---------------------------------------------------------------\n")
			escreva ("Digite a quantidade do produto: ")
			leia (quantidadeCompra)
			para(inteiro l=0;l<10;l++){
				se(codigoProduto == loja[l][0]){
					se(quantidadeCompra < tp.cadeia_para_real(loja[l][3])){
						loja[l][4] = tp.real_para_cadeia(quantidadeCompra)	
					}
					senao{
						escreva ("Não possui estoque sufuciente. \n")	
					}
				}
			}
			
			escreva("-----------------------------------------------------------\n")
			escreva ("SEU CARRINHO DE COMPRAS: \n")
			escreva ("----------------------------------------------------------\n")
			para (inteiro l=0; l<10; l++){
				se(loja[l][4]!= "0"){
					escreva("CODIGO: ",
					loja[l][0] ,"  PRODUTO: ",
					loja[l][1] , 
					"  ", loja[l][2] ,
					"  QUANTIDADE ESTOQUE: ", loja[l][3] ,
					"  QUANTIDADE SELECIONADA: ", loja[l][4] ,"\n")
				} 
			}
			escreva("-----------------------------------------------------------\n")
			escreva("\nDeseja continuar comprando? (S/N) ")
			leia(confirmaCompra)
			confirmaCompra = tx.caixa_alta(confirmaCompra)
			se(confirmaCompra == "N"){
				pare
			}
			}enquanto(repete)
			para (inteiro l=0; l<10; l++){
				valorCompra = tp.cadeia_para_real(loja[l][2]) * tp.cadeia_para_real(loja[l][4])
				loja[l][3] = tp.real_para_cadeia(tp.cadeia_para_real(loja[l][3]) - tp.cadeia_para_real(loja[l][4]))
				totalCompra += valorCompra
			}
			
			escreva("Valor total da compra: ", totalCompra, "\n")
			imposto = totalCompra * 0.09
			escreva("Terá ", imposto, " em imposto sobre a compra \n")
			valor10Porcento = totalCompra * 0.10
			escreva("Caso o valor seja pago a vista terá: ", valor10Porcento , " de desconto\n")
			escreva("Caso o valor seja pago no cartão terá: ", valor10Porcento , " de acrescimo\n")
			aumento15Porcento = totalCompra * 0.15
			escreva("Caso o valor seja pago no cartão em 2 vezes terá: ", aumento15Porcento , " de acrescimo\n")
			escreva("-----------------------------------------------------------------------------\n")
			escreva("escolha uma das opção de pagamento: 1- A Vista; 2 - Cartão; 3 - Três vezes no cartão \n")
				leia(opcaoPagamento)
			enquanto(repete){
				se(opcaoPagamento == 1 ou opcaoPagamento == 2 ou opcaoPagamento == 3){
					pare
				}senao{
					escreva("OPÇÃO INVÁLIDA, DIGITE UMA DAS 3 OPÇÕES \n")
					leia(opcaoPagamento)
				}
			}
			
			escreva("-----------------------------------------------------------\n")
			escreva("========================NOTA FISCAL========================\n")
			escreva("-----------------------------------------------------------\n")
			escreva("VALOR DA COMPRA SEM IMPOSTO: ",totalCompra,"\n")
			escreva("VALOR DA COMPRA COM IMPOSTO: ",(totalCompra+imposto),"\n")
			escreva("ITENS DA COMPRA: \n")
			para (inteiro l=0; l<10; l++){
				se(loja[l][4]!= "0"){
					escreva("PRODUTO: ", loja[l][1] ,"PREÇO :", loja[l][2] ,
						"QUANTIDADE COMPRADA: ", loja[l][4] ,"\n")
				}
			}
			escreva ("----------------------------------------------------------\n")
			escreva("SELECIONAR FORMA DE PAGAMENTO: \n")
			escolha(opcaoPagamento){
				caso 1:
					escreva("FORMA SELECIONADA: \n")
					escreva("PAGAMENTO A VISTA, DESCONTO DE 10%, VALOR FINAL: ",
					(( totalCompra+imposto ) - valor10Porcento ),"\n")
					pare
				caso 2:
					escreva("FORMA SELECIONADA: \n")
					escreva("PAGAMENTO NO CARTÃO, ACRESCIMO DE 10%, VALOR FINAL: ",
					(( totalCompra + imposto ) + valor10Porcento ),"\n")
					pare
				caso 3:
					escreva("FORMA SELECIONADA: \n")
					escreva("PAGAMENTO NO CARTÃO EM 2X, ACRESCIMO DE 15%, VALOR DAS PARCELAS: ",
					mat.arredondar(((( totalCompra+imposto ) + aumento15Porcento ) / 2 ) , 2 ),"\n")
					pare
			}
			escreva("-----------------------------------------------------------\n")
			escreva("OBRIGADO POR CONFIAR NA NOSSA LOJA!\n")
		}
	}		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4473; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */