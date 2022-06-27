package entidades;

public class Homem extends PessoaIMC {
	
	public Homem (String nome, String dataNasc, double peso, double altura){
	    super(nome, dataNasc, peso,altura);
	}
	
	public String resultadoIMC() {
	    double IMC = calculoIMC(this.altura, this.peso);
	    if (IMC < 20.7){
	        System.out.println("Abaixo do Peso ideal");
	    }
	    else if (IMC >= 20.7 && IMC <=26.4){
	        System.out.println("Peso ideal");
	    }
	    else{ 
	        System.out.println("Acima do peso ideal");
	    }
	    String IMCfinal = String.valueOf(IMC);
	    return IMCfinal;
	}
}	