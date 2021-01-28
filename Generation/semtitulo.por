programa
{
	
	funcao inicio()
	{
		inteiro idade,menor=0,maior=0

		escreva("Informe alguma idade: ")
		leia(idade)

		enquanto(idade!=-99)
		{
			menor = menor+1
			maior = maior+1

			se(idade<21)
				{
					escreva(" Menor de idade...")
				}
			se(idade>=21)
				{
					escreva(" Maior de idade...")
				}
		}
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 133; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */