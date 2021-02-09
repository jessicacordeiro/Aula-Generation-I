package AmiPets;

public interface Animal {
	
public String nomeInterface = "Animais";
	
	
	abstract  String getNomeAnimal( );
	abstract void setNomeAnimal(String Nome);
	abstract String getIdade( );
	abstract void setIdade(String idade);
	abstract double getPeso( );
	abstract void setPeso(double peso);
	abstract String getCor( );
	abstract void setCor(String cor );
	abstract String getSexo( );
	abstract void setSexo(String sexo);
	abstract String getRaca();
	abstract void setRaca(String raca);
	abstract public void banhoETosa();
	abstract public void creche();
	abstract public void passeio();
	abstract public void valortotal();
	abstract public String formatarMoeda();
	abstract public void formaPagamento();
	abstract public void notaFiscal();
	abstract public void notaFisca2();
	

}
