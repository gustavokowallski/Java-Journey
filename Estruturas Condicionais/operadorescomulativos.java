package Curso1;

import java.util.Scanner;

public class operadorescomulativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double conta = 50;
		
		int minutos;
		
		minutos = sc.nextInt();
		
		sc.close();
		if (minutos >100) {
			conta += (minutos - 100)*2; // operador comulativos, ele pega o valor da função e ja soma no da conta. ganahndo tempo
		}
		System.out.print(conta);
	}

}
