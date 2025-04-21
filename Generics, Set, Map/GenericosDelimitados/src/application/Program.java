package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Produtos;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Produtos> list = new ArrayList<>();//lista de produtos;

		String path = "C:\\temp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();//ler uma linha do arquivo
			while (line != null) {//e enquanto a linha tiver conteudo
				String[] fields = line.split(","); //o valor será atualziado num vetor com o corte quand acontecer um ","
				list.add(new Produtos(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}

			Produtos x = CalculationService.max(list);
			System.out.println("Most expensive:");
			System.out.println(x);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
