package ExerciciosProgramaSequencial;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String args[]) 
	{
		
		double custodefabrica,custodistribuidora,imposto,custofinal;
		
		try (Scanner ler = new Scanner(System.in)) {
			
			System.out.println("Descubra o Custo Final do seu Carro Aqui: ");
			
			System.out.println("Digite o custo de fabrica do seu veiculo: ");
			custodefabrica = ler.nextDouble();
			
			custodistribuidora = 0.28*custodefabrica;
			imposto = 0.45*custodefabrica;
			custofinal = custodefabrica + imposto + custodistribuidora;
			
			System.out.printf("O custo para o consumidor final é de: %3.0f",custofinal);
			
		}
	}
}
