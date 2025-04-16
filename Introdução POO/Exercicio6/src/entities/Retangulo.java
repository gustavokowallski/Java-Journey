package entities;

public class Retangulo {
	public double widht;
	public double height;
	
	
	public double area() {
		return widht*height;
	}
	
	public double perimeter() {
		return (widht * 2) + (height * 2); 
	}
	
	public double Diagonal() {
		return Math.sqrt((widht*widht) + (height*height));
	}
	public String toString(){
		return "Area é de"
				+ area()
				+ ", O Perimetro é de"
				+ perimeter()
				+ ", A Diagonal é de "
				+ Diagonal();
				
		
	}
}
