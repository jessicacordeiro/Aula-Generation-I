package ExerciciosProgramaSequencial;

import java.util.Scanner;

public class Exercicio3 {
	public static void main (String args[])
	{
		int horas,minutos,segundos;
		
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Tempo de duração do evento na Firma Expressa");
			
			System.out.println("Digite os segundos de duracao do evento: ");
			segundos = ler.nextInt();
		}
		
		horas = segundos / 3600;
		minutos = (segundos-(horas*3600))/60;
		segundos = (segundos-(horas*3600)-(minutos*60));
		
		
		System.out.print("O evento na firma Expressa durou: " + horas + " H " + minutos + " Min. " + segundos + " Seg.");
		
	}
}
