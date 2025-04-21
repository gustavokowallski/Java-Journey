package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BrasilInterestService;
import entities.InterestService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double amount = sc.nextDouble();
		int months = sc.nextInt();
		
		InterestService is = new BrasilInterestService(2.0);
		double payment = is.payment(amount, months); //adiciona o metódo payment a uma variavel para printar depois.
		
		
		System.out.println("Payment After 3 months");
		System.out.println(String.format("%.2f", payment));
		
		
		sc.close();

	}

}
