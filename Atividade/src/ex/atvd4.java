package ex;

import java.util.Scanner;

public class atvd4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual foi a nota da 1 avaliacao? ");
		float nota1 = teclado.nextFloat();
		
		System.out.println("Qual foi a nota da 2 avaliacao? ");
		float nota2 = teclado.nextFloat();
		
		float res = (nota1 + nota2) / 2;
		teclado.close();
		
		if (res >= 6) {
			System.out.println("Voce foi aprovado! Sua media foi: " + res );
		} else {
			System.out.println("Voce nao foi aprovado! Sua media foi: " + res);
		}		

}
}
