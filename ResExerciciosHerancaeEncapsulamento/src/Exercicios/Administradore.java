package Exercicios;

import java.text.NumberFormat;

public class Administradore extends Pessoa{
	
	protected double AjudadeCusto;

	public Administradore(String nome, String endereco, String telefone, double AjudadeCusto) 
	{
		
		super(nome, endereco, telefone);
		this.AjudadeCusto = AjudadeCusto;
		
	}

	public double getAjudadeCusto() {
		return AjudadeCusto;
	}

	public void setAjudadeCusto(double ajudadeCusto) {
		AjudadeCusto = ajudadeCusto;
	}
	
	public String formatarMoeda() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(AjudadeCusto);
		return formatoMoeda;
	}
	
	public void imprimirinformacao() {
		
		System.out.println("\nNome do Administrador: " + getNome() + "\n" + "Endereço da Franquia 3 - Candy Store: " + getEndereco() + "\n" + "Telefone do estabelecimento: " + getTelefone() + "\n" + "Valor dado para Ajudar nos Custos da Franquia: " + this.AjudadeCusto);
	
	}
}
