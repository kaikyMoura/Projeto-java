package principal;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entidades.Homem;
import entidades.Mulher;
import entidades.PessoaIMC;

public class Programa {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
	
		System.out.println("Qual é o tamanho do array?");
		int tamanhoArray = s.nextInt();
		
		System.out.println("É um objeto do tipo Homem (digite H) ou Mulher (digite M)?");
		String tipoObjeto  = s.next();
		
		ArrayList<PessoaIMC> pessoas = new ArrayList();

		for (int i = 0; i < tamanhoArray; i++) {
			System.out.println("Digite o seu nome: ");
			String nome = s.next();
			System.out.println("Digite a sua data de nascimento: ");
			String data = s.next();
			System.out.println("Digite o seu peso: ");
			double peso = s.nextDouble();
			System.out.println("Digite a sua altura: ");
			double altura = s.nextDouble();

			if (tipoObjeto.equals("H")) {
				Homem homem = new Homem(nome, data, peso, altura);
				pessoas.add(homem);

			} else if (tipoObjeto.equals("M")) {
				Mulher mulher = new Mulher(nome, data, peso, altura);
				pessoas.add(mulher);
			}

		}
		
		
		for (int i = 0; i < pessoas.size(); i++) {
			PessoaIMC pessoa = pessoas.get(i);
			System.out.println();
			System.out.println(pessoa.toString());
			System.out.println();
			System.out.println(pessoa.resultadoIMC());
		}
			
	}
}
	