package Curso1;

import java.util.Scanner;

public class Exercicio2 {

	
	//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
	//seguir, calcule e mostre o valor da conta a pagar.

	public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		
		String lanche = "";
		int codigo, quantidade;
		
		double cachorropreco, salapreco, baconpreco, torradapreco, refripreco, total = 0;
		 
		 cachorropreco = 4.00;
		 salapreco = 4.50;
		 baconpreco = 5.00;
		 torradapreco = 2.00;
		 refripreco= 1.50;

		System.out.println("Digite o código do lanche que você quer:");
		System.out.println("1 Cachorro Quente");
		System.out.println("2 Salada");
		System.out.println("3 Bacon");
		System.out.println("4 Torrada Simples");
		System.out.println("5 Refrigerante");
		
		codigo = sc.nextInt();
		System.out.println("Digite quantas unidades você deseja:");
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			lanche = "Cachorro Quente";
			total = quantidade * cachorropreco;
			}
		
		else if (codigo == 2){
			lanche = "Salada";
			total = quantidade * salapreco;
		}
		else if (codigo == 3){
			lanche = "XBacon";
			total = quantidade * baconpreco;
		}
		else if (codigo == 4){
			lanche = "Torrada Simples";
			total = quantidade * torradapreco;
		}
		else if (codigo == 5){
			lanche = "Refrigerante";
			total = quantidade * refripreco;
		}
		else {
			System.out.println("Código errado");
			sc.close();
			return;
		}
		 
		 

		 System.out.printf("O lanche que você pediu foi %s, e o Valor foi de %.2f%n", lanche, total);
		 
		 
		 
		 sc.close();
			 

	}

}
