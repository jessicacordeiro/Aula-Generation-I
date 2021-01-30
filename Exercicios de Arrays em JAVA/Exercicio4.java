package ExerciciosArrays;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int l,c,mat[][] = new int[3][3];
		int soma=0,somadiagonal;
		
		try (Scanner ler = new Scanner(System.in)) {
			
			for(l=0;l<3;l++)
			{
				System.out.printf("Digite os números %da. linha:\n", (l+1));
				 	for(c=0;c<3;c++)
					{
						System.out.printf("Mat[%d][%d] = ",l,c);
						mat[l][c] = ler.nextInt();
						soma = soma +mat[l][c];
					}
			}
			
			System.out.printf("\nA soma dos valores: %d \n", soma);
			
			somadiagonal = mat[0][0] + mat[1][1] + mat[2][2];
			
			System.out.printf("\nA soma da diagonal principal: %d \n", somadiagonal);
		}
	}
}
