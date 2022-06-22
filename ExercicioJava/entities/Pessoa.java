package entities;

public class Pessoa {
    
    private String nome, dataNasc;

    public Pessoa(String nome, String dataNasc) {
        this.nome = nome;
        this.dataNasc = dataNasc;
    }
    
    public String toString() {
		return "Nome: "+ nome
                + "Data de Nascimento: " + dataNasc;
	}

    
}
