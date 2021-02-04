package Exercicios;

public class testeFornecedore {

	public static void main(String[] args) {
		
		Fornecedore Marcela = new Fornecedore(null, null, null, 0, 0, 0);
		
		Marcela.setNome("Marcela dos Reis");
		Marcela.setEndereco("Rua Inocêncio Nogueira, n° 2568");
		Marcela.setTelefone("(11) 69998-2568");
		Marcela.setValorCredito(2900);
		Marcela.setValorDivida(690);
		Marcela.setObterSaldo(0);
		
		Marcela.imprimirinformacao();
		
	}
}
