package application;

import java.util.ArrayList;
import java.util.List;

public class Program3 {

	public static void main(String[] args) {
		//Porém não é possível adicionar dados a uma coleção de tipo curinga
		
		List<?> list = new ArrayList<Integer>();
		list.add(3); // erro de compilação
		
		
		//O compilador não sabe qual é o tipo específico do qual a lista foi instanciada.

	}

}
