package entities;

public class Produtos implements Comparable<Produtos>{
	private String name;
	private Double price;
	public Produtos(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public int compareTo(Produtos other) {
		return price.compareTo(other.getPrice());// comapara o preço desse produto com o preço do outro produto
	}
	
	
}
