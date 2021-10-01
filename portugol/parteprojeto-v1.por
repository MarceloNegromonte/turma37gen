programa
{
    
	funcao inicio()
	{
		cadeia codigo[] = {"G4-1","G4-2","G4-3","G4-4","G4-5","G4-6","G4-7","G4-8","G4-9","G4-10"}
		cadeia produto[] = {"teclado        ","mouse        ","cadeira        ","gabinetes    ","memoria ram    ","monitor      ","headset        ","suporteNote  ","mousepad     ","notebook    "}
		inteiro valor[] = {40,20,500,400,45,600,40,80,10,2000}
		inteiro estoque[] = {10 ,10 ,10 ,10 ,10 ,10 ,10 ,10 ,10 ,10}
		caracter desejo = ' '
		cadeia produtoSelect = ""
		cadeia carrinhoCompras[10]
		
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
        		leia(produtoSelect)
        		
        		//Valida se o produto existe no catalogo
        		para (inteiro indice = 0; indice < 10; indice++) 
    			{
    			    
    			    //Verifica se o código digitado e um produto valido
    			    se (produtoSelect == codigo[indice])
    			    {
    			        escreva("produto adicionado\n")
    			    }
    			}
    			
    			escreva("CONTINUAR A COMPRA (S/N)?\n")
        		leia(continuaCompra)
        		
			}enquanto (continuaCompra == 'S' ou continuaCompra == 's')
	
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
 * @POSICAO-CURSOR = 1581; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */