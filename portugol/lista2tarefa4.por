programa
{
	
	funcao inicio()
	{
		inteiro : numero

		escreva("Digite um número inteiro:")
		leia(numero)

		se(numero < 0){
			escreva("Número negativo é inválido")
		}
		senao se(numero == 0) {
			escreva("Numéro neutro")
		}
		senao se(numero % 2 == 0) {
			escreva("Número PAR")
		}
		senao {
			escreva("Número Impar")	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 222; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */