package Exercicios;

public abstract class Animal { //criar uma classe abstrata
	
	public String atrTipo, atrNome; 
	
	public Animal(String parTipo, String parNome) {//construtores
		
		this.atrTipo = parTipo;
		this.atrNome = parNome;
		
	}
	
	abstract public void setSom(String tipoSons);
	abstract public void setCorrer(int paraVelocidade);
	abstract public void setIdade(int paraIdade);

	public String getAtrTipo() {
		return atrTipo;
	}

	public void setAtrTipo(String atrTipo) {
		this.atrTipo = atrTipo;
	}

	public String getAtrNome() {
		return atrNome;
	}

	public void setAtrNome(String atrNome) {
		this.atrNome = atrNome;
	}

}
