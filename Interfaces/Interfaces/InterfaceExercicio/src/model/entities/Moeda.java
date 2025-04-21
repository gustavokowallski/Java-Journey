package model.entities;

public class Moeda {
	private Double quantity ;
	
	
	public Moeda() {
		
	}


	public Moeda(Double quantity) {
		super();
		this.quantity = quantity;
	}


	public Double getQuantity() {
		return quantity;
	}


	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	
	
}
