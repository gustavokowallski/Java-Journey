package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Funcionario funcionario = new Funcionario();

		System.out.println("Name: ");
		funcionario.name = sc.next();
		System.out.println("Write the glossSalary ");
		funcionario.glossSalary = sc.nextDouble();
		System.out.println("Write the tax from glossSalary");
		funcionario.tax = sc.nextDouble();
		funcionario.NetSalary();
		
		System.out.println("Dados do Funcionario: " + funcionario);
		System.out.println("Digite a porcentagem");
		double porcentagem = sc.nextDouble();
		funcionario.IncreaseSalary(porcentagem);
		
		System.out.println("Dados Atualizados: " + funcionario);

		sc.close();

	}

}
