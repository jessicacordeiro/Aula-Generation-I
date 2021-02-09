package AmiPets;

import java.util.Scanner;
import java.util.ArrayList;

public class TesteAmiPets {

	public static void main(String[] args) throws InterruptedException {
		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();
		try(Scanner ler = new Scanner (System.in)){
		
		new Thread();
		System.out.println("Bem vindos(as) à AMIPETS,à melhor opção para o seu PET!!");
		Thread.sleep(700);
		System.out.println("Quais dos tipos abaixo é o seu amiguinho????");
		Thread.sleep(700);
		System.out.println("Digite [1] --> Cachorro \nDigite [2] --> Gato");
		int op = ler.nextInt();
		while(op <1 || op>2) {
			System.out.println("Opção inválida!!");
			System.out.println("Quais dos tipos abaixo é o seu amiguinho????");
			Thread.sleep(700);
			System.out.println("Digite [1] --> Cachorro \nDigite [2] --> Gato");
			op = ler.nextInt();
		}
		
		switch(op) {
		
		case 1 : cachorro.cadastro();
			char continua;
			do {
			
		System.out.println("Venha conhecer as nossas opções pro "+cachorro.getNomeAnimal()+"!!!");
		Thread.sleep(700);
		System.out.println("[1] Banho e tosa --> (R$ 40,00 pequeno porte, R$ 50,00 médio porte, R$ 75,00 grande porte).");
		Thread.sleep(700);
		System.out.println("[2] Creche --> (R$ 40,00 a 1º hora, R$ 15,00 as demais horas).");
		Thread.sleep(700);
		System.out.println("[3] Passeio --> (R$ 30,00 a 1º hora, R$ 20,00 as demais horas).");
		Thread.sleep(700);
		System.out.println("Digite sua opção...");
		int op2 = ler.nextInt();
		while(op2 <1 || op2>3) {
			System.out.println("Opção inválida!!");
			Thread.sleep(700);
			System.out.println("[1] Banho e tosa --> (R$ 40,00 pequeno porte, R$ 50,00 médio porte, R$ 75,00 grande porte).");
			Thread.sleep(700);
			System.out.println("[2] Creche --> (R$ 40,00 a 1º hora, R$ 15,00 as demais horas).");
			Thread.sleep(700);
			System.out.println("[3] Passeio --> (R$ 30,00 a 1º hora, R$ 20,00 as demais horas).");
			Thread.sleep(700);
			System.out.println("Digite sua opção...");
			op2 = ler.nextInt();
		}

		switch(op2) {
		
		case 1: 
			Thread.sleep(700);
			System.out.print("Qual o peso do "+cachorro.getNomeAnimal()+"? ");
			cachorro.setPeso(ler.nextDouble());
			cachorro.banhoETosa();break;
		
		case 2:
			
			cachorro.creche();break;
			
		case 3:
		
			cachorro.passeio();break;
			
		}
		
		cachorro.valortotal();
		Thread.sleep(700);
		//cachorro.formaPagamento();
		Thread.sleep(700);
		System.out.print("Deseja adicionar mais algum serviço [SIM] ou [NÃO]? ");
		continua  = ler.next().charAt(0);
		if(continua == 'S' || continua == 's') {
			
		} else {
			
			cachorro.formaPagamento();
			
		}
	
		}while(continua == 'S' || continua == 's');break;
		
		
		case 2:
			Thread.sleep(700);
			gato.cadastro();
			
			char continua2;
			do {
		
		Thread.sleep(700);
		System.out.println("Venha conhecer as nossas opções pro seu amiguinho!!!");
		Thread.sleep(700);
		System.out.println("[1] Banho e tosa --> (R$ 50,00 ).");
		Thread.sleep(700);
		System.out.println("[2] Creche --> (R$ 80,00 a 1º hora, R$ 25,00 as demais horas).");
		Thread.sleep(700);
		System.out.println("[3] Passeio --> (R$ 50,00 a 1º hora, R$ 30,00 as demais horas).");
		Thread.sleep(700);
		System.out.println("Digite sua opção...");
		int op3 = ler.nextInt();
		while(op3 <1 || op3>3) {
		System.out.println("Opção inválida!!");
		Thread.sleep(700);
		System.out.println("[1] Banho e tosa --> (R$ 50,00 ).");
		Thread.sleep(700);
		System.out.println("[2] Creche --> (R$ 80,00 a 1º hora, R$ 25,00 as demais horas).");
		Thread.sleep(700);
		System.out.println("[3] Passeio --> (R$ 50,00 a 1º hora, R$ 30,00 as demais horas).");
		Thread.sleep(700);
		System.out.println("Digite sua opção...");
		op3 = ler.nextInt();
		
		}
		
		switch(op3) {
		
		case 1: 
			
			gato.banhoETosa();break;
		
		case 2:
			gato.creche();break;
			
		case 3:
			gato.passeio();break;
			
		}
		
		gato.valortotal();
		Thread.sleep(700);
		System.out.println("---------------------------------------------------");
		System.out.print("Deseja adicionar mais algum serviço [SIM] ou [NÃO]? ");
		continua2  = ler.next().charAt(0);
		if(continua2 == 'S' || continua2 == 's') {
			
		} else {
			
			gato.formaPagamento();
			
		}
		
		}while(continua2 == 'S' || continua2 == 's');break;
		
		}
		System.out.println("Obrigado por utilizar nossos serviços, AMIPETS agradece!!!!!!");
		Thread.sleep(10000);
		System.out.println("         __ __");
		System.out.println("        ,;::\\::\\");
		System.out.println("      ,'/' `/'`/");
		System.out.println("  _\\,: '.,-'.-':.");
		System.out.println(" -./\"'  :    :  :\\/,");
		System.out.println("  ::.  ,:____;__; :-");
		System.out.println("  :\"  ( .`-*'o*',);");
		System.out.println("   \\.. ` `---'`' /");
		System.out.println("    `:._..-   _.'");
		System.out.println("    ,;  .     `.");
		System.out.println("   /\"'| |       \\");
		System.out.println("  ::. ) :        :");
		System.out.println("  |\" (   \\       |");
		System.out.println("  :.(_,  :       ;");
		System.out.println("   \\'`-'_/      /");
		System.out.println("    `...   , _,'");
		System.out.println("     |,|  : |");
		System.out.println("     |`|  | |");
		System.out.println("     |,|  | |");
		System.out.println(" ,--.;`|  | '..--.");
		System.out.println("/;' \"' ;  '..--. ))");
		System.out.println("\\:.___(___   ) ))'");
		System.out.println("\n");
		System.out.println("            ,-----.");
		System.out.println("          /       \\--.");
		System.out.println("          |       /   \\");
		System.out.println("          `. \\-+-',___/");
		System.out.println("            \\ \\ \\ \\");
		System.out.println("          ,--\\/\"\"\"\\\"\".");
		System.out.println("    `._  /    \\    \\  \\");
		System.out.println("    _  `|   (  \\   o\\o|.,--.");
		System.out.println("     `-' \\   \\`-;---'-'(   #)");
		System.out.println("          `._ \\ |\\      `--/");
		System.out.println("\\.           \\ ||,`.      /");
		System.out.println(" \\`..--.._    ||/   `===='.");
		System.out.println("  \\/     _`.__|| .-.    \\  \\");
		System.out.println("  |     / \\    |'|  `.   !  |");
		System.out.println("  \\     \\_/    \\_.')  \\  !  |");
		System.out.println("  ,\"\".  .        _/    \\   /");
		System.out.println(" /      ;`--'\\  \\ \\     `-'");
		System.out.println(" |  |`-<      \\  \\ \\");
		System.out.println(" |  |\\  \\,---. \\  \\ \\,---.");
		System.out.println(" |  |,---.    `.\\  \\,---. `.");
		System.out.println(" >        `. | | \\       `.|");
		System.out.println("(        | |-'-' (      | |'");
		System.out.println(" `-------'-'      `-----'-' ");

	}catch(Exception z) {
		System.out.println("Erro,programa finalizado...Inicie novamente. "+z);
	
	}
	}
}
