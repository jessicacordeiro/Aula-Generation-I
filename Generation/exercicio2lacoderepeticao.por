programa
{
	
	funcao inicio()
	{
		inteiro j,numero,somapar=0,somaimpar=0

		para(j=1;j<=10;j++)
		{
			escreva("\nDigite 10 números que representa algum dia importante da sua vida 10 vezes: ")
			leia(numero)
			
			limpa()
			
			se(numero%2==0)
			{
				somapar++
			}
			senao
			{
				somaimpar++
			}
			
		}
		escreva("\nNesta condição temos ",somapar," pares e ",somaimpar," impares...")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 400; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */