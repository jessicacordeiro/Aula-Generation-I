package ExercicioLacoCondicional;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String args[]) {
		
		double a,b,c;
		
		try (Scanner ler = new Scanner(System.in)) {
			
			System.out.println("Digite o primeiro número de sua preferência, por favor: ");
			a = ler.nextInt();
			System.out.println("Digite o segundo número: ");
			b = ler.nextInt();
			System.out.println("Digite o terceiro e último número: ");
			c = ler.nextInt();
			
			if(a<b && b<c)
			{
				System.out.printf("A ordem crescente entre esses números é: ", a, c, b);
			}
			else if(a<c && c<b)
			{
				System.out.printf("A ordem crescente entre esses números é: ", a, c, b);
			}
			else if(b<a && a<c)
			{
				System.out.printf("A ordem crescente entre esses números é: ", b, a, c);
			}
			else if(b<c && c<a)
			{
				System.out.printf("A ordem crescente entre esses números é: ", b, c, a);
			}
			else if(c<a && a<b)
			{
				System.out.printf("A ordem crescente entre esses números é: ", c, a, b);
			}
			else if(c<b && b<a)
			{
				System.out.printf("A ordem crescente entre esses números é: %2.2f ", c, b, a);
			}
		}
	}
}
