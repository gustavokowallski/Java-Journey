package application;

import entities.Client;

public class ClientProgram {

	public static void main(String[] args) {
		Client c1 = new Client("José", "josé@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		

	}

}
