package ex;

import java.util.Scanner;

public class atvd6 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		float valor1 = teclado.nextFloat();
		
		System.out.println("Digite outro valor: ");
		float valor2 = teclado.nextFloat();
		teclado.close();
		
		if (valor1 > valor2) {
			System.out.println("O primeiro valor eh maior que o segundo " + valor1 );
		} else if (valor1 == valor2) {
			System.out.println("Os valores sao iguais");
		} else {
			System.out.println("O segundo valor eh maior que o primeiro " + valor2 );
		}
	

	}

}
