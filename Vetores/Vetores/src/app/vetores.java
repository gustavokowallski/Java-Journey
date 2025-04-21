package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;



public class vetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Produto [] vect = new Produto[n]; //Nome da classe, abre e fecha couchete pra indiciar que [e um vetor, dai atributo o new (objeto)Produto [n]
		
		
		for (int i = 0; i < vect.length; i++) {// vect.leght é a quantidade de itens nov etor
			
			sc.nextLine(); //quebra de linha n bugar;
			String name = sc.nextLine(); //atribui valor de name
			double price = sc.nextDouble(); //atribui valor de price
			vect[i] = new Produto(name, price); //vect na posição i, vai apontar para o new Produto (construtor), que tem os valores de name e price).
			
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice(); //aqui ele chama o get price de cada posição do vect, e adiciona a variavel soma.
		}
		
		double avg = sum / vect.length;
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		sc.close();
	}
}