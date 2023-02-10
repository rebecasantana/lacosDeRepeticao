package lacosDeRepeticao;

import java.util.Scanner;

public class ex_lacorepeticao_01while {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma idade: ");
		int idade = sc.nextInt();

		int maiorQue21 = 0;
		int maiorQue50 = 0;

		while (idade > 0) {
			if (idade < 21) {
				maiorQue21++;
			} else if (idade > 50) {
				maiorQue50++;
			}
			System.out.print("Digite uma idade: ");
			idade = sc.nextInt();
		}

		System.out.println("Total de pessoas menores de 21 anos: " + maiorQue21);

		System.out.println("Total de pessoas maiores de 50 anos: " + maiorQue50);
	}
}
