package ex;

import java.util.Scanner;

public class atvd9 {
	
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o número de horas trabalhadas no mês: ");
    int horasTrabalhadasNoMes = scanner.nextInt();
    
    System.out.print("Digite o salário por hora: ");
    double salarioPorHora = scanner.nextDouble();

    
    int horasRegulares = 44 * 4;  
    int horasExtras = 0;

    if (horasTrabalhadasNoMes > horasRegulares) {
        horasExtras = horasTrabalhadasNoMes - horasRegulares;
    }

    
    double valorHorasExtras = horasExtras * salarioPorHora * 1.5;

   
    double salarioTotal = (horasRegulares * salarioPorHora) + valorHorasExtras;

    System.out.println("O salário total do funcionário é: " + salarioTotal);

    scanner.close();
	}
}
