package ex;

import java.util.Scanner;

public class atvd5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o ano que você nasceu: ");
		int nasc = teclado.nextInt();
		teclado.close();
		int idade = (2023 - nasc);
		
		if (idade >= 18 ) {
			System.out.println("Voce tem " + idade + " anos e pode votar!");
		} else {
			System.out.println("Voce tem " + idade + " anos e NAO pode votar!");
		}
	}

}
