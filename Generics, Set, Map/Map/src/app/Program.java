package app;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99771122");
		
		cookies.remove("email");
		cookies.put("phone", "99771133");
		
		System.out.println("Contem Key 'phone ? : " + cookies.containsKey("phone"));
		System.out.println("Phone Number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println(cookies.size());
		

	}

}
