package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date moment;
	private OrderStatus status;
	private Client client;
	
	private List<OrderItem> ordItem = new ArrayList<>();
	
	
	
	public Order() {
		
	}

	public Order(Date d01, OrderStatus status, Client cliente){
		this.client = cliente;
		this.moment = d01;
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getOrdItem() {
		return ordItem;
	}
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	

	public void addOrderItem(OrderItem OrderItem) { // vai chamar um metodo para adicionar comentario, chamando o comment como argumento
		ordItem.add(OrderItem);// ele vai na lista que se chama comment, chama o metodo add e adiciona o comment que veio como argumento
	}
	public void removeOrderItem(OrderItem OrderItem) { // vai chamar um metodo para remove comentario, chamando o comment como argumento
		ordItem.remove(OrderItem); // ele vai na lista que se chama comment, chama o metodo add e remove o comment que veio como argumento
	
	
}
	
	
	public double total() {
		double sum = 0; 
		for (OrderItem c : ordItem) { /* pega os valores de OrderItem presentes na lista, e para todos os valores, ele chama o subtotal metodo, do OrderItem */
			sum += c.subTotal();
		
			}
		return sum;// aqui ele vai retorno o valor da soma para o metodo
		}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : ordItem) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
		
		
	
	
	
	
