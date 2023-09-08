package ex2;

import java.util.Scanner;

public class atvd2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor:");
        double valor1 = teclado.nextDouble();

        System.out.println("Informe o segundo valor (não pode ser ZERO):");
        double valor2 = teclado.nextDouble();

        while (valor2 == 0) {
            System.out.println("O segundo valor não pode ser ZERO. Por favor, informe novamente:");
            valor2 = teclado.nextDouble();
        }

        double resultado = valor1 / valor2;
        System.out.println("Resultado da divisão: " + resultado);
    }
}