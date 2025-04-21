package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Produto> products= new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter the Number of Products");
		int n = sc.nextInt();
		for (int i =0; i<n;i++) {
			System.out.println("Product "+(i+1)+" data:");
			System.out.println("Common, used or imported ? (c/u/i)");
			char pc= sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name");
			String name = sc.nextLine();
			System.out.println("Price");
			
			Double price = sc.nextDouble();
			sc.nextLine();
			if (pc =='c') {
					
				products.add(new Produto(name, price));
			}
			if (pc =='u') {
				System.out.println("Manufacture data (DD/MM/YYYY)");
				String dateInput= sc.nextLine();
				
				Date manufactureDate = sdf.parse(dateInput);
				products.add(new ProdutoUsado(name, price, manufactureDate));
			}
			if (pc =='i') {
				System.out.println("Custom fee");
				Double customFee =sc.nextDouble();
				products.add(new ProdutoImportado(name, price, customFee));
			}
		
		}
		
		System.out.println("PRICE TAGS");
		for (Produto c: products) {
			System.out.println(c.priceTag());
			
		}
		
		sc.close();

	}

}
