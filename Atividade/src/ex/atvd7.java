package ex;

import java.util.Scanner;

public class atvd7 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valor1 = teclado.nextInt();
		
		System.out.println("Digite outro valor: ");
		int valor2 = teclado.nextInt();
		
		while (valor1 == valor2) {
            System.out.println("Por favor, insira um valor diferente do primeiro.");
            System.out.print("Digite o segundo valor: ");
            valor2 = teclado.nextInt();
		}
		teclado.close();
		
		if (valor1 < valor2) {
			System.out.println("Ordem crescente: " + valor1 + " , "+ valor2);
		} else {
			System.out.println("Ordem crescente: " + valor2 + " , " + valor1);
			
		}
		
		
		
		
	}

}
