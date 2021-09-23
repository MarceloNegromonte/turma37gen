programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro anoNascimento, diaNascimento, mesNascimento, anoAtual, mesesVividos,mesAtual,diaAtual,diasVividosIncompleto

		escreva("Qual o seu nome? ")
		leia(nome)
		escreva("qual ano voce nasceu? ")
		leia(anoNascimento)
		escreva("Qual Mês você nasceu? ")
		leia(mesNascimento)
		escreva("Qual dia você nasceu? ")
		leia(diaNascimento)
		escreva("Qual o ano atual? ")
		leia(anoAtual)
		escreva("Qual a data de hoje? ")
		leia(diaAtual)
		escreva("Que mês você está?(numeral)")
		leia(mesAtual)
		
		mesesVividos= (anoAtual-anoNascimento)*12+mesNascimento
		diasVividosIncompleto= mesesVividos*30

		escreva("Esses são os totais de dias vividos até hoje: ",diasVividosIncompleto)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 730; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */