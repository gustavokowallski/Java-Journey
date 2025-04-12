package Curso3;

import java.util.Locale;
import java.util.Scanner;

public class exerciciofor5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Adicione um número");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Adicione o valor A");
			double a=sc.nextDouble();
			System.out.println("Adicione o valor B");
			double b=sc.nextDouble();
			System.out.println("Adicione o valor C");
			double c=sc.nextDouble();
			
			double media = (a*2+ b*3 + c*5) / (2+3+5) ;
			System.out.printf("O Valor da equação %s é igual a %.2f%n", i, media);
		}
		sc.close();
	}

}
