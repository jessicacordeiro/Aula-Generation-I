package ExerciciosdeRepeticao;

import java.util.Scanner;

//o número de pessoas calmas; npc
//o número de mulheres nervosas; nmn
//o número de homens agressivos; nha
//o número de outros calmos; noc
//o número de pessoas nervosas com mais de 40 anos; npn40
//o número de pessoas calmas com menos de 18 anos; npc18
//fator psicologico; fp

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		int idade,sexo,npessoas=1,fp,npc=0,nmn=0,nha=0,noc=0,npn40=0,npc18=0;
		
		try (Scanner ler = new Scanner(System.in)) {
			
			while(npessoas<=5)
			{
				System.out.println("Digite a sua idade por favor: ");
				idade = ler.nextInt();
				while(idade<0 || idade>130)
				{
					System.out.println("Você digitou uma idade inexistente, digite novamente a sua idade: ");
					idade = ler.nextInt();
				}
				
				System.out.println("\nDigite o seu sexo: ");
				System.out.println("\n1-Feminino");
				System.out.println("\n2-Masculino");
				System.out.println("\n3-Outros");
				sexo = ler.nextInt();
				
				while(sexo<1 || sexo>3)
				{
					System.out.println("Numeração inválida, por favor digite o seu sexo novamente: ");
					sexo = ler.nextInt();
				}
				
				System.out.println("\nDigite o seu fator psicológico no dia de hoje: ");
				System.out.println("\n1-Estou Calma(o)");
				System.out.println("\n2-Estou Nervosa(o)");
				System.out.println("\n3-Estou Agressiva");
				fp = ler.nextInt();
				
				while(fp<1 || fp>3)
				{
					System.out.println("Numeração inválida, por favor digite novamente o seu fator psicológico no dia de hoje: ");
					fp = ler.nextInt();
				}
				
				if(fp==1) 
				{
					npc++;
				}
				if(sexo==1 && fp==2)
				{
					nmn++;
				}
				if(sexo==2 && fp==3)
				{
					nha++;
				}
				if(sexo==3 && fp==1)
				{
					noc++;
				}
				if(fp==2 && idade>40)
				{
					npn40++;
				}
				if(fp==1 && idade<18)
				{
					npc18++;
				}
				npessoas++;
			}
			System.out.println("\nExistem em nossa empresa " + npc + " de pessoas calmas...");
			System.out.println("\nE " + nmn + " de mulheres nervosas...");
			System.out.println("\nE " + nha + " de homens agressivos...");
			System.out.println("\nE " + noc + " de outros calmos...");
			System.out.println("\nE " + npn40 + " de pessoas com mais de 40 anos nervosas...");
			System.out.println("\nE por fim " + npc18 + " de pessoas menores de 18 anos calmas...");
		}	
	}
}
