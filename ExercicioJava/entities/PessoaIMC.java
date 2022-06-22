package entities;

public abstract class PessoaIMC extends Pessoa {

    protected double peso, altura;
    
    public PessoaIMC (String nome, String dataNasc, double peso, double altura){
        super(nome, dataNasc);
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void calculaIMC (double peso, double altura) {
        double IMC = this.peso/Math.pow(this.altura,2); 
    }

    public abstract String resultIMC();

    
    @Override
    public String toString() {
		return "Nome: "+ nome
                + "Data de Nascimento: " + dataNasc
                + "Peso: "+ peso
                + "Altura: "+ altura;
	} 

}