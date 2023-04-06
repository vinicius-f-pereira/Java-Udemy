package EstruturaDeControle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {

		// meu código (funcionou)
//		Scanner entrada = new Scanner(System.in);
//
//		System.out.println("Digite a senha: ");
//	
//		String senha = entrada.nextLine();
//		String password = "sair";
//		while (!senha.equalsIgnoreCase("sair")) {
//			System.out.println("Digite a senha: ");
//			senha = entrada.nextLine();
//		}
//
//		entrada.close();

//		codigo da aula

		Scanner entrada = new Scanner(System.in);
		String valor = "";

		while (!valor.equalsIgnoreCase("sair")) {
			System.out.print("Você diz:");
			valor = entrada.nextLine();

		}
		entrada.close();

	}
}
