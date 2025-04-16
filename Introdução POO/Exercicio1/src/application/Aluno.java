package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner (System.in);
		
		
		Aluno aluno = new Aluno();
		System.out.println("Digite o Nome do Aluno");
		aluno.name = sc.next();
		System.out.println("Digite a Nota do primeiro Semetre");
		aluno.nota1 =sc.nextDouble();
		System.out.println("Digite a Nota do Segundo Semetre");
		aluno.nota2 =sc.nextDouble();
		System.out.println("Digite a Nota do Terceiro Semetre");
		aluno.nota3 =sc.nextDouble();
		
		aluno.notaFinal();
		
		
		
		System.out.println(aluno);
		
		
		sc.close();

	}

}
