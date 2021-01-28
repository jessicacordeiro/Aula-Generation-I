programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real quilos,excesso,multa

		escreva("Sistema de Verificação de peso: ")

		escreva("\nDigite o número de quilos de tomates que você pegou: ")
		leia(quilos)

		excesso = quilos-50
		multa = excesso*4
		
		limpa()
		se (quilos > 50)
		{
			escreva("O peso dos tomates está acima do permitido pelo regulamento... Você terá que pagar uma multa de R$: ",multa)
		}
		senao se(quilos <=50)
		{
			escreva("Você está dentro do valor permitido pelo regulamento")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 547; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */