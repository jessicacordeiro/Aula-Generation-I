package ExerciciosProgramaSequencial;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main (String args[]) 
	{
		int id,meses,dias;
		
		try (Scanner ler = new Scanner(System.in)) {
		
		System.out.println("Calculadora de idade em dias");
	
			System.out.println("\nDigite quantos anos voce tem: ");
			id = ler.nextInt();
			System.out.println("Digite o seu mês de nascimento: ");
			meses = ler.nextInt();
			System.out.println("Digite o dia do seu aniversário: ");
			dias = ler.nextInt();
		}
		
		System.out.println("\nSua idade total em dias são: "+(id * 365 + meses * 30 + dias * 1));
	}
}
