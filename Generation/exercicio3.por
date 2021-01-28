programa
{
	
	funcao inicio()
	{
		inteiro tempo,horas,minutos,segundos

		escreva("Tempo de duração do evento na Firma Expressa")
		
		escreva("\nDigite os segundos de duracao do evento: ")
		leia(segundos)

		horas = segundos / 3600
		minutos = (segundos-(horas*3600))/60
		segundos = (segundos-(horas*3600)-(minutos*60))

		 escreva("O evento na firma Expressa durou: ",horas,"H",minutos,"Min.",segundos,"Seg.")

	}
		 
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 427; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */