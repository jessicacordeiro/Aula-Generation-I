programa
{
	
	funcao inicio()
	{
		inteiro horastrabalhadas
		cadeia nome

		escreva("Calcule aqui o total do seu salário.")

		escreva("\nAdorável colaborador, digite o seu nome completo, por favor: ")
		leia(nome)
		escreva("Digite agora o número de horas trabalhadas: ")
		leia(horastrabalhadas)	

		se (horastrabalhadas>50)
		{
			escreva("Seu salário total terá horas extras então esse mês você irá receber R$: ",(horastrabalhadas-50)*20 + 50*10)
		}
		senao se(horastrabalhadas<=50)
		{
			escreva("Seu salário total é de R$: ",horastrabalhadas*10)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 563; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */