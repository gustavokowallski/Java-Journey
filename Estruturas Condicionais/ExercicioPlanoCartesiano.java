package Curso1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
		//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
		//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
		//Se o ponto estiver na origem, escreva a mensagem “Origem”.
		//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situacao
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double x,y;
		System.out.println("Digite o eixo X:");
		x= sc.nextDouble();
		System.out.println("Digite o eixo Y:");
		y= sc.nextDouble();
		String posicao = "";
		//x positivo = >>>>>>>>>>>>>>
		// x negativo = <<<<<<<<<<<<<<<<<<
		// y positivo igual pro alto
		// y negativo igual para baixo
		if (x == 0 && y == 0) { // Se os números forem igual a zero, a resposta vai ser origem.
            posicao = "Origem";
        
        } else if (x > 0 && y > 0) {
            posicao = "Q1";
        } else if (x < 0 && y > 0) {
            posicao = "Q2";
        } else if (x < 0 && y < 0) {
            posicao = "Q3";
        } else if (x > 0 && y < 0){
        	
            posicao = "Q4";
        }
        else {
        	
    			System.out.println("Fora do Plano");
    			sc.close();
    			return;
    		}
        
		
		System.out.println(posicao);
		
		sc.close();
	}

}
