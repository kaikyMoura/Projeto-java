import java.util.Scanner;
public class projetojava {

		static String[][] contas = new String[100][3];
		static int indice = 0;

		public static void main(String[] args) {

			int opcao = 0;
			Scanner s = new Scanner(System.in);

			while (opcao != 9)  {
				System.out.println("\nSistema de Cadastro de contas \n");
				System.out.println("Digite a sua opção:");
				System.out.println("1 - Cadastrar Conta");
				System.out.println("2 - Consultar Conta");
				System.out.println("3 - Alterar Conta");
				System.out.println("4 - Remover Conta");
				System.out.println("5 - Exibe todas as contas");
				System.out.println("9 - Sair do sistema");
				System.out.print("Sua opção: ");
				opcao = s.nextInt();
				switch (opcao)  {
				case 1: // cadastrar conta
					inserirConta();
					break;
				case 2: // consultar conta
					consultarConta();
					break;
				case 3: // alterar conta
					alterarConta();
					break;
				case 4: // remover conta
					removerConta();
					break;
				case 5: // exibe todas as contas
					exibe_todas_as_contas();
					break;
				}
				try { 	Thread.sleep(3000);  }

				catch(Exception e)  {   e.printStackTrace(); }
			}
			// encerramento do programa...
			System.out.println("Tchau...");
		}
		
		
		public static String Leia(String param) {
			java.io.DataInputStream dado_lido;
			String stemporario = "";
			try   {
				dado_lido = new java.io.DataInputStream(System.in);
				stemporario = dado_lido.readLine();
			}catch (Exception e) { }
			return stemporario;
		}  


		public static int procurarIndice(String numero) {
			int i = 0;
			boolean achou;
			for (achou = false; !achou && i < indice;) {
				if (contas[i][0].equals(numero)) {
					achou = true;
				} else {
					i++;
				}
			}
			if (!achou) 
				i = -1;
			return i;
		}  



		public static void inserirConta()  {
			String numero = "", nome = "";
			Scanner s = new Scanner(System.in);
			System.out.println("Digite o número da conta:");
			numero = s.next();
			System.out.println("Digite o nome do cliente dono da conta:");
			nome = Leia(nome);
			System.out.println("Digite o saldo inicial da conta:");
			// saldo armazenado como string na matriz
			String saldo = s.next();

			if (indice < contas.length)  {
				if ( procurarIndice(numero) == -1)  {

					contas[indice][0] = numero;
					contas[indice][1] = nome;
					contas[indice][2] = saldo;
					indice = indice + 1;
					System.out.println("Conta cadastrada no sistema.");
					return;
				}
				System.out.println("Uma conta com esse número já foi cadastrada no sistema, operação não realizada.");
				return;
			}
			System.out.println("Repositório de contas lotado, inserção não foi possível.");
			return;

		}

		public static void consultarConta()  {
			String numero = "", nome = "";
			Scanner s = new Scanner(System.in);
			System.out.println("Digite o número da conta:");
			numero = s.next();

			int i = procurarIndice(numero);
			if (i == -1) {
				System.out.println("Conta não encontrada.");
			} else {
				System.out.println("nome do cliente: "+ contas[i][1]);
				System.out.println("saldo: "+ contas[i][2]);
			}

		}


		public static void exibe_todas_as_contas()  {
			System.out.println("Relação de contas no sistema: \n");
			for (int i = 0; i < indice; i = i + 1)  {
				System.out.println("número da conta: "+ contas[i][0]);
				System.out.println("nome do cliente: "+ contas[i][1]);
				System.out.println("saldo da  conta: "+ contas[i][2]);
				System.out.println();
			}
		}
		
		public static void removerConta() {
			String numero = "";
			Scanner s = new Scanner(System.in);
			System.out.println("Digite o número da conta:");
			numero = s.next();
		 	
			int i = procurarIndice(numero); 
			if (i != -1) {
		            indice = indice - 1;
		            contas[i][0] = contas[indice][0];
		            contas[i][1] = contas[indice][1];
		            contas[i][2] = contas[indice][2];
		            System.out.println("conta removida do sistema.");
				      return;
		        } 
		        else {
		        	System.out.println("A conta informada não foi localizada no sistema.");
		             return;
		        }
		    }



		public static void alterarConta() {
			String numero = "", nome = "";
			Scanner s = new Scanner(System.in);
			System.out.println("Digite o número da conta:");
			numero = s.next();

			int i = procurarIndice(numero);
			if (i != -1) {
				System.out.println("Digite o nome do cliente dono da conta:");
				nome = Leia(nome);
				System.out.println("Digite o saldo inicial da conta:");
				// saldo armazenado como string na matriz
				String saldo = s.next();

				contas[i][1] = nome;
				contas[i][2] = saldo;
				System.out.println("A conta foi atualizada no sistema.");
				return;
			} else {
				System.out.println("A conta não foi encontrada no sistema.");
				return ;
			}		}

	}

