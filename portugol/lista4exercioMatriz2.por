programa
{
	
	funcao inicio()
	{
		inteiro mat[3][3],l,c
		inteiro somaMat=0
		inteiro somaDiagonal=0

		para (l=0;l<3;l++)
		{
			para (c=0;c<3;c++)
			{
				escreva("Digite um valor: ")
				leia(mat[l][c])
			}
		}
		para (l=0;l<3;l++)
		{
			para (c=0;c<3;c++)
			{
				//escreva("[ ",mat2[l][c], " ]")
				somaMat = somaMat + mat[l][c]
			}
			escreva("\n")
		}
		para(inteiro x=0;x<3;x++){
			somaDiagonal = somaDiagonal + mat[x][x]
		}

		escreva("\nA soma total de matriz é: ", somaMat)
		escreva("\nA soma da diagonal principal da matriz é: ",somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 493; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */