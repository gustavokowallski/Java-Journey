package Curso1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double salario,  total = 0;
		
		
		
		System.out.println("Digite seu salário:");
		salario = sc.nextDouble();		
		sc.close();
		
		if (salario >=0 && salario <=2000) {
			System.out.println("Insento:");
		}
		
		else if ( salario >= 2001 && salario <=3000) {
			total = (salario - 2000) *0.08;
					
			
		}
		else if ( salario >= 3001 && salario <=4500) {
			total = (1000 *0.08)+ (salario - 3000) *0.18;
			
					
			
		}
		else {
			total = (1000 *0.08)+ (1500*0.18)  + (salario - 4500) *0.28;
		}
		
		System.out.printf("O valor do seu imposto é de %.2f%n", total );
	}

}
