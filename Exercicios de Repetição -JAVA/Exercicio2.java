package ExerciciosdeRepeticao;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		int j,numero,somapar=0,somaimpar=0;
		
		try (Scanner ler = new Scanner(System.in)) 
		
		{
			for(j=1;j<10;j++)
			{
				System.out.println("Digite 10 números que representa algum dia importante da sua vida 10 vezes: ");
				numero = ler.nextInt();
				
					if(numero%2==0)
					{
						somapar++;
					}
					else
					{
						somaimpar++;
					}	
			}
			
			System.out.println("\nNesta condição temos "+ somapar +" pares e " + somaimpar +" impares...");
		}
		
	}
}
