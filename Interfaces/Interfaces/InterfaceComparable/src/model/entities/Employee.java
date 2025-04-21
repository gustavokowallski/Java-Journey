package model.entities;

public class Employee implements Comparable<Employee>{
	private String name;
	private Double salary;
	
	public Employee() {
		
	}

	public Employee(String name, Double salary) {

		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee other) {
		// TODO Auto-generated method stub
		return name.compareTo(other.getName());// vai comparar o name, com o outro getName(funcionario) ;
		// se quiser em ordem decrecente só colocar um - no começo.
		// se retornar um valor verdadeiro22222222222222222222222222222222222222221121212qqqq1	1111111111111111111111111111111111111111111111111111111111
	}
	
}
