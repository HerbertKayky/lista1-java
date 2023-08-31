package ex;

import java.util.Scanner;

public class atvd10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o salário fixo:");
        double salarioFixo = teclado.nextDouble();
        
        System.out.println("Digite o valor das vendas efetuadas pelo vendedor:");
        double valorVendas = teclado.nextDouble();
        
        double comissao;
        if (valorVendas <= 1500.00) {
            comissao = valorVendas * 0.03;
        } else {
            comissao = (1500.00 * 0.03) + ((valorVendas - 1500.00) * 0.05);
        }

        double salarioTotal = salarioFixo + comissao;
        
        System.out.printf("O salário total do vendedor é: R$ %.2f%n", salarioTotal);
        teclado.close();
	}

}
