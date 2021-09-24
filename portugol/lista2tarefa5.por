programa
{
	
	funcao inicio()
	{
		real indicePoluicao

		escreva("Digite o índice de poluição medido: ")
		leia(indicePoluicao)

		se(indicePoluicao >= 0.05 e indicePoluicao <= 0.25){
			escreva("Grupo 1\n")
			escreva("Índice de poluiçao aceitavel\n")
		}
		senao se(indicePoluicao >= 0.3 e indicePoluicao < 0.4){
			escreva("Grupo 1 - intimado a suspender as ativides")
		}
		senao se(indicePoluicao >= 0.4 e indicePoluicao < 0.5 ){
			escreva("Grupos 1 e 2 intimados a suspenderem as atividades!")
		}
		senao se(indicePoluicao >= 0.5){
			escreva("TODOS OS GRUPO SUSPENDAM AS ATIVIDADES")
		}
		senao {
			escreva("Niveis baixos, não acessa grupo")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 151; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */