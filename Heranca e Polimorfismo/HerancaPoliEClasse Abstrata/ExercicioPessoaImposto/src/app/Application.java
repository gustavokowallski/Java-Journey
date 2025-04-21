package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;



public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> pessoas= new ArrayList<>();
		
		System.out.println("Quantas pessoas deseja ler ?: ");
		int n= sc.nextInt();
		
		for (int i =1; i<= n; i++) {
			System.out.println("Pessoa Fisica ou Juridica ? (f) ou (j)");
			char pd = sc.next().charAt(0);
			System.out.println("Digite o Nome");
			sc.nextLine();
			String name= sc.nextLine();
			System.out.println("Digite a Renda Anual ");
			double rendaAnual =sc.nextDouble();
			if (pd =='f') {
				System.out.print("Digite os gastos com sáude dessa Pessoa:");
				double gastosSaude = sc.nextDouble();
				pessoas.add(new PessoaFisica(name, rendaAnual, gastosSaude));
				
			}
			if (pd =='j') {
				System.out.print("Digite o número de Funcionarios:");
				int numFuncionarios = sc.nextInt();
				pessoas.add(new PessoaJuridica(name, rendaAnual, numFuncionarios));
				
			}
			
		}
		System.out.println("Taxas Pagas");
		for (Pessoa p: pessoas) {
			System.out.println( p.getName()+": $" + String.format("%.2f", p.calculoImposto()));
			
		}
		sc.close();
	}
	
	

}
