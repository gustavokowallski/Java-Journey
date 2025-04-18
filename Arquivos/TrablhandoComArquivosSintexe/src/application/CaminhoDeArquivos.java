package application;

import java.io.File;
import java.util.Scanner;

public class CaminhoDeArquivos {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		File path = new File(strPath);
		System.out.println("getPath: " + path.getPath());//get path mostra todo o trajeto do arquivo
		System.out.println("getParent: " + path.getParent()); // get parent mostra a pasta que o arquivo está
		System.out.println("getName: " + path.getName()); //getName mostra o nome do arquivo
		sc.close();

	}

}
