programa
{
	
	funcao inicio()
	{
		inteiro numeros=0
		inteiro numerosMedia=0
		inteiro numerosSoma=0
		inteiro totalValores=0
		real media=0.0
		

		enquanto (numeros >= 0){
			escreva("Digite o número: ")
			leia(numeros)
			//numerosMedia += numeros
			se(numeros>=0){
				numerosSoma += numeros
				numerosMedia += numeros
			}	
			totalValores++
		}
		totalValores -=  1
		numerosMedia = numerosMedia / totalValores
		
		escreva("Soma dos números = ",numerosSoma,"\n")
		escreva("Média dos números = ",numerosMedia,"\n")
		escreva("Total de valores lidos = ",totalValores)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 317; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */