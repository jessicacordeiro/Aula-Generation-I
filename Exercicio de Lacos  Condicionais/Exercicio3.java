package ExercicioLacoCondicional;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String args[]) {
		
		int idade;
		
		try (Scanner ler = new Scanner(System.in)) {
			
			System.out.println("Digite a sua idade, por favor e descubra agora sua Categoria: ");
			idade = ler.nextInt();
			
			if(idade>=0 && idade<=9)
			{
				System.out.println("Infelizmente dentro do nosso quadro você não se encaixa em nenhuma das categorias.");
			}
		
			else if(idade >= 10 && idade <=14)
			{
				System.out.println("Você se enquadra na categoria infantil...");
			}
			else if(idade>=15 && idade<=17)
			{
				System.out.println("Você se enquadra na categoria juvenil...");
			}
			else if(idade>=18 && idade<=25)
			{
				System.out.println("Você se enquadra na categoria adulto...");
			}
			else if(idade>=26 && idade<=110)
			{
				System.out.println("Infelizmente dentro do nosso quadro você não se encaixa em nenhuma das categorias.");
			}
		}
	}
}
