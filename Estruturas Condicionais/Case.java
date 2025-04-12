package Curso1;

import java.util.Scanner;

public class Case {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7: // caso o numero x seja 7, vai exibir esse resultado
			dia = "sabado"; 
			break;
		default: // Else seria esse default e colocar o valor desejado
			dia = "valor invalido";
			break;// Obrigado a usar o break para quebrar
		}
		System.out.println("Dia da semana:"+ dia+" ");
		sc.close();
	}
}
