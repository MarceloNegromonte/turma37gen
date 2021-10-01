programa
{
	
	funcao inicio()
	{
		const inteiro imposto = 9
		
		cadeia codigo[] = {"G4-1","G4-2","G4-3","G4-4","G4-5","G4-6","G4-7","G4-8","G4-9","G4-10"}
		cadeia produto[] = {"teclado","mouse","cadeira","gabinetes","memoria ram","monitor","headset","suporte notebook","mousepad","notebook"})
		inteiro valor[] = {10,20,30,40,50,60,70,80,90,10}
		inteiro estoque[] = {10,10,10,10,10,10,10,10,10,10}
		caracter desejo = ' '
		cadeia escolhaCodigo
		cadeia carrinho[] = {" "," "," "," "," "," "," "," "," "}
		
		escreva("NOME DA LOJA \n")
		escreva("SLOGAN DA LOJA \n")
		escreva("")

		escreva("Deseja fazer compras? S/N ")
        		leia(desejo)

				
		se (desejo == 'S' ou desejo == 's'){
				escreva("LISTA DE PRODUTOS\n")
				para (inteiro i = 0; i <= 10; i++){
					//escreva("Código:",codigo[i]," Produto:", produto[i]," Valor R$: ", valor[i]," Quantidade: ", estoque[i], "\n")
					escreva("Código:",codigo[i],"Produto: ",produto[i],"VALOR R$: ",valor[i],"Estoque: ",estoque[i],"\n")				
				}
				escreva("Selecione o código do produto: ")
				leia(escolhaCodigo)	
				se(escolhaCodigo == codigo[1]){
					carrinho[1]= codigo[1]
					escreva(carrinho[1])					
				}
				senao se(escolhaCodigo == codigo[2]){
					carrinho[2]= codigo[2]
					escreva(carrinho[2])
				}
				senao se(escolhaCodigo == codigo[3]){
					carrinho[3]= codigo[3]
					escreva(carrinho[3])
				}
				senao se(escolhaCodigo == codigo[4]){
					carrinho[4]= codigo[4]
					escreva(carrinho[4])
				}
				senao se(escolhaCodigo == codigo[5]){
					carrinho[5]= codigo[5]
					escreva(carrinho[5])
				}
				senao se(escolhaCodigo == codigo[6]){
					carrinho[6]= codigo[6]
					escreva(carrinho[6])
				}	
				senao se(escolhaCodigo == codigo[7]){
					carrinho[7]= codigo[7]
					escreva(carrinho[7])
				}
				senao se(escolhaCodigo == codigo[8]){
					carrinho[8]= codigo[8]
					escreva(carrinho[8])
				}		
				senao se(escolhaCodigo == codigo[9]){
					carrinho[9]= codigo[9]
					escreva(carrinho[9])
				}	
				senao se(escolhaCodigo == codigo[10]){
					carrinho[10]= codigo[10]
					escreva(carrinho[10])
				}	
		}
					
		senao se (desejo == 'N' ou desejo == 'n') {
				limpa()
				escreva("Obrigado, volte sempre!")
		}
		senao {
			escreva("Escreva algo válido")	
		}		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 940; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */