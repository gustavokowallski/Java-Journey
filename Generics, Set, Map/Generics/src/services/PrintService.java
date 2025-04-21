package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService <T> { // adiciona um tipo para a classe, nesse caso pode ser qualquer valor que desejar
	private List<T> list = new ArrayList<>(); // e instancia a lista com esse valor, esse valor vai ser como
	// um object mas ele vai ser instanciado no programa principal e vai poder apenas ser adicionado dados daquele tipo.
	

	public void addValue(T value) {
		list.add(value);
	}

	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}

	public void print() {
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}
}
