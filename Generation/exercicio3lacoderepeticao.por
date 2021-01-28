programa
{
	
	funcao inicio()
	{
	
			inteiro idade=0,maior=0,menor=0

			escreva("AVISOO! Para parar o programa basta digitar -99")

			enquanto(idade!=-99)
			{
				
				escreva("\nDigite a sua idade e de seus familiares: ")
				leia(idade)
				
				se(idade<=21)
				{
					menor++
				}
				
				senao se(idade>=50)
				{
					maior++
				}

			}

			escreva("\nNúmero de pessoas da sua família que são menores de 21 anos ",menor)
			escreva("\nNúmero de pessoas da sua família que são maiores de 50 anos ",maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 17; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */