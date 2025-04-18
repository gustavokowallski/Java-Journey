package application;

import java.io.File;
import java.util.Scanner;

public class ManipulacaoPastas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		
		File path = new File(strPath); // instancia o caminho passado o String chamado
		File[] folders = path.listFiles(File::isDirectory); // cria um vetor de pastas
		System.out.println("FOLDERS:");
		for (File folder : folders) { // para cada pasta que tiver no vetor ele vai printar
			System.out.println(folder);
		}
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File file : files) {// para cada arquivo que tiver no vetor ele vai printar
			System.out.println(file);
		}
		boolean success = new File(strPath + "\\subdir").mkdir(); // criação de pastas no seu caminho que foi instanciado
		System.out.println("Directory created successfully: " + success);
		sc.close();

	}

}
