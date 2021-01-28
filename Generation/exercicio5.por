programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real n1,n2,n3,media

		escreva("Calculo da média final das suas notas na faculdade")

		escreva("\nDigite a sua nota da N1: ")
		leia(n1)
		escreva("Digite a sua nota da N2: ")
		leia(n2)
		escreva("Digite a sua nota da N3: ")
		leia(n3)

		media = ((n1*2)+(n2*3)+(n3*5))/10
		escreva("Sua média final  é: ",mat.arredondar(media, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 97; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */