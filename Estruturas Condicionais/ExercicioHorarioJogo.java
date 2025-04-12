package Curso1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double inicio, fim, hora;
		
		
		System.out.println("Digite o horário que começou o jogo (mínimo 1h): ");
		inicio = sc.nextDouble();
		System.out.println("Digite o horário que terminou o jogo (mínimo 24h): ");
		fim = sc.nextDouble();
		
		if (inicio < fim) {
			hora = fim - inicio;
		}
		else {
			hora = 24 - inicio + fim;  // se o horario do inicio for maior que o horario do fim, ele pega as 24 horas, tira o tempo do inicio: e depois soma as horas;
			
		}
		System.out.println("O jogo durou:"+ hora+"  ");
		sc.close();
		
		

	}

}
