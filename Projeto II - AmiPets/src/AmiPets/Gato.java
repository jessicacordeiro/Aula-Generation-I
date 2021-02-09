package AmiPets;

import java.text.NumberFormat;
import java.util.ArrayList;

public class Gato extends SuperPet implements Animal  {

	private String nomeAnimal;
	private String raca;
	private String idade;
	private double peso;
	private String cor;
	private String sexo;
	private double valor;
	
	
	public Gato() {
		super();
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public void cadastro() throws InterruptedException {
		ArrayList <String> donoInfo = new ArrayList();
		ArrayList <String> gatoInfo = new ArrayList();
		System.out.println("MARAVILHA!!! um cat xD ");
		Thread.sleep(700);
		System.out.println("Vamos para o seu cadastro!");
		Thread.sleep(700);
		System.out.println("-------------------------------");
		Thread.sleep(700);
		System.out.print("Qual o seu nome? ");
		Thread.sleep(700);
		setNomeDono(ler.nextLine());
		donoInfo.add(getNomeDono());
		Thread.sleep(700);
		System.out.print("Qual o seu endereço? ");
		Thread.sleep(700);
		setEndereco(ler.nextLine());
		donoInfo.add(getEndereco());
		Thread.sleep(700);
		System.out.print("Qual o seu cpf? ");
		Thread.sleep(700);
		setCpf(ler.nextLine());
		donoInfo.add(getCpf());
		Thread.sleep(700);
		System.out.print("Qual o seu telefone? ");
		Thread.sleep(700);
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
		System.out.print("Qual o nome do cat? ");
		setNomeAnimal(ler.nextLine());
		gatoInfo.add(getNomeAnimal());
		Thread.sleep(700);
		System.out.print("Qual a idade do "+getNomeAnimal()+"? ");
		setIdade(ler.nextLine());
		gatoInfo.add(getIdade());
		Thread.sleep(700);
		System.out.print("Qual a raça do " +getNomeAnimal()+"? ");
		setRaca(ler.nextLine());
		gatoInfo.add(getRaca());
		Thread.sleep(700);
		System.out.print("Qual a cor do "+getNomeAnimal()+"? ");
		setCor(ler.nextLine());
		gatoInfo.add(getCor());
		Thread.sleep(700);
		System.out.print("Qual o sexo do "+getNomeAnimal()+"? ");
		setSexo(ler.nextLine());
		gatoInfo.add(getSexo());
		Thread.sleep(700);
		System.out.println("Cadastro finalizado... Segue os dados na tela!!");
		System.out.println("-------------------------------------------------");
		Thread.sleep(700);
		for(String cadastro2:gatoInfo)
		{
			System.out.printf("[%s]\n",cadastro2);
		}
		System.out.println("-------------------------------------------------");
		
	}
	
	@Override
	public void banhoETosa() {
		
		this.valor += 50;
		//System.out.println("O banho será no valor ");
	
	}
	@Override
	public void creche() {
		
		
		int	hora = 0;
		int acrescimo = 25;
		
			System.out.print("Digite por favor  quantas horas você deseja que AmiCat fique com o(a) "+" " +getNomeAnimal()+"? ");
			hora = ler.nextInt();
			
			if(hora==1) {
				this.valor +=80;
			System.out.println("AmiCat ficará com o " +getNomeAnimal()+" " +hora+ " hora na sua residência!");
			
			} else {
				
				
				System.out.println("AmiCat ficará com o " +getNomeAnimal()+" " +hora+ " horas na sua residência!");
				this.valor +=80+ (acrescimo*(hora-1));
		}
	
	}
	@Override
	public void passeio() {
		int acrescimo = 30;
		int hora = 0;
		
		System.out.print("Digite por favor  quantas horas você deseja que AmiCat passeie com o(a) "+getNomeAnimal()+"? ");
		hora = ler.nextInt();
		
		if(hora==1) {
			this.valor +=50;
			System.out.println("AmiCat passeará com o(a) " +getNomeAnimal()+" " +hora+ " hora! ");
			
			} else {
				
				System.out.println("AmiCat passeará com o(a) " +getNomeAnimal()+" " +hora+ " horas!");
				this.valor +=50+ (acrescimo*(hora-1));
		}
		

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
	public void valortotal() {
		{
			System.out.println("----------------------------------------------------------------");
			System.out.println("O valor total dos serviços será de "+this.formatarMoeda()+".");
		}
		
		
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
		System.out.println("Qual a forma de pagamento? [1] --> Débito/Crétito.");
		System.out.println("Qual a forma de pagamento? [2] --> A vista..");
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
		System.out.println("----------------------------");
		
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
		System.out.println("----------------------------");
		
		for(String notaFiscal1:notaFiscal)
		{
			System.out.printf("[%s]\n",notaFiscal1);
			
		}
		System.out.println("[Data] "+java.time.LocalDate.now()+"[Hora] "+java.time.LocalTime.now());
		
	}
		
}
