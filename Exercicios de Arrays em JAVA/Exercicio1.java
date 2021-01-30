package ExerciciosArrays;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	
		int p, n=5;
		int vet[] = new int[n];
		
		
			try (Scanner ler = new Scanner(System.in)) {
			
				for(p = 0; p < n;p++)
				{
					System.out.println("Digite o " + (p+1) + " ° valor da atividade: ");
					vet[p] = ler.nextInt();
	
				}
				
					int smaller = vet [0], bigger = vet [0];
				
						for(p=0;p<5;p++)
						{
							if(vet[p] < smaller) 
							{
								smaller = vet[p];
							}
							else if(vet[p] > bigger)
							{
								bigger = vet[p];
							}
						}
					
							for(p=0;p<5;p++)
							{
								if (vet[p] == bigger)
								{
									System.out.printf("\nVetor[%d] = %2d ----> Maior Valor",p,vet[p]);
								}
								else
								{
									System.out.printf("\nVetor[%d] = %2d\n",p,vet[p]);
								}
							}
				}
		}
}
