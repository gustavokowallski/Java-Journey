package application;

import java.util.Scanner;

import entities.Retangulo;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		System.out.print("Digite o valor do comprimento");
		retangulo.widht= sc.nextDouble();
		System.out.println("Digite o valor da altura");
		retangulo.height= sc.nextDouble();
		
		retangulo.area();
		retangulo.Diagonal();
		retangulo.perimeter();
		
		System.out.println(retangulo);
		
		
		
		
		
		
		
		sc.close();

	}

}
