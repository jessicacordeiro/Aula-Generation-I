programa
{
	
	funcao inicio()
	{
		inteiro idadeanos,idademeses,idadedias, totalidadedias
		
		escreva("Calculadora de idade em dias")
		
		escreva("\nDigite quantos anos voce tem: ")
		leia(idadeanos)
		escreva("Digite o seu mes de nascimento: ")
		leia(idademeses)
		escreva("Digite o dia do seu aniversario: ")
		leia(idadedias)

		escreva("\nSua idade total em dias são: " +(idadeanos * 365)+(idademeses * 30)+(idadedias * 1))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 142; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */