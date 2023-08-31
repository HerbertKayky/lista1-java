package ex;

import java.util.Scanner;

public class atvd8 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a hora que comecou o jogo (sem os minutos)");
		int horaInicio = teclado.nextInt();
		
		System.out.println("Digite a hora que terminou o jogo (sem os minutos)");
		int horaFinal = teclado.nextInt();
		
		teclado.close();
		
		int duracao;
		
		if(horaInicio < horaFinal) {
			duracao = horaFinal - horaInicio;
		} else if (horaInicio == horaFinal) {
			duracao = 24;
		} else {
			duracao = (24 - horaInicio) + horaFinal;
		}
		System.out.println("O jogo durou: " + duracao + " Horas" );
	}

}
