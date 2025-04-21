package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;

import entities.Shape;
import entities.enums.Color;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes");
		
		int n = sc.nextInt();
		for (int i =1; i <= n; i++) {
			System.out.println("Shape # "+i+" data");
			System.out.println("Rectangle or Circle (r/c)");
			char sd = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED)");
			Color color = Color.valueOf(sc.next());
			if (sd =='c') {
				System.out.print("Enter radius");
				double radius = sc.nextDouble();
				
				list.add(new Circle(color, radius));
				
			}
			if (sd =='r') {
				System.out.print("Widht");
				double widht = sc.nextDouble();
				System.out.print("Height");
				double height = sc.nextDouble();
				
				list.add(new Rectangle(color, widht,height));
			}
			
			
		}
		System.out.println();
		System.out.println("Shape Areas: ");
		for (Shape c: list) {
			System.out.println(String.format("%.2f", c.area())); 
			
		}
		
		
		sc.close();

	}

}
