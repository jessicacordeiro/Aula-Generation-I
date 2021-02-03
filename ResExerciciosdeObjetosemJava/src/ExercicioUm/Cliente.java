package ExercicioUm;

import java.text.NumberFormat;

public class Cliente {
	
	//declaração dos atributos
	String Nome,Sexo,gostoMusical;
	double Idade,Salario;
	
	//método construtor 
	
	public Cliente(String Nome, String Sexo, String gostoMusical, double Idade, double Salario)
	
	{
		
		this.Nome = Nome;
		this.Sexo = Sexo;
		this.gostoMusical = gostoMusical;
		this.Idade = Idade;
		this.Salario = Salario;
		
	}
	
	//declaração dos demais métodos da classe

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public String getGostoMusical() {
		return gostoMusical;
	}

	public void setGostoMusical(String gostoMusical) {
		this.gostoMusical = gostoMusical;
	}

	public double getIdade() {
		return Idade;
	}

	public void setIdade(double idade) {
		Idade = idade;
	}
	
	public void getSalario(double Salario) {
		Salario = Salario;
	}
	
	public void setSalario(double Salario) {
		Salario = Salario;
	}
		
	public String formatarMoeda() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(Salario);
		return formatoMoeda;
	}
	
	public void imprimirinfomacao() {
		
		System.out.println("\n************************\n");
		System.out.println( "***Cliente***\n\nNome: " + Nome + "\n\nTem: " + Idade + " anos" + "\n\nSexo: " + Sexo + "\n\nGosto Musical: " + gostoMusical + "\n\n" + "Salário Bruto: " + this.formatarMoeda());
	}
}
