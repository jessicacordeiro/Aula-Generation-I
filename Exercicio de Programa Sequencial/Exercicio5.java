package ExerciciosProgramaSequencial;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String args[]) 
	{
		double n1,n2,n3,media;
		
		try (Scanner ler = new Scanner(System.in)) {
			
			System.out.println("Calculo da média final das suas notas na faculdade");
			
			System.out.println("Digite a sua nota da N1:");
			n1 = ler.nextDouble();
			System.out.println("Digite a sua nota da N2:");
			n2 = ler.nextDouble();
			System.out.println("Digite a sua nota da N3:");
			n3 = ler.nextDouble();
			
			media = (n1*2 + n2*3 + n3*5)/10;
			
			System.out.printf("Sua média final  é: %2.2f ", media);
						
		}
	}
}
