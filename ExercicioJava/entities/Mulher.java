package entities;

public abstract class Mulher extends PessoaIMC {

    public Mulher(String nome, String dataNasc, double peso, double altura, double IMC){
        super(nome, dataNasc, peso,altura);
    }

    public void resultIMC(double IMC){
        if (IMC < 19.0){
            System.out.println("Abaixo do Peso ideal");
        }
        else if (IMC >= 19.0 && IMC <=25.8){
            System.out.println("Peso ideal");
        }
        else{ 
            System.out.println("Acima do peso ideal");
        }
        return;        
    }
    
}
