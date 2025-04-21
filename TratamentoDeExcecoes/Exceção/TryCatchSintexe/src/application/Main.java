package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		try {
		String []vect = sc.nextLine().split(" "); // cria um vetor que é divido por espaços
		int position = sc.nextInt();
		System.out.println(vect[position]);
		/* esse código pode dar erro, pois a pessoa pode digitar um valor de vetor que não existe, ou digitar um nome invalido*/
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position"); //pega o erro que ia dar e ao inves de fechar o programa, retorna uma mensagem e o programa continua rodando.
		}
		catch (InputMismatchException e){
			System.out.println("InputError");
			
		}
		System.out.println("End of program");
		
		/* Agora mesmo se o programa der erro, você vai conseguir 
		 continuar rodando e rodar ele até o fim   */
	}
	
	

}
