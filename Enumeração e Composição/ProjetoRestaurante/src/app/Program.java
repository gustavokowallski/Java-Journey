package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Pedido;
import entities.Prato;
import entities.Restaurante;
import entities.enums.StatusPedido;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Restaurante restaurante = new Restaurante();
        restaurante.adicionarPratoAoCardapio(new Prato("X-burguer", "Pão Carne e Queijo ", 30.0));
        restaurante.adicionarPratoAoCardapio(new Prato("Coca-Cola", "Refrigerante gelado", 5.0));
        restaurante.adicionarPratoAoCardapio(new Prato("Porção Batata", "Porção de batata frita", 18.0));
		
		System.out.println("Bem vindo ao Restaurante");
		System.out.println("Digite o nome do Cliente");
		
		String clientName = sc.nextLine();
		System.out.println("Digite o Cpf do Cliente");
		String clientCpf = sc.nextLine();
		System.out.println("Digite o Telefone do Cliente (DDD) - 12345-1234");
		String clientPhone = sc.nextLine();
		
		Client client = new Client(clientName, clientCpf, clientPhone);
		Pedido pedido = new Pedido(client);
		
		System.out.println("Olhe nosso cardapio");
		restaurante.mostrarCardapio();
		
		System.out.println("Faça seu pedido, se não quiser pedir nenhum basta digitar -1");
		while (true) {
			System.out.println("Qual prato você gostaria de pedir");
			int opcao = sc.nextInt();
			if (opcao == -1){
				break;
				
			}
			
			Prato escolha = restaurante.getPratoDoCardapio(opcao);
			if (escolha != null) {
				pedido.addPratos(escolha);
				pedido.setStatus(StatusPedido.PEDENTE);
			}
			else {
				System.out.println("Opção Invalida");
			}
		}
		
		restaurante.registrarPedido(pedido);
		
		System.out.println("Preparando pedido");
		pedido.setStatus(StatusPedido.EM_PREPARO);
		System.out.println(pedido);
		System.out.println();
		System.out.println();
		
		System.out.println();
		System.out.println("Pedido Finalizado");
		pedido.setStatus(StatusPedido.FINALIZADO);
		System.out.println(pedido);
		
		sc.close();

	}

}
