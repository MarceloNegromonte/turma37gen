programa
{
    
	funcao inicio()
	{
		cadeia codigo[] = {"G4-1","G4-2","G4-3","G4-4","G4-5","G4-6","G4-7","G4-8","G4-9","G4-10"}
		cadeia produto[] = {"teclado        ","mouse        ","cadeira        ","gabinetes    ","memoria ram    ","monitor      ","headset        ","suporteNote  ","mousepad     ","notebook    "}
		inteiro valor[] = {40,20,500,400,45,600,40,80,10,2000}
		inteiro estoque[] = {10 ,10 ,10 ,10 ,10 ,10 ,10 ,10 ,10 ,10}
		caracter desejo = ' '
		cadeia escolhaCodigo = ""
		cadeia carrinho[10]
		
		escreva("BEM VINDE(S) A DEVSTORE \n")
		escreva("A LOJA DO DESENVOLVEDORE!\n")
		escreva("")

		escreva("Deseja fazer compras? Digite S/N:  ")        	
        	leia(desejo)

	
		se (desejo == 'S' ou desejo == 's')
		{
			
			//Imprime a tabela de produtos
			escreva("LISTA DE PRODUTOS\n")
			escreva("Cod.\t"," ","Prod.\t","    ","     Valor\t"  ,"     ","        Estoque\t\n")
			para (inteiro i = 0; i < 10; i++)
			{
				escreva(codigo[i],"\t", produto[i],"\t R$",valor[i],"\t" ,"               ", estoque[i] ,"\t\n")
				
			}
			
			//Inicia logica do carrinho de compras
			caracter continuaCompra = 'S'
			inteiro produtosAdicionados = 0
			faca
			{
			 
        		escreva("DIGITE O CÓDIGO DO PRODUTO: ")
        		leia(escolhaCodigo)
        		
        		//Valida se o produto existe no catalogo
        		para (inteiro indice = 0; indice < 10; indice++) 
    			{
    			    
    			    //Verifica se o código digitado e um produto valido
    			    se (escolhaCodigo == codigo[indice])
    			    {
	    			      se(escolhaCodigo == codigo[1]){
						carrinho[1]= codigo[1]
						escreva(carrinho[1])
						escreva("produto adicionado\n")					
					}
					senao se(escolhaCodigo == codigo[2]){
						carrinho[2]= codigo[2]
						escreva(carrinho[2])
						escreva("produto adicionado\n")
					}
					senao se(escolhaCodigo == codigo[3]){
						carrinho[3]= codigo[3]
						escreva(carrinho[3])
						escreva("produto adicionado\n")
					}
					senao se(escolhaCodigo == codigo[4]){
						carrinho[4]= codigo[4]
						escreva(carrinho[4])
						escreva("produto adicionado\n")
					}
					senao se(escolhaCodigo == codigo[5]){
						carrinho[5]= codigo[5]
						escreva(carrinho[5])
						escreva("produto adicionado\n")
					}
					senao se(escolhaCodigo == codigo[6]){
						carrinho[6]= codigo[6]
						escreva(carrinho[6])
						escreva("produto adicionado\n")
					}	
					senao se(escolhaCodigo == codigo[7]){
						carrinho[7]= codigo[7]
						escreva(carrinho[7])
						escreva("produto adicionado\n")
					}
					senao se(escolhaCodigo == codigo[8]){
						carrinho[8]= codigo[8]
						escreva(carrinho[8])
						escreva("produto adicionado\n")
					}		
					senao se(escolhaCodigo == codigo[9]){
						carrinho[9]= codigo[9]
						escreva(carrinho[9])
						escreva("produto adicionado\n")
					}	
					senao se(escolhaCodigo == codigo[10]){
						carrinho[10]= codigo[10]
						escreva(carrinho[10])
						escreva("produto adicionado\n")
					}
	    			    	}	
	    		    }
    			escreva("CONTINUAR A COMPRA (S/N)?\n")
        		leia(continuaCompra)
        		
			}enquanto (continuaCompra == 'S' ou continuaCompra == 's')

			se(continuaCompra == 'N' ou continuaCompra =='n'){
				escreva("Monstrando a lista de carrinhos")
				para(inteiro x=0;x<=10;x++)
					escreva(carrinho[x])
			}
		} 
		senao se (desejo == 'N' ou desejo == 'n') 
		{
			
			limpa()
			escreva("Obrigado, volte sempre!")
				
		} 
		senao
		{
			escreva("Opcao inválida")	
		}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3324; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */