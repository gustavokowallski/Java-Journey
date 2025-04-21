package entities;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {

    private List<Prato> cardapio = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();
    
    public Restaurante() {
    	
    }
    // Adiciona um prato ao cardápio
    public void adicionarPratoAoCardapio(Prato prato) {
        cardapio.add(prato);
    }

    // Retorna o cardápio atual
    public List<Prato> getCardapio() {
        return cardapio;
    }

    // Registra um novo pedido
    public void registrarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("\nPedido registrado com sucesso!");
        System.out.println(pedido);
    }

    // Exibe todos os pedidos já registrados (opcional)
    public void exibirPedidos() {
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
        
    }
    
    
    public Prato getPratoDoCardapio(int index) {
        if (index >= 0 && index < cardapio.size()) {
            return cardapio.get(index);
        }
        return null;
    }
    public void mostrarCardapio() {
        for (int i = 0; i < cardapio.size(); i++) {
            Prato prato = cardapio.get(i);
            System.out.printf("%d - %s: %s (R$ %.2f)%n", i, prato.getName(), prato.getDescription(), prato.getPrice());
        }
    }
}

