package ExerciciosProgramaSequencial;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String args[]) 
	{
		int totaldias,anos,meses,dias;
		
		try (Scanner ler = new Scanner(System.in)) {
			
			System.out.println("Digite a data do seu aniversário em dias: ");
			totaldias = ler.nextInt();
			
			anos = totaldias/365;
			meses = (totaldias%365)/30;
			dias = (totaldias%365)%30;
			
			System.out.println("Você tem: " + anos + " anos " + meses + " mes(es) " + dias + " dia(s) de vida..." );

		}
		
	}

}
