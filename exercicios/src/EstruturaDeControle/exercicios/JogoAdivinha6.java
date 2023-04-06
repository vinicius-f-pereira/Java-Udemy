package EstruturaDeControle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int continuar;
		int numeroSorteado;
		int tentativas;
		int numero;
		
		do {
			System.out.println("Sorteando numero entre 0 e 100...\n");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);
			
			System.out.println("Começou o Jogo! Sera que consegue me vencer?");
			tentativas = 0;			
			
			do {
				tentativas++;
				System.out.printf("Tentativa %d: ", tentativas);
				numero = scanner.nextInt();
				
				if (numero > numeroSorteado) {
					System.out.printf("\nO numero sorteado e menor que %d\n\n", numero);
				} else if (numero < numeroSorteado) {
					System.out.printf("\nO numero sorteado é maior que %d\n\n", numero);
				}else
					System.out.printf("\nParabéns! Você acertou o numero em %d tentativas\n\n", tentativas);
				
			}
			while (numero != numeroSorteado);
			System.out.println("Digite 0 para sair, ou qualquer outro numero para continuar");
			continuar = scanner.nextInt();
		} while(continuar != 0);

		scanner.close();

	}
}

// Meu código errado
//		int numeroSecreto = 29;
//		int contadorTentativa = 0;
//		Scanner entrada = new Scanner(System.in);
//		System.out.println("Você tem 10 tentativas!!!\nInforme o número: ");
//		int numDigitado = entrada.nextInt();
//
//		for (int i = 0; i != numeroSecreto; i++) {
//			if (numDigitado != numeroSecreto) {
//				contadorTentativa++;
//				System.out.println("Tentativa de número: " + contadorTentativa);
//			} else
//				System.out.println("Você acertou!!!\n O número secreto é: " + numeroSecreto);
//
//		}
//
//		entrada.close();
//	}
