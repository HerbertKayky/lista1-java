package ex2;

import java.util.Scanner;

public class atvd1 {

		public static void main(String[] args) {
				Scanner teclado = new Scanner(System.in);
				
				System.out.println("Informe o primeiro valor:");
		        double valor1 = teclado.nextDouble();

		        double valor2;
		        do {
		            System.out.println("Informe o segundo valor (não pode ser ZERO):");
		            valor2 = teclado.nextDouble();
		        } while (valor2 == 0);

		        double resultado = valor1 / valor2;
		        System.out.println("Resultado da divisão: " + resultado);
		    }
		}

