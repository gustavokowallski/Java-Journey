package Curso3;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int alcol = 0, gasolina = 0, diesel =0, code;
		
		System.out.println("Digite o Combustivel que mais te agrada");
		System.out.println("1 alcool");
		System.out.println("2 Gasolina ");
		System.out.println("3 Diesel");
		System.out.println("4 Fim");
		code= sc.nextInt();
		
		
		while (code !=4) {
			switch (code) {
			case 1:
				alcol += 1;
			break;
			case 2:
				gasolina += 1;
			break;
			
			case 3:
				diesel += 3;
			break;
			default:
				System.out.println("MUITO OBRIGADO");
				
				
			break;
		}
			
			System.out.println("Digite o Combustivel que mais te agrada");
			System.out.println("1 alcool");
			System.out.println("2 Gasolina ");
			System.out.println("3 Diesel");
			System.out.println("4 Fim");
			
			code= sc.nextInt();
			
			
		}
		
		System.out.println("Alcool foi de "+ alcol+" ");
		System.out.println("Gasolina foi de "+ gasolina+"");
		System.out.println("Diesel foi de "+ diesel+" ");
		sc.close();
	}
}

