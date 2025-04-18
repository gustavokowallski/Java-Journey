package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Blocotry_with_resources {

	public static void main(String[] args) {
		
		String path = "C:\\temp\\in.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) { //instacia o Buffered e o FileReader aqui no try, fazendo a instacia ser fechada apos o programa terminar automaticamente.
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
