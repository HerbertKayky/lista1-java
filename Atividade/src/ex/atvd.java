package ex;

import java.util.Scanner;

public class atvd {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int valor = teclado.nextInt();
		teclado.close();
		if (valor > 10) {
			System.out.println("O valor é maior que 10");
		} else {
			System.out.println("o valor não é maior que 10");
		}
	}
	

}
