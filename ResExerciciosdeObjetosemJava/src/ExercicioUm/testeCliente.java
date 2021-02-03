package ExercicioUm;

public class testeCliente {
	
	public static void main(String[] args) {
		
	System.out.println("*****Mapeamento de Cliente da loja MOONSONG*****");
	
	Cliente[] objCliente = new Cliente[4];
	
	objCliente[0] = new Cliente ("Maísa R. Silva", "Feminino", "Rock", 17, 1500);
	objCliente[1] = new Cliente ("Rodolfo Rios", "Masculino", "Punk Rock", 25, 2000 );
	objCliente[2] = new Cliente ("Monalisa S. Souza", "Outros", "Classic Metal", 36, 800);
	objCliente[3] = new Cliente ("Silvio M. Jr.", "Masculino", "Screamo", 23, 1000);
	
	for(double x=0; x<=2;x++) {
		
		objCliente[(int) x].imprimirinfomacao();
	}
	
	System.out.println("\n************************\n");
	
	}
}
