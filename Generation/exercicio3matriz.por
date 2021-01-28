programa
{
	
	funcao inicio()
	{
		inteiro mat[3][3],n=0,l,c
		
		para(l=0;l<3;l++)
			{
				para(c=0;c<3;c++)
					{
						escreva("\nDigite um número de sua preferência: ")
						leia(mat[l][c])

							 se(mat[l][c]>=10)
							 {
							 	n++
							 }
					}

			}

		escreva("\nNa matriz realizada acima temos, ",n," números que são maiores que 10...")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 220; 
 * @PONTOS-DE-PARADA = 17, 6, 23, 12, 13;
 * @SIMBOLOS-INSPECIONADOS = {mat, 6, 10, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */