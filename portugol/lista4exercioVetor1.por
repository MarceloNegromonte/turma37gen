programa
{
	
	funcao inicio()
	{
		inteiro pontos[5]
		inteiro maiorPonto=0

		para(inteiro x=0;x<=4;x++){
			escreva("\nDigite a ",x+1,"ª nota: ")
			leia(pontos[x])
			se(maiorPonto <= pontos[x]){
				maiorPonto = pontos[x]
			}
		}
		para(inteiro x=0; x<=4;x++){
			escreva("\nPontos colocados na ",x+1,"ª posição: ",pontos[x])
		}
		escreva("\nMaior pontuação foi: ",maiorPonto)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 348; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */