package EstoqueCatPink;

import java.util.ArrayList;
import java.util.Scanner;

public class ColecaoEstoqueCatPink {
	
public static void main(String[] args) {
		
	// Inserindo variáveis
	
	int op;
	
	//Instanciando objetos...
	
		try (Scanner ler = new Scanner(System.in)){
			
		ArrayList<String> estoque = new ArrayList();
	
	// começando a colocar a mão na massa...
		
			do {
				
				System.out.println("\n*************ESTOQUE DA LOJA CAT PINK*******************");
				System.out.println("           Digite uma opção para começar: "         );
				System.out.println("-------------------------------------------------------");
				System.out.println("1 - Deseja adicionar novos modelos de brincos ao estoque\n2 - Deseja remover algum modelo do estoque\n3 - Deseja Atualizar algum brinco\n4 - Visualizar todos os modelos de brincos do estoque\n0 - Encerrar o programa");
				System.out.println("-------------------------------------------------------");
				op = ler.nextInt();
				
				//colocar um if ou case depois que contabilize a entrada e retirada em questão de quantidade dos brincos vai ter no estoque...
				
					if (op ==1 ) {
				
			
						ler.nextLine();
						System.out.println("Digite o nome do novo modelo de brinco ao estoque: ");
						String brinco = ler.nextLine();
				
						estoque.add(brinco);
						System.out.println("*" + brinco + " adicionado(s) com sucesso!*");
				
				}
				
				
					else if(op == 2) {
				
						ler.nextLine();
						System.out.println("Digite por favor, o nome do brinco para remove-lo do estoque: ");
						String brinco1 = ler.nextLine();
					
							if(estoque.contains(brinco1)) {
						
								estoque.remove(brinco1);
					
							} else {
						
								System.out.println("Brinco não encontrado no estoque");
							}
					}
					
					else if(op == 3) {
	
					
						ler.nextLine();
						System.out.println("Digite por favor, o nome do brinco que você deseja atualizar: ");
						String verifica = ler.nextLine();
						System.out.println("Digite o nome do brinco que entrará no lugar do " +verifica+".");
						String novo = ler.nextLine();
				
							if(estoque.contains(verifica)){
						
								estoque.remove(verifica);
								estoque.add(novo);
						
							} else {
						
								System.out.println("Brinco não encontrado no estoque");
						
							}
							
					} else if (op == 4){
						
					
						ler.nextLine();
						System.out.println("Temos estes brincos disponíveis no estoque: ");
						System.out.println(estoque);
						
					} else {
						
						System.out.println("Obrigada por ter atualizado o estoque da loja, programa finalizado!!");
					}
			
			} while(op!=0);	
		}
	}
}
