package entidades;

public class Produto {

	public Produto() {
		super();
	}
	public Produto(Integer codigo, String nome, float valor, Fornecedor fornecedor) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		this.fornecedor = fornecedor;
	}
	
	private Integer codigo;
	private String nome;
	private float valor;
	private Fornecedor fornecedor;
	
	//Almeuntar valor do produto (porcentagem)
	public void atualizarPreco(float porcentagem) {
		this.valor = this.valor * (1 + (porcentagem/100));		
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor){
		this.valor = valor;
	}	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


}
