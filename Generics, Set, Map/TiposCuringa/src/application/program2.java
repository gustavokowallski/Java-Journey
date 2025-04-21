package application;

import java.util.Arrays;
import java.util.List;

public class program2 {

	public static void main(String[] args) {
		
			List<Integer> myInts = Arrays.asList(5, 2, 10);
			printList(myInts);
			
			
			List<String> myString = Arrays.asList("a", "b", "c ");
			printList(myString);
			}
			
			public static void printList(List<?> list) { //instanca uma lista curinga com List<?>
			for (Object obj : list) {
			System.out.println(obj); // aqui ele adiciona qualquer tipo de lista;
			}

 //Com tipos curinga podemos fazer métodos que recebem um genérico de "qualquer tipo":

	}

}
