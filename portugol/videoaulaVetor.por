programa
{
	
	funcao inicio()
	{
		inteiro numero[4]

		para(inteiro x=0;x<4;x++){
			escreva("Digite os números: ")
			leia(numero[x])		
		}
		para(inteiro x=0;x<4;x++){
			escreva("\nValor ",numero[x]," Posição ",x+1)
		}
		para(inteiro x=3; x>0;x--){
						escreva("\nValor ",numero[x]," Posição ",x+1)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 291; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numero, 6, 10, 6}-{x, 8, 15, 1}-{x, 12, 15, 1}-{x, 15, 15, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */