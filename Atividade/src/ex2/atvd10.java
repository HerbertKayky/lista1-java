package ex2;

import java.util.Scanner;

public class atvd10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um valor para N:");
        int N = teclado.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

        teclado.close();
    }
}
