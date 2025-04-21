package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.FreteExpressoService;
import model.entities.FretePadraoService;
import model.entities.FreteService;
import model.entities.ProcessarPedido;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite por qual metódo deseja enviar seu pacote (1- Serviço padrão 2- Serviço Expresso)");
		int frete = sc.nextInt();
		System.out.println("Digite o peso de sua encomenda");
		double peso = sc.nextDouble();
		
		FreteService freteService;
		if (frete ==1) {
			freteService = new FretePadraoService();
		}
		else {
			freteService = new FreteExpressoService();
		}
		ProcessarPedido pp = new ProcessarPedido(freteService);
		double calculo = pp.calculo(peso);
		
		System.out.println("O preço do seu frete será" + calculo);
		
		
		
		sc.close();

	}

}
