package ExercicioSeis;

import java.text.NumberFormat;

public class ContaBancaria {
	
	//declaração dos atributos
	
	private int numeroDaConta;
	private String nomeDoTitulardaConta;
	private double saldoDaConta;
	
	//método construtor 
	
	public ContaBancaria(String nomeDoTitulardaConta, int numeroDaConta, double saldoDaConta)
	
	{
		this.nomeDoTitulardaConta = nomeDoTitulardaConta;
		this.numeroDaConta = numeroDaConta;
		this.saldoDaConta = saldoDaConta;
	}
	
	//declaração dos demais métodos da classe

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getNomeDoTitulardaConta() {
		return nomeDoTitulardaConta;
	}

	public void setNomeDoTitulardaConta(String nomeDoTitulardaConta) {
		this.nomeDoTitulardaConta = nomeDoTitulardaConta;
	}

	public double getSaldoDaConta() {
		return saldoDaConta;
	}

	public void setSaldoDaConta(double saldoDaConta) {
		this.saldoDaConta = saldoDaConta;
	}
	
	public void depositar(double quantidade) {
		this.saldoDaConta += quantidade;
	}
	
	public void sacar(double quantidade) {
		double novoSaldoDaConta = this.saldoDaConta - quantidade;
		this.saldoDaConta = novoSaldoDaConta;
	}
	
	public String formatarMoeda() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(saldoDaConta);
		return formatoMoeda;
	}
		public void imprimirinfomacao() {
			
			System.out.println( "Olá " + nomeDoTitulardaConta + " seu saldo atual da conta: "+ numeroDaConta + " é de: " + this.formatarMoeda());
		}
		
		public void imprimirinformacaofinal() {
		
			System.out.println("Seu saldo total será de: " + this.formatarMoeda());
		}
		
}
		
		
