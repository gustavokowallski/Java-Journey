package Curso3;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		System.out.println(" Digite o eixo x");
		x= sc.nextInt();
		System.out.println(" Digite o eixo y");
		y= sc.nextInt();
		
		String posicao = "Nenhuma";
		
		while ( x !=0 || y !=0) {
			
			if (x > 0 && y > 0) {
				posicao = "primeiro";
			}
			else if (x < 0 && y > 0) {
            posicao = "segundo";
			} 	
			else if (x < 0 && y < 0) {
            posicao = "terceiro";
			} 	
			else if (x > 0 && y < 0){
        	
            posicao = "quarto";
        }
        else {
        	
    			
    			sc.close();
    			return ;
    		}
			System.out.println(posicao);
			System.out.println(" Digite o eixo x");
			x= sc.nextInt();
			System.out.println(" Digite o eixo y");
			y= sc.nextInt();
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}


