package application;

import java.util.HashSet;
import java.util.Set;

public class SetDemo1 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>(); //hashset não importa a ordem, ThreeSet em ordem alfabetica, LinkedHashSet, na ordem que foi adicionado;
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		//set.removeIf(x  -> x.charAt(0) == 'T');
		
		//set.removeIf(x -> x.length() >=3);
		//System.out.println(set.contains("Notebook")); // ve se no set tem um valor Notebook
		
		for (String p : set) {
		System.out.println(p);
		}
	}

}
