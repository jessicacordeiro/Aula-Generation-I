package ExerciciosdeRepeticao;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		int idade,maior=0,menor=0,mediana=0;
		
		try (Scanner ler = new Scanner(System.in)) {
			
			System.out.println("AVISOO! Para parar o programa basta digitar -99");
			
			System.out.println("Digite a sua idade e de seus familiares:");
			idade = ler.nextInt();
			
			while(idade!=-99)
			{
				System.out.println("Digite a sua idade e de seus familiares:");
				idade = ler.nextInt();
				
				if(idade < 21)
				{
					menor++;
				}
				else if(idade > 50)
				{
					maior++;
				}
				else
				{
					mediana++;
				}
			}
			
			System.out.println("Existe(m) " + menor + " pessoa(s) da sua família que são menor(es) de 21 anos... \nJá entre 22 a 49 anos existe(m) " + mediana + ",\ne por fim " + maior + " maior(es) de 50 anos...");
		}
	}
}
