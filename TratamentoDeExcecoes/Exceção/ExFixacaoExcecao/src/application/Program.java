package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args)  {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Welcome to the bank");
		System.out.println("Enter your data: ");
		System.out.print("Holder name: ");
		String holder = sc.nextLine();
		System.out.print("Number account: ");
		int number = sc.nextInt();
		System.out.print("Balance: ");
		double balance = sc.nextDouble();
		System.out.print("withDrawLimit : ");
		double withDrawLimit = sc.nextDouble();
		Account account = new Account(number, holder, balance, withDrawLimit);
		System.out.println();
		System.out.println();
		
		System.out.println("Enter a WithDraw Value");
		double withDraw = sc.nextDouble();
		account.withDraw(withDraw);
		
		System.out.println("");
		System.out.println("New balance: " + account.getBalance());
	}
		
		catch(DomainException e) {
			System.out.println("Error in application: "+ e.getMessage());
			
		}
		sc.close();
	}
}
