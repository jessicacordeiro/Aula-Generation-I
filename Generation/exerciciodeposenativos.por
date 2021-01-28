programa
{
	
	funcao inicio()
	{
		inteiro numero

		
		escreva("Digite um número de sua preferência, porém inteiro: ")
		leia(numero)

		se(numero % 2 == 0)
		{
			escreva("O seu número é par")
		}
		se(numero % 2 != 0)
		{
			escreva("O seu número é ímpar")
		}
		se(numero < 0)
		{
			escreva(" e negativo!")
		}
		se(numero >= 0)
		{
			escreva(" e positivo!")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 376; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */