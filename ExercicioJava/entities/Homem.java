package entities;

public abstract class Homem extends PessoaIMC {
    
    public Homem (String nome, String dataNasc, double peso, double altura, double IMC){
        super(nome, dataNasc, peso,altura);
    }

    public void resultIMC(double IMC){
        if (IMC < 20.7){
            System.out.println("Abaixo do Peso");
        }
        else if (IMC >= 20.7 && IMC <=26.4){
            System.out.println("Peso ideal");
        }
        else{ 
            System.out.println("Acima do peso ideal");
        }
        return ;        
    }
}
