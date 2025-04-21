package app;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite um número ");
		int n = sc.nextInt();
		int [] vect = new int [n];
		
		for (int i=0; i<vect.length; i++) {
			System.out.println("Digite um número ");
			 vect[i]= sc.nextInt();
			 
			 
			 
		}
		System.out.println("Numeros negativos");
		
		for (int i=0; i<vect.length; i++) {
			if (vect [i] < 0) {
				System.out.printf("%d", vect[i]);
			}
			
		}
		
		
		sc.close();
		
			
				
		
	
	
	}

}
