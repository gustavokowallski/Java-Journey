package Curso3;

import java.util.Locale;
import java.util.Scanner;

public class Exerciciofor6 {

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			System.out.println("Adicione um número");
			int n = sc.nextInt();
			
			for (int i =1; i <= n; i++ ) {
			
			if (n % i == 0) {
				
				
				
				System.out.println(i);
			}
			}
	}
	
}
