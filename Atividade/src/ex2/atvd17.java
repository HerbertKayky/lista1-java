package ex2;

import java.util.Scanner;

public class atvd17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        int countIntervalo = 0;
        int countFora = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe o valor " + i + ":");
            int valor = teclado.nextInt();

            if (valor >= 10 && valor <= 20) {
                countIntervalo++;
            } else {
                countFora++;
            }
        }

        System.out.println("Número de valores no intervalo [10,20]: " + countIntervalo);
        System.out.println("Número de valores fora do intervalo: " + countFora);
        teclado.close();

	}

}
