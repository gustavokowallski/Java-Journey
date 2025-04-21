package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido {
	private Client client;
	private StatusPedido status;
	private List<Prato> pratos = new ArrayList<>();
	
	public Pedido() {
		
	}
	public Pedido (Client client){
		this.client = client;
	}
	public Pedido(Client client, StatusPedido status, List<Prato> pratos) {

		this.client = client;
		this.status = status;
	
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public List<Prato> getPratos() {
		return pratos;
	}
	
	
	public void addPratos(Prato pratos) {
		this.pratos.add(pratos);
	}

	public double totalValue() {
		double sum =0;
		for (Prato c: pratos) {
			sum += c.getPrice();
			
		}
		return sum;
	}
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Cliente: ").append(client.getName())
	      .append(" (CPF: ").append(client.getCpf())
	      .append(", Telefone: ").append(client.getTelefone()).append(")\n");

	    sb.append("Pedido:\n");
	    for (Prato prato : pratos) {
	        sb.append(" - ").append(prato).append("\n");
	    }

	    sb.append("Status do Pedido: ").append(status).append("\n");
	    sb.append("Total do Pedido: R$ ").append(String.format("%.2f", totalValue())).append("\n");

	    return sb.toString();
	}
	
}
