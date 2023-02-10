package lacosDeRepeticao;

import java.util.Scanner;

public class ex_lacorepeticao_01for {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int primeiroNumero, segundoNumero;

		System.out.println("Digite o Primeiro número:    ");
		primeiroNumero = leia.nextInt();

		System.out.println("Digite o Segundo número:     ");
		segundoNumero = leia.nextInt();

		if (primeiroNumero > segundoNumero) {
			System.out.print("Intervalo Inválido!");
		}

		else {
			System.out.print("No intervalo entre " + primeiroNumero + " e " + segundoNumero + ":");
		}

		for (int contar = primeiroNumero; contar <= segundoNumero; contar++) {
			if (contar % 3 == 0 & contar % 5 == 0) {
				System.out.println(contar + " é multiplo de 3 e 5 ");
			}
		}

	}
}