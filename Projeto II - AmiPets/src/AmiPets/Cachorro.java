package AmiPets;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Cachorro extends SuperPet implements Animal {
	Scanner ler = new Scanner (System.in);
	
	String nomeAnimal;
	private String raca;
	private String idade;
	private double peso;
	private String cor;
	private String sexo;
	private double valor;
	
	public Cachorro() {
		super();
	}
	public void cadastro() throws InterruptedException {
		ArrayList <String> donoInfo = new ArrayList();
		ArrayList <String> cachorroInfo = new ArrayList();
		System.out.println("MARAVILHA!!! um doguinho xD ");
		Thread.sleep(700);
		System.out.println("Vamos para o seu cadastro!");
		System.out.println("-------------------------------------------------");
		Thread.sleep(700);
		System.out.print("Qual o seu nome? ");
		setNomeDono(ler.nextLine());
		donoInfo.add(getNomeDono());
		Thread.sleep(700);
		System.out.print("Qual o seu endereço? ");
		setEndereco(ler.nextLine());
		donoInfo.add(getEndereco());
		Thread.sleep(700);
		System.out.print("Qual o seu cpf? ");
		setCpf(ler.nextLine());
		donoInfo.add(getCpf());
		Thread.sleep(700);
		System.out.print("Qual o seu telefone? ");
		setTelefone(ler.nextLine());
		donoInfo.add(getTelefone());
		System.out.println("Cadastro finalizado... Segue os dados na tela!!");
		System.out.println("-------------------------------------------------");
		Thread.sleep(700);
		for(String cadastro:donoInfo)
		{
			System.out.printf("[%s]\n",cadastro);
		}
		System.out.println("-------------------------------------------------");
		Thread.sleep(700);
		
		System.out.println("Agora vamos cadastrar seu amiguinho.... xD");
		Thread.sleep(700);
		System.out.print("Qual o nome do dog? ");
		setNomeAnimal(ler.nextLine());
		cachorroInfo.add(getNomeAnimal());
		Thread.sleep(700);
		System.out.print("Qual a idade do "+getNomeAnimal()+"? ");
		setIdade(ler.nextLine());
		cachorroInfo.add(getIdade());
		Thread.sleep(700);
		System.out.print("Qual a raça do " +getNomeAnimal()+"? ");
		setRaca(ler.nextLine());
		cachorroInfo.add(getRaca());
		Thread.sleep(700);
		System.out.print("Qual a cor do "+getNomeAnimal()+"? ");
		setCor(ler.nextLine());
		cachorroInfo.add(getCor());
		Thread.sleep(700);
		System.out.print("Qual o sexo do "+getNomeAnimal()+"? ");
		setSexo(ler.nextLine());
		cachorroInfo.add(getSexo());
		Thread.sleep(700);
		System.out.println("Cadastro finalizado... Segue os dados na tela!!");
		System.out.println("-------------------------------------------------");
		Thread.sleep(700);
		for(String cadastro2:cachorroInfo)
		{
			System.out.printf("[%s]\n",cadastro2);
		}
		System.out.println("-------------------------------------------------");
		
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	@Override
	public String getNomeAnimal() {
		return nomeAnimal;
	}
	@Override
	public void setNomeAnimal(String Nome) {
		this.nomeAnimal = Nome;
		
	}
	@Override
	public String getIdade() {
		return idade;
	}
	@Override
	public void setIdade(String idade) {
		this.idade = idade;
	}
	@Override
	public double getPeso() {
		return peso;
	}
	@Override
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String getCor() {
		return cor;
	}
	@Override
	public void setCor(String cor) {
		this.cor = cor;
		
	}
	@Override
	public String getSexo() {
		return sexo;
	}
	@Override
	public void setSexo(String sexo) {
		this.sexo = sexo;
		
	}
	@Override
	public String getRaca() {
		return raca;
	}
	@Override
	public void setRaca(String raca) {
		this.raca = raca;
	}


	@Override
	public void banhoETosa() {
		if(getPeso()<10) {
			System.out.println("O porte do cachorro é pequeno!");
			this.valor += 40;
		}
		else if(getPeso()>=10 && getPeso()<=15) {
			System.out.println("O porte do cachorro é médio!");
			this.valor += 50;
		}
		else
		{
			System.out.println("O porte do cachorro é grande!");
			this.valor += 75;
		}
	}
	
	@Override
	public void creche() {
		int	hora = 0;
		int acrescimo = 15;
		
			System.out.print("Digite por favor quantas horas você deseja que AmiCão fique com o"+" " +getNomeAnimal()+"? ");
			hora = ler.nextInt();
			
			if(hora==1) {
				this.valor +=40;
			System.out.println("AmiCão ficará com o " +getNomeAnimal()+" " +hora+ " hora na sua residência!");
			
			} else {
				System.out.println("AmiCão ficará com o " +getNomeAnimal()+" " +hora+ " horas na sua residência!");
				this.valor +=40+ (acrescimo*(hora-1));
		}
		
	}


	@Override
	public void passeio() {
		
		int acrescimo = 20;
		int hora = 0;
		
		System.out.print("Digite por favor quantas horas você deseja que AmiCão passeie com o(a) " +getNomeAnimal()+"? ");
		hora = ler.nextInt();
		
		if(hora==1) {
			this.valor +=30;
			System.out.println("AmiCão passeará com o(a) " +getNomeAnimal()+" " +hora+ " hora! ");
			
			} else {
				
				System.out.println("AmiCão passeará com o(a) " +getNomeAnimal()+" " +hora+ " horas!");
				this.valor +=30+ (acrescimo*(hora-1));
		}
		

	}
	@Override
	public void valortotal() {
		System.out.println("----------------------------------------------------------------");
		System.out.println("O valor total dos serviços será de "+this.formatarMoeda()+".");
		
	}
	@Override
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(valor);
		return formatoMoeda;

	}
	@Override
	public void formaPagamento() {
		System.out.println("Qual a forma de pagamento? [1] --> Débito/Crétito. ");
		System.out.println("Qual a forma de pagamento? [2] --> A vista.. ");
		double x= ler.nextDouble();
		if(x==1) {
			System.out.println("Pagamento bem sucedido!!");
			this.notaFisca2();
		}
		else{
			System.out.println("Você terá o desconto de 10%,o valor a pagar será de R$ "+(valor-(valor*0.10)));
			System.out.println("Pagamento bem sucedido!!");
			this.notaFiscal();
		}
		
	}
	@Override
	public void notaFiscal() {
		ArrayList <String> notaFiscal = new ArrayList();
		String CNPJ = "CNPJ - 77 77 777/0007-77";
		String IE = "IE: - 077/7777777";
		notaFiscal.add(CNPJ);
		notaFiscal.add(IE);
		notaFiscal.add("CPF CONSUMIDOR "+getCpf());
		notaFiscal.add("NOME CONSUMIDOR "+getNomeDono());
		notaFiscal.add("Total "+(valor-(valor*0.10)));
		System.out.println("Segue a nota fiscal.");
		System.out.println("-------------------------");
		for(String notaFiscal1:notaFiscal)
		{
			System.out.printf("[%s]\n",notaFiscal1);
			
		}
		System.out.println("[Data] "+java.time.LocalDate.now()+"[Hora] "+java.time.LocalTime.now());
	}
	@Override
	public void notaFisca2() {
		ArrayList <String> notaFiscal = new ArrayList();
		String CNPJ = "CNPJ - 77 77 777/0007-77";
		String IE = "IE: - 077/7777777";
		notaFiscal.add(CNPJ);
		notaFiscal.add(IE);
		notaFiscal.add("CPF CONSUMIDOR "+getCpf());
		notaFiscal.add("NOME CONSUMIDOR "+getNomeDono());
		notaFiscal.add("Total "+valor);
		System.out.println("Segue a nota fiscal.");
		System.out.println("-------------------------");
		for(String notaFiscal1:notaFiscal)
		{
			System.out.printf("[%s]\n",notaFiscal1);
			
		}
		System.out.println("[Data] "+java.time.LocalDate.now()+"[Hora] "+java.time.LocalTime.now());
		
	}	

}

