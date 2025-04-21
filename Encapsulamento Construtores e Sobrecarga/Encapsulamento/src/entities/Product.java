package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public Product() {// se eu quiser manter o construtor padrão, mesmo após ter criado os diferenciados, é só deixar desse jeito.
		
	}
	
	public Product (String name, double price, int quantity) {// os paramentros agr vão ser os dados que ele quer receber
		//produto usar a classe os parametros entre (), e serve para proteger que nem um dos objetos sejam criado sem valor.
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product (String name, double price) { // isso é uma sobrecarga, eu criei outro construtor com o mesmo nome.
		// mas ele vai receber apenas valores de name e price, nesse caso ele n vai receber quantity.
		// pois primeiro eu quero cadastrar o produto sem nenhum estoque
		
		this.name = name;
		this.price = price;
		
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	
	
	

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}