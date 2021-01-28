package ExerciciosProgramaSequencial;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String args[]) 
	{
		int a,b,c;
		double d;
		
		try (Scanner ler = new Scanner(System.in)) {
			
			System.out.println("Digite o valor de A: ");
			a = ler.nextInt();
			System.out.println("Digite o valor de B: ");
			b = ler.nextInt();
			System.out.println("Digite o valor de C: ");
			c = ler.nextInt();
			
			d = Math.pow((a+b),2.0)+Math.pow((b+c),2.0)/2;
			
			System.out.printf("O valor de D é: %2.2f",d);
		}	
	}
}
