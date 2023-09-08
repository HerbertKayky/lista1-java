package ex2;

import java.util.Scanner;

public class atvd16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        int countNegativos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe o valor " + i + ":");
            int valor = teclado.nextInt();

            if (valor < 0) {
                countNegativos++;
            }
        }
        System.out.println("Número de valores negativos: " + countNegativos);
        teclado.close();

	}

}
