package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import java.util.TreeMap;



public class Program {

	public static void main(String[] args)  {

		String path = "C:\\github\\Java-Journey\\Generics, Set, Map\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			Map<String, Integer> votos = new LinkedHashMap<>();
			String line = br.readLine();
			
			while(line != null) {
				
				String[] dados = line.split(",");
				String name = dados[0];
				int count = Integer.parseInt(dados[1]);
				
				if(votos.containsKey(name)){ // se votos ja tiver o name
					int votosAteAgora = votos.get(name);  // ele vai adicionar o valor dos votos até agora
					votos.put(name, count + votosAteAgora); // e vai adicionar os valores que chegaram  + votosAteAgora
				}
				else {
					votos.put(name, count);// caso contrario ele apenas vai manter os valores.
				}
				
				line = br.readLine();
				
			}
			
			for (String key : votos.keySet()) { //para cada key presente em votos.
				
				System.out.println(key + ": " + votos.get(key)); // printa o Nome da Key, mais os valores da Key.
			}
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}


		


	}

}
