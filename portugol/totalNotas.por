programa
{
	
	funcao inicio()
	{
		cadeia nomeAluno
		real nota=0.0
		real totalNotas=0.0
		real media=0.0
		inteiro maiorNota=0
		inteiro menorNota=10
		inteiro contadorMenorNota=0

		escreva("Nome do aluno: ")
		leia(nomeAluno)
		totalNotas = 0
		para (inteiro x=1; x<=4; x++){
			escreva("Qual a nota ", x," : ")
			leia(nota)
			totalNotas += nota
			se(nota > maiorNota) {
				maiorNota = nota
			se(nota <= menorNota){
				
				se(nota==menorNota){
				contadorMenorNota++	
				}
				senao se (nota < menorNota) {
					contadorMenorNota=1		
				}
				menorNota = nota
			}
			}	
		}
		media = totalNotas / 4
		escreva("oi ", nomeAluno," sua media de notas foi ", media,"\n")
		escreva("Sua maior nota foi ",maiorNota,"\n")
		escreva("Sua menor nota foi ",menorNota,"\n")
		escreva("Sua menor nota apareceu ", menorNota," vezes\n")
		escreva("fim do programa")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 573; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */