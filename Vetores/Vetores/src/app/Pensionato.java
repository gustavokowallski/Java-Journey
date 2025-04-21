package app;

import java.util.Locale;
import java.util.Scanner;
import entities.Rent;
public class Pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] rooms = new Rent[10];
		System.out.print("Digite o número de estudantes que vão alugar os quartos de 1 a 10");
		int n= sc.nextInt();
		
		for (int i=1; i<n;i++) {
			System.out.print("Rent "+(n+1)+"");
			System.out.print("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email:");
			String email = sc.next();
			System.out.print("Room:");
			int roomNumber = sc.nextInt();
			
			rooms[roomNumber]=new Rent(name,email); //quando você instanciar o objeto, ele ja cai direto para o vect, no valor do roomnumber;
			}
		
			for (int i=1; i<n;i++) {
				if (rooms[i] != null) {
					System.out.println(i + ",:" +rooms[i]);
					
				}
				
			}
		
		sc.close();
			
		}
		
		
		
		
			
		
		
	}
	

		
		
		
		


