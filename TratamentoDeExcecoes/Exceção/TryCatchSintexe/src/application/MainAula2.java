package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainAula2 {

	public static void main(String[] args) {

		method1();//inicializa o methodo 1, que vai inicializar o metódo 2
		System.out.println("End of program");
	}

	
	
	public static void method1() { // cria o metódo 1, que chama o metódo 2
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}

	public static void method2() { // metódo 2 que inputa os dados e aparece as mensagem de erro
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		sc.close();
		System.out.println("***METHOD2 END***");

	}

}
