package principal;
import java.util.Scanner;
import entidades.Project;

public class App {
    static String[][] contas = new String[100][3];
    static int indice = 0;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Bem vindo ao sistema de cadastro de contas!!");
        System.out.println("Deseja acessar o sistema? sim(S) não(N)");
        String resposta = s.next();
        
        if (resposta.equals("S")) {
            Project.acessarSistema();

        } else if (resposta.equals("N")) {
            System.out.println("Até a proxima!!");       
        }

    }
        
    }
