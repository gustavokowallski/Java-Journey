package curso;

import java.util.Locale;

public class Novo_Exercicio {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender ='F';
		
		double price1 = 2100;
		double price2 = 650.50;
		double measure = 53.243567;
		
		System.out.printf("%s which price is $ %.2f%n ", product1, price1 );
		System.out.printf("%s which price is $ %.2f%n ", product2, price2 );
		System.out.printf("Record: %d, code %d and %c%n ", age, code, gender ); 
		// %d Inteiro (int), %s= texto (string),  %n quebrar uma linha, %c char
		
		System.out.printf(" Rounded decimal point: %.3f%n", measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf(" Us decimal point: %.3f%n", measure);
		

	}

}
