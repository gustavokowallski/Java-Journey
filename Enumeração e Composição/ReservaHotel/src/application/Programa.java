package application;

import java.util.Scanner;

import entities.Hospede;
import entities.Quarto;
import entities.Reserva;

import entities.enums.TipoQuarto;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do hospede");
		System.out.print("Name");
		String name = sc.nextLine();
		System.out.print("Cpf");
		String cpf = sc.next();
		Hospede hospede = new Hospede(name, cpf);
		
		System.out.println("");
		
		System.out.println("Reservar um Quarto");
		System.out.print("Número do Quarto");
		int quarto = sc.nextInt();
		
		System.out.println("Tipo do Quarto");
		TipoQuarto tipoQuarto = TipoQuarto.valueOf(sc.next()); // Instanciar o objeto enums, depois usar o objeto e o valueOf e inputar os dados o para o usuario escrever.
		
		Quarto quartoo = new Quarto(quarto, tipoQuarto, hospede);
		
		Reserva reserva = new Reserva(hospede, quartoo);
		
		
		System.out.println(reserva);
		sc.close();

	}

}
