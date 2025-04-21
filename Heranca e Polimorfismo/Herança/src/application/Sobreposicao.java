package application;

import entities.Conta;
import entities.contaDeEmpresa;
import entities.polpanca;

public class Sobreposicao {

	public static void main(String[] args) {
		Conta acc1 = new Conta(1002, "Jorge", 1000.00);
		acc1.saque(200);
		System.out.println(acc1.getBalance());
		
		Conta acc2 = new polpanca(1003, "Maria", 1000.00, 0.1);
		acc2.saque(200);
		System.out.println(acc2.getBalance()); 
		
		//esse codigo mostra a mundança do metódo que foi sobreposto.
		
		Conta acc3 = new contaDeEmpresa(1004, "Gustavo", 1000.00, 3000.00);
		acc3.saque(200);
		System.out.println(acc3.getBalance()); 
	}

}
