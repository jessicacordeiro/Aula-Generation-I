programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real custodefabrica,custodistribuidora,imposto,custofinal

		escreva("Descubra o Custo Final do seu Carro Aqui: ")

		escreva("\nDigite o custo de fabrica do seu veiculo: ")
		leia(custodefabrica)
		
		custodistribuidora = 0.28*custodefabrica
		imposto = 0.45*custodefabrica
		custofinal = custodefabrica + imposto + custodistribuidora

		escreva("O custo para o consumidor final é de: ",mat.arredondar(custofinal, 3))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 74; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */