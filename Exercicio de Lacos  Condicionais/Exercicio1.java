package ExercicioLacoCondicional;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String args[]) {
		
		int x,y,z;
		
		try (Scanner ler = new Scanner(System.in)) {
			
			System.out.println("Digite o primeiro número inteiro, por favor: ");
			x = ler.nextInt();
			System.out.println("Digite o segundo número inteiro: ");
			y = ler.nextInt();
			System.out.println("Digite o terceiro número inteiro: ");
			z = ler.nextInt();
			
			if(x > y && x > z)
			{
				System.out.println("O maior número é o primeiro: " + x);
			}
			else if(y>x && y>z) 
			{
				System.out.println("O maior número é o segundo: " + y);	
			} else {
		
				System.out.println("O maior número é o terceiro: " + z);
			}
		}
	}
}
