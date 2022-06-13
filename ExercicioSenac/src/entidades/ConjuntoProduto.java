package entidades;

import java.util.ArrayList;

public class ConjuntoProduto {
	
	public ConjuntoProduto(ArrayList<Produto> produtos) {
		super();
	}
	
	private static ArrayList<Produto> produtos;
	
	public ConjuntoProduto() {
		super();
		this.produtos = new ArrayList<Produto>();
	}

	public void inserirProduto(Produto produto) {
		int codigoAtual = produto.getCodigo();
		for(int i = 0; i < produtos.size(); i++) {
			Produto prod = produtos.get(i);
			if(prod.getCodigo().equals(codigoAtual)) {
				System.out.println("ERROR: o código já foi cadastrado");
				return;
			}
		}
		this.produtos.add(produto);
		System.out.println("O produto foi cadastrado!");
	}

    public void removerProduto(Produto produtoRemover) {
		produtos.remove(produtoRemover);
		System.out.println("O produto foi removido!");
    }
	
	public void atualizarProduto(Produto produtoAtualizar, Produto novoProduto){
		int codigoAtual = novoProduto.getCodigo();
		for(int i = 0; i < produtos.size(); i++) {
			Produto product = produtos.get(i);
			if(product.getCodigo().equals(codigoAtual)) {
				System.out.println("ERROR: o código já foi cadastrado");
				return;
			}
		}
		int p = produtos.indexOf(produtoAtualizar);
		produtos.set(p, novoProduto);
		System.out.println("Produto atualizado!");
	}

	  
 	public void mostrarProduto() {
 		System.out.println("..::.::...::...::.::..");
 		for(int i = 0; i < produtos.size(); i++) {
 			Produto produto = produtos.get(i);
 			Fornecedor fornecedor = produto.getFornecedor();
 			System.out.println("Produto: "+produto.getCodigo());
 			System.out.println("Nome: "+produto.getNome());
 			System.out.println("Valor: "+produto.getValor());
 			System.out.println("Codigo: "+produto.getCodigo());
 			System.out.println("Fornecedor: "+fornecedor.getNome());
 			System.out.println("..::.::...::...::.::..");
 		}
	}
 	
 	public void atualizarPorPorcentagem(float porcentagem) {
 		for(int i = 0; i < produtos.size(); i++) {
 			Produto produto = produtos.get(i);
 			produto.atualizarPreco(porcentagem);
 		}
 		System.out.println("O(s) preço(s) do(s) produto(s) foi/foram atualizado(s)");
	}
 	
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}


	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}


}
