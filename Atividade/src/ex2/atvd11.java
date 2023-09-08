package ex2;

import java.util.Scanner;

public class atvd11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        int N;

        do {
            System.out.println("Informe um valor para N (deve ser maior que 0):");
            N = teclado.nextInt();
        } while (N <= 0);

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
        teclado.close();
	}

}
