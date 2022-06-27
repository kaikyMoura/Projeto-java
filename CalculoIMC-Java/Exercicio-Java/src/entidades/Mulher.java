package entidades;

public class Mulher extends PessoaIMC {

	public Mulher (String nome, String dataNasc, double peso, double altura){
	    super(nome, dataNasc, peso,altura);
	}
		
	public String resultadoIMC() {
	    double IMC = calculoIMC(this.altura, this.peso);
	    if (IMC < 19.0){
	        System.out.println("Abaixo do Peso ideal");
	    }
	    else if (IMC >= 19.0 && IMC <=25.8){
	        System.out.println("Peso ideal");
	    }
	    else{ 
	        System.out.println("Acima do peso ideal");
	    }
	    String IMCfinal = String.valueOf(IMC);
	    return IMCfinal;
	}
}	