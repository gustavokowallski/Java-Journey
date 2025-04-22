package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


import entities.Acesso;

public class Program {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		
		String path = "C:\\github\\Java-Journey\\Generics, Set, Map\\input.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			Set<Acesso> set = new HashSet<>();
			
			String line = br.readLine();

			while (line != null) {
				String[] info = line.split(" ");
				String username = info[0];
				Date moment = Date.from(Instant.parse(info[1]));
				
				set.add(new Acesso(username, moment));
				line = br.readLine();
				
			}
			System.out.println("Total users:" + set.size());
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			
			
		}
		
		
	}

}
