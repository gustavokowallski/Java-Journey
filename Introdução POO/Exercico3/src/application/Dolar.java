package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrentyConvert;

public class Exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		CurrentyConvert cuv = new CurrentyConvert();
		System.out.println("Digite qual o preço do dollar");
		double dolar = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double buyDolar = sc.nextDouble();
		double result = CurrentyConvert.getConversao(dolar, buyDolar);
		
		System.out.println(result);
		
		
		
		sc.close();

	}

}
