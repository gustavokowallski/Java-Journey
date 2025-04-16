package entities;

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
	public double area() { //aqui ele criar outro método;
		double p = (a+b+c)/2; 
		return Math.sqrt(p * (p-a) * (p-b) * (p-c) );// e aqui ele retorna uma valor para o método
	
	}
}


