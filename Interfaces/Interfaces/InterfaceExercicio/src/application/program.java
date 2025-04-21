package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.ConversorMoeda;
import model.entities.DollarToRealConverter;
import model.entities.EuroToRealConverter;
import model.entities.PaymentProcessor;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual moeda deseja inserir 1 = Dolar | 2 = Euro");
		int escolha = sc.nextInt();
		System.out.println("Digite o valor que deseja converter");
		double valor = sc.nextDouble();

		ConversorMoeda conversor = null;
		if (escolha ==1) {
			conversor = new DollarToRealConverter();
		}
		
		if (escolha ==2) {
			
			conversor =new EuroToRealConverter();
	}
		PaymentProcessor pp = new PaymentProcessor(conversor);
		double total = pp.convert(valor);
		
		System.out.println("O valor em reais de R$"+ valor +" é R$" + total);
		
		
		
	}

}
