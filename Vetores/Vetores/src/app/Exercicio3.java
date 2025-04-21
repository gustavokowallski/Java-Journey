package app;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Digite seu número");
		int n = sc.nextInt();
		
		double vect[] = new double [n];
		
		for (int i =0; i < vect.length; i++) {
			System.out.println("Digite seu número");
			vect[i] = sc.nextDouble();
				
					
				}
			
		
		System.out.print("Valores:");
		 for (int i=0; i<n; i++) {
		    	System.out.printf("%.1f%n  ", vect[i]);
		    }
		
		
		
		double sum = 0;
		for (int i =0; i < vect.length; i++) {
			sum += vect[i] ;
		}
		double media =0;
		for (int i =0; i < vect.length; i++) {
			media= sum/ vect.length;
		}
		
		System.out.printf("Media %.2f%n", media);
		System.out.printf("soma %.2f%n", sum);
		
		sc.close();

	}

}
