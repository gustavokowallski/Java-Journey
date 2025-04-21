package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;


public class program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
		System.out.println("Enter cliente data:");
		System.out.println("Name:");
		String name = sc.nextLine();
		System.out.println("Email:");
		String email = sc.nextLine();
		System.out.println("Birth Date (DD/MM/YYYY):");
		Date bDay = sdf.parse(sc.next()); 
		
		Client client = new Client(name, email, bDay);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		
		OrderStatus status = OrderStatus.valueOf(sc.next());

		
		Order order = new Order(new Date(),(status), client) ;
		
		
		System.out.println("How many items to this order:");
		int n= sc.nextInt();
		
		for ( int i=1; i<=n; i++) {
			System.out.println("Enter #"+i+" item data");
			System.out.println("Product Name");
			sc.nextLine();
			String nameProd = sc.nextLine();
			
			System.out.println("Product Price");
			double priceProd = sc.nextDouble();
			
			Product product = new Product(nameProd, priceProd);
			System.out.print("Quantity");
			int quantityProd = sc.nextInt();
		
			OrderItem orderItem = new OrderItem(quantityProd, priceProd, product);
			
			order.addOrderItem(orderItem);
			
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		
		
		sc.close();

	}

}
