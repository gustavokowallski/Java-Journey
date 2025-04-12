package Curso3;

import java.util.Scanner;

public class exercicio4for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i=1; i<=x  ; i++) { //int começa valendo 1, se i for maior que x o programa para
			// se não for maior o programa faz a operação i++ que adiciona 1 ao valor
			 if (i % 2 != 0) { // se o resto da divisão for entre i e 2 for diferente de 0
				 // ele printa o número i
			
			System.out.println(i);
			 }
		}
		
		sc.close();
		
	}

}
