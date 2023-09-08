package ex2;

import java.util.Scanner;

public class atvd5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

        double nota1, nota2;

        do {
            System.out.println("Informe a primeira nota (entre 0 e 10):");
            nota1 = teclado.nextDouble();
        } while (nota1 < 0 || nota1 > 10);

        do {
            System.out.println("Informe a segunda nota (entre 0 e 10):");
            nota2 = teclado.nextDouble();
        } while (nota2 < 0 || nota2 > 10);

        double media = (nota1 + nota2) / 2;
        System.out.println("Média do aluno: " + media);

        teclado.close();
    }
}
