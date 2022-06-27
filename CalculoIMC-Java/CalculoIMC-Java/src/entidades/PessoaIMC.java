package entidades;

public abstract class PessoaIMC extends Pessoa {
	
	protected double peso, altura;

	public PessoaIMC (String nome, String dataNasc,double peso, double altura) {
		super(nome, dataNasc);
		this.peso = peso;
		this.altura = altura;
	}
	
	                                                          
	public double calculoIMC(double altura, double peso) {
		double IMC = peso/(altura*altura);
		return IMC;
	}
	
	
	public abstract String resultadoIMC();
	
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}


	@Override
	public String toString() {
		return "Nome: " + nome 
		+ ", dataNascimento: " + dataNasc 
		+ ", peso: " + peso 
		+ ", altura: " + altura;
	}
	
}


