package app;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_exercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] vect = new double[n]; 
		/*primeiro coloque os valores
		 que o vetor vai armazenar no caso double, depois abre 
		couchetes, depois atribua o quanto valores serão recebidos
		no caso new double [n] ( mostra que serão os valores de n
		que serão criado) se n for igual a 3, vai ter 3 espaços para guardar resultado */
		
		for (int i=0; i<n; i++) {// faz um for que cria um i, que é igual a zero, enqt ele for menor q n, ele adiciona 1 valor. 
			vect[i] = sc.nextDouble(); /*Agora ele pegar o nome da vect, e atribui o valor de i para ela, então num primeiro valor
			ele vai ser alocado para o valor 0 da vect.*/
		}
		
		double sum =0;
		for (int i=0; i<n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("Average %.2f", avg);
		
		
		
		
		sc.close();

	}

}
