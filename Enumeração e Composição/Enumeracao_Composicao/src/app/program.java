package app;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class program {

	public static void main(String[] args) {
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT); // Instancia um objeto que vai receber o contrtutor Order, que tem o ID, data e o Status do pedido, que criamos no enum.
		System.out.println(order);
		
		//Transform string to enum
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
	}

}
