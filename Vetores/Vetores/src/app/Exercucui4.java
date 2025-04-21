package app;

import java.util.Locale;
import java.util.Scanner;

public class Exercucui4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas");
		
		int N = sc.nextInt();
		double vect[] = new double [N];//cria um vetor para double que armaenara o dado altura
		String vecto[] = new String [N]; //cria um vetor para double que armaenara o dado Nome
		int vector[] = new int [N]; //cria um vetor para double que armaenara o dado Idade
		
		for (int i=0; i<N; i++) { //pede os dados das pessoas
			
			System.out.println("Digite o nome da pessoa");
			sc.nextLine();//limpando o buffer antes de inserir os dados;
			vecto[i] = sc.nextLine();
			
			System.out.println("Digite a idade");
			vector[i] = sc.nextInt();
			System.out.println("Digite a altura da pessoa");
			vect[i] = sc.nextDouble();
			
			
		}
		double sum =0;
		for (int i=0; i<vect.length; i++) { //cria uma variavel para somar as alturas.
			sum += vect[i];
			
		}
		double media = 0;
		
		media = sum / N; //media das alturas
		
		System.out.printf("Altura média foi %.2f%n", media);
		
		int years =0;
		double porcentagem;
		for (int i=0; i<vector.length; i++) { //para cada pessoa com idade menor que 16 anos ele adiciona 1 ao years
			if (vector[i] < 16) {
				years ++;
				}
		}
		
		porcentagem = ((double)years / vector.length) *100;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem); 
		
		for (int i=0; i<N; i++) { //se a idade for menor que 16 anos, ele vai printar o nome da pessoa
			if (vector[i] < 16) { //se idade for menor
				System.out.println(vecto[i]); //printar o nome que está no numero do vetor.
				}
		}
		
		sc.close();

	}

}
