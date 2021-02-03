package ExercicioDois;

import java.text.NumberFormat;

public class Aviao {
	
	//declaração dos atributos
	private String Nome,Destino,Modelo;
	private double CPF,IDAssento,ValordaPassagem,Hora;
	
	//método construtor 
	
		public Aviao(String Nome, double CPF, String Destino, String Modelo, double IDAssentos, double ValordaPassagem, double Hora)
		
		{
			this.Nome = Nome;
			this.CPF = CPF;
			this.Destino = Destino;
			this.IDAssento = IDAssentos;
			this.Modelo = Modelo;
			this.ValordaPassagem = ValordaPassagem;
			this.Hora = Hora;
			
		}
		
		//declaração dos demais métodos da classe

		public String getNome() {
			return Nome;
		}

		public void setNome(String nome) {
			Nome = nome;
		}

		public String getDestino() {
			return Destino;
		}

		public void setDestino(String destino) {
			Destino = destino;
		}

		public String getModelo() {
			return Modelo;
		}

		public void setModelo(String modelo) {
			Modelo = modelo;
		}

		public double getCPF() {
			return CPF;
		}

		public void setCPF(double cPF) {
			CPF = cPF;
		}

		public double getIDAssento() {
			return IDAssento;
		}

		public void setIDAssento(double iDAssento) {
			IDAssento = iDAssento;
		}

		public double getValordaPassagem() {
			return ValordaPassagem;
		}

		public void setValordaPassagem(double valordaPassagem) {
			ValordaPassagem = valordaPassagem;
		}

		public double getHora() {
			return Hora;
		}

		public void setHora(double hora) {
			Hora = hora;
		}
		
		public String formatarMoeda() {
			
			NumberFormat nf = NumberFormat.getCurrencyInstance();
			nf.setMinimumFractionDigits(2);
			String formatoMoeda = nf.format(ValordaPassagem);
			return formatoMoeda;
		}
		
		public void imprimirinfomacao() {
			
			System.out.println("\n************************\n");
			System.out.println( "***Cartão de Embarque***\n\nNome: " + Nome + "\n\nCPF: " + CPF + "\n\nDestino: " + Destino + "\n\nModelo do Avião: " + Modelo + "\n\nLugar do seu Acento: " + IDAssento + "\n\nHora da Partida: " + Hora + "H" + "\n\nValor da Passagem: " + this.formatarMoeda());
		}

}
