package ExercicioSeis;

public class TesteContaBancaria {
	
	public static void main(String[] args) {
		
		//demonstração da conta
		
		ContaBancaria minhaConta = new ContaBancaria("Jéssica A. Cordeiro", 25698563-9, 1500.0);
	
		//instanciando a classe ContaBancaria
		
		minhaConta.imprimirinfomacao();
		
		System.out.println("\n************************\n");
		
		//alterando os valores dentro da minha conta

        // sacar 200 reais
        minhaConta.sacar(700);
        
        System.out.println("**AVISO**\nFoi sacado da sua Conta o valor de R$700,00");
        System.out.println("\n************************\n");

        // depositar 500 reais
        minhaConta.depositar(500);

        System.out.println("**AVISO**\nFoi depositado na sua Conta o valor de R$500,00");
        System.out.println("\n************************\n");
        
        minhaConta.imprimirinformacaofinal();
        	
	}

}
