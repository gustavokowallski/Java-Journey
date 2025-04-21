package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		//List<Object> não é o supertipo de qualquer tipo de lista:
			
		List<Object> myObjs = new ArrayList<Object>();
			List<Integer> myNumbers = new ArrayList<Integer>();
			myObjs = myNumbers; // erro de compilação, ele não consegue transformar Object em Integer
			
			List<?> myObj = new ArrayList<Object>(); //ele instacia a lista de qualquer tipo agora, assim o compilcador não reclama
			List<Integer> myNumber = new ArrayList<Integer>();
			myObj = myNumber;
	}
	//O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga:
		
}
