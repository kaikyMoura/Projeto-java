package entidades;

public class Pessoa {
	
	protected String nome, dataNasc;

	public Pessoa(String nome, String dataNasc) {
		this.nome = nome;
		this.dataNasc = dataNasc;
		
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNasc;
	}
	public void setDataNascimento(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome 
		+ ", dataNascimento: " + dataNasc;
	}
	
}
