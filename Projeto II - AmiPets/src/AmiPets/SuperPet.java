package AmiPets;

import java.util.Scanner;

abstract class SuperPet {
		
		Scanner ler = new Scanner (System.in);
		private String nomeDono;
		private String endereco;
		private String cpf;
		private String telefone;
		
				
		public SuperPet(String nomeDono,String endereco,String cpf,String telefone)
		{
			this.nomeDono = nomeDono;
			this.endereco = endereco;
			this.cpf = cpf;
			this.telefone = telefone;
			
		}
		abstract public void cadastro() throws InterruptedException;
		
		
			
		public SuperPet() {
			
		}
		
		public void imprimirInfo()
		{
			System.out.println(getNomeDono()+getEndereco());
		}

		public String getNomeDono() {
			return nomeDono;
		}

		
		public void setNomeDono(String nomeDono) {
			this.nomeDono = nomeDono;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}

	}

