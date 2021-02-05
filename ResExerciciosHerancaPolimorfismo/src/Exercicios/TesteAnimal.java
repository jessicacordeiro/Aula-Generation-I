package Exercicios;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
		
		String Nome;
		int escolhaTipo;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.print("Nome do seu animalzinho: ");
		Nome = ler.nextLine();
		System.out.print("Escolha o tipo do seu animalzinho:\n1- Cavalo \n2- Cachorro \n3- Preguiça \nR: ");
		escolhaTipo = ler.nextInt();
		
		AnimalCavalo cavalo = new AnimalCavalo(null, null);
		AnimalCachorro cachorro = new AnimalCachorro(null, null);
		AnimalPreguica preguica = new AnimalPreguica(null, null);
		
		Animal animal = null;
		
		if(escolhaTipo == 1) {
			
			animal = cavalo;	
		}
		else if(escolhaTipo == 2) {
			
			animal = cachorro;
		}
		else if(escolhaTipo == 3){
			
			animal = preguica;
		}
		else {
			
			System.out.println("Número Inválido Digite Novamente!!");
		}
		
		animal.setAtrNome(null);
		animal.setAtrTipo(null);
		animal.setIdade(0);
		animal.setSom(null);
		animal.setCorrer(0);
	
	}
}
