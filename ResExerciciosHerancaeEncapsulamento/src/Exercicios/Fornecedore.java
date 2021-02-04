package Exercicios;

import java.text.NumberFormat;

public class Fornecedore extends Pessoa{
	
	private double valorCredito=0, valorDivida=0, obterSaldo;

	public Fornecedore(String nome, String endereco, String telefone, double valorCredito, double valorDivida, double obterSaldo) 
	{
		
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		this.obterSaldo = obterSaldo;
		
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public double getObterSaldo() {
		return obterSaldo;
	}

	public void setObterSaldo(double obterSaldo) {
		this.obterSaldo = obterSaldo;
	}
	
	public void obterSaldo(double obterSaldo) {
		
		obterSaldo = valorCredito - valorDivida;
		System.out.println("Com o pagamento da dívida" + valorDivida + "o seu saldo final é de: " + obterSaldo);
	
	}
	
	public String formatarMoeda() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(obterSaldo);
		return formatoMoeda;
	}
	
	public void imprimirinformacao() {
		
	System.out.println("\nObrigado Fornecedore: " + getNome() + "\n" + "Por pagar a divida de: " + valorDivida);
	}
}
