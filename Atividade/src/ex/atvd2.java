package ex;

import java.util.Scanner;

public class atvd2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int valor = teclado.nextInt();
		teclado.close();
		if (valor >= 0 ) {
			System.out.println("o valor eh positivo");
		} else {
			System.out.println("o valor eh negativo");
		}

	}

}
