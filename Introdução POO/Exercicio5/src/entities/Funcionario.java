package entities;

public class Funcionario {
	public String name;
	public double glossSalary;
	public double tax;
	
	
	
	public double NetSalary(){
		return glossSalary - this.tax;
	}
	
	public double IncreaseSalary(double porcentagem) {
		return glossSalary += glossSalary * (porcentagem /100);
		
	}
	
	public String toString() {
		return "Name: "
				+ name
				+", GlossSalary:"
				+ String.format("%.2f", NetSalary()) ;

	}
}
