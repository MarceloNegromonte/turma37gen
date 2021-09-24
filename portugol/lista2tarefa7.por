programa
{
	
	funcao inicio()
	{
		//Variavéis:
		real base, altura, area

		//Entrada de dados:
		escreva("Digite a Base: ")
		leia(base)
		escreva("Digite a Altura: ")
		leia(altura)

		//Processamento:
		//area = base * altura

		se(base > 0 e altura > 0){
			area = base * altura
			escreva("Area do triângulo: ",area)
		}
		senao
			escreva("Valores inválidos, escreva um número positivo")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 322; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */