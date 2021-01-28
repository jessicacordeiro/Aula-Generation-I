programa
{
	
	funcao inicio()
	{
		real idade
		cadeia nome

		escreva("Lista Automática de Classificação das Categorias dos Nadadores JAVA")

		escreva("\nSeu nome por favor: ")
		leia(nome)
		escreva("Digite aqui a sua Idade por favor: ")
		leia(idade)

		limpa()
		se(idade >=5 e idade<= 7)
		{
			escreva("Olá ",nome," você se enquadra na categoria Infantil A... Obrigado(a) por utilizar o nosso sistema")
		}
		se(idade >=8 e idade<= 11)
		{
			escreva("Olá ",nome," você se enquadra na categoria Infantil B... Obrigado(a) por utilizar o nosso sistema")
		}
		se(idade >=12 e idade<= 13)
		{
			escreva("Olá ",nome," você se enquadra na categoria Juvenil A... Obrigado(a) por utilizar o nosso sistema")
		}
		se(idade >=14 e idade<= 17)
		{
			escreva("Olá ",nome," você se enquadra na categoria Juvenil B... Obrigado(a) por utilizar o nosso sistema")
		}
		se(idade >=18)
		{
			escreva("Olá ",nome," você se enquadra na categoria de Adultos... Obrigado(a) por utilizar o nosso sistema")
		}
		senao se(idade <5)
		{
			escreva("Olá ",nome," infelizmente você está fora de nossas categorias por não obter a idade mínina estabelecida em nosso clube.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1163; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */