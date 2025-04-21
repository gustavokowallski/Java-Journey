package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class aplicacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta account;
		
		
		System.out.println("Enter account number ");
		int number = sc.nextInt();
		
		System.out.println("Digite o holder de sua conta");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Deseja fazer depósito inicial? (s/n):");
        char response = sc.next().charAt(0);
        
        if (response == 's') {
        	System.out.print("Deseja fazer depósito inicial? (s/n): ");
        	double initialDeposit = sc.nextDouble();
        	account = new Conta(number, name, initialDeposit);// eu não posso criar uma Conta account dentro do metódo if.
        	//mas eu posso declarar a variavel accounte e fazer ela ter valor do construtor.
        }
        
        else {
        	account = new Conta(number, name); //fazer a variavel ter o valor do construtor
        }
        System.out.println();
        System.out.println("Account Data:");
        System.out.println(account);//printa o valor de account
        System.out.println();
        
        System.out.print("Enter a deposityValue:"); //agora ele pede um valor de deposito
        double depositValue = sc.nextDouble(); //atribui uma variavel de deposito
        account.deposit(depositValue);// agora chama a operação de deposito, e chama o metódo mandando a variavel deposito
        System.out.print("Update account data:");
        System.out.println(account);
        
        System.out.println();
        System.out.print("Enter a withDrawValue:"); //mesma coisa com a variavel withdraw
        double withDrawValue = sc.nextDouble();
        account.withdraw(withDrawValue);
        System.out.print("Update account data:");
        System.out.println(account);
        
        sc.close();

	}
}
