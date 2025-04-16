package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y; // ele puxa a classe triangulo com os valores e define um triangulo x e y.
        x = new Triangle(); //depois ele usa a função new para criar com os parametros da classe
        y = new Triangle();

        System.out.println("Enter the measures of triangle X:");
        x.a = sc.nextDouble(); // e para alocar os dados para as respectivas funções a,b,c ele usa o .a
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        
        double areaX = x.area();//aqui ele atribui o valor, ao valor que retornar no método do triangulo.

        
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: Triangle X");
        } else {
            System.out.println("Larger area: Triangle Y");
        }

        sc.close();
    }
}
