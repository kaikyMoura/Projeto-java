package principal;

import entidades.ConjuntoProduto;
import entidades.Fornecedor;
import entidades.Produto;

public class TesteProduto {
	public static void main(String[] args) {

		//Inserts
		Fornecedor fornecedor1 = new Fornecedor("1234321",null, "Zé maria");
		Fornecedor fornecedor2 = new Fornecedor("543212345",null, "Claúdio");
		
		Produto produto1 = new Produto(new Integer(1),"TV LCD", 3500, fornecedor1);
		Produto produto2 = new Produto(new Integer(2),"notebook", 2000, fornecedor2);
		Produto produto3 = new Produto(new Integer(3),"impressora", 232, fornecedor2);
		
		
		//Metodos da classe ConjuntoProduto
		ConjuntoProduto alterarC = new ConjuntoProduto();

		alterarC.inserirProduto(produto1);
		alterarC.inserirProduto(produto2);
		alterarC.inserirProduto(produto3);

		alterarC.atualizarPorPorcentagem(10);
		alterarC.mostrarProduto();
	}
}
