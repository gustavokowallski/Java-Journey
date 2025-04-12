package Curso3;

import java.util.Scanner;

public class Exercicio5for {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Adicione um número ");
		int n = sc.nextInt();
		int in =0;
		int out =0;
		
		for (int i=1; i <= n; i++) { //se o i for menor ou igual a n o programa repete denovo. e adiciona 1 numero ao i
			System.out.println("Adicione um número qualquer");
			int x = sc.nextInt();
			if ( x >= 10 && x<=20) {// se o valor de x for maior igual 10 ou menor igual 20
				
				in++; //ele adiciona no in 1 número
			}
			else {
				out++; //se for qualquer outro ele adiciona no out 1 número
			}
		}
		System.out.println("Os Valores In foram:"+in+" ");
		System.out.println("Os Valores In foram:"+out+" ");
		sc.close();
	}

}
