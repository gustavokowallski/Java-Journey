package entities;

public class Prato {
	private String name;
	private String description;
	private Double price;
	
	public Prato() {
		
	}

	public Prato(String name, String description, Double price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	public String toString() {
	    return "Prato: " + name + ", Descrição: " + description + ", Preço: R$ " + String.format("%.2f", price);
	}
	
}
