package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.TercerizadoFuncionario;

public class program {
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.println("Enter the number of employees");
		int n= sc.nextInt();
		for (int i=0; i<n; i++) {
			System.out.println("Employe "+ (i+1)+" data:");
			System.out.println("Outsourced (y/n) ?");
			char ch = sc.next().charAt(0);
			
				System.out.println("Name");
				
				String name = sc.nextLine();
				System.out.println("Hours");
				Integer hours = sc.nextInt();
				System.out.println("Value per Hour");
				Double valuePer = sc.nextDouble();
			
				if  (ch == 'y') {
				
				System.out.println("Additional charge");
				double add = sc.nextDouble();
			
				list.add(new TercerizadoFuncionario(name, hours, valuePer, add));
				
			}
			
			else {
				
				list.add(new Funcionario(name, hours, valuePer));
			}
			
			
			
		}
		
		System.out.println("Payments:");
		for (Funcionario c: list) {
			System.out.println(c.getName() + " - $ " + String.format("%.2f", c.payment()));
		}
		
		
		
		sc.close();

	}

}
