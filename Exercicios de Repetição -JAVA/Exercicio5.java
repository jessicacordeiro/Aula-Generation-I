package ExerciciosdeRepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int numero,soma=0;
		
		try (Scanner ler = new Scanner(System.in)) {
			
			do
			{
				System.out.println("Digite um número de sua preferência(porém inteiro): ");
				numero = ler.nextInt();
				
					if(numero!=0)
					{
						soma = soma + numero;
					}
					
			}while(numero>0);
			
			System.out.println("A soma dos números de sua preferência é: " + soma);
		}
	}
}
