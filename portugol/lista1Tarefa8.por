programa
{
	
	funcao inicio()
	{
		real custoFabrica, custoConsumidor, impostos, distribuidor
	escreva("Digite o custo de fábrica do automovél: ")
	leia(custoFabrica)

	impostos = custoFabrica *45/100
	distribuidor = custoFabrica * 28/100
	
	custoConsumidor = math.arredondar(custoFabrica + imposto + distribuidor,2)

	escreva("O custo ao consumidor é de R$: ", custoConsumidor
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 377; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */