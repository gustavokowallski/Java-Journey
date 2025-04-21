package services;

import java.util.List;

public class CalculationService  {
	
	//vamos atualizar o metódo para que ele seja compativel com qualquer tipo não apenas com o Int ou string
	public static <T extends Comparable<T>> T max(List<T> list ) { // aqui nos falamos que o metódo é um tipo T, e que o tipo T extende um comparable, para comparar os valores.
		if (list.isEmpty()) {
			throw new IllegalArgumentException("Lista não pode estar vazia"); //programação defensiva para erro.
		}
		
		T max = list.get(0);
		for (T item:list) {
			if (item.compareTo(max)> 0) { // se o item na lista for maior que o 0; esse valor vai ser atrubuido a max
				max=item;
			}
		}
		return max;
		
	}
}
