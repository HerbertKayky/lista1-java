package ex;

import java.util.Scanner;

public class atvd3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantas macas voce vai comprar? ");
		
		int maca = teclado.nextInt();
		teclado.close();

		float custoTotal;
		if (maca >= 12.0f) {
			custoTotal = maca * 1.00f;
		} else {
			custoTotal = maca * 1.30f;
		}
		System.out.println("O custo total foi de R$ " + custoTotal);
	}

}
