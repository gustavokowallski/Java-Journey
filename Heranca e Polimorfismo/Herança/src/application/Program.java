package application;

import entities.Conta;
import entities.contaDeEmpresa;
import entities.polpanca;

public class Program {

	public static void main(String[] args) {
		Conta acc = new Conta(1001, "Bob", 0.0);
		contaDeEmpresa bacc = new contaDeEmpresa(1002, "Ana", 0.0, 500.0);

		
		//UpCasting
		// isso é possivel pois a contaDeEmpresa e polpanca são contas, então é possivel atribuir as subclasses a superclasse, pois as subclasses são uma superclasse extendida;
		Conta acc2 = bacc; 
		Conta acc3 = new contaDeEmpresa(1003, "Jorge", 0.0, 1200.0);
		Conta acc4 = new polpanca(1004, "Gustavo", 0.0, 0.1);
		
		
		//DownCasting
		//contaDeEmpresa  acc5 = acc2; // não é possivel converter pois a acc2 é uma conta e não tem como transformala em contaDeEmpresa;
		contaDeEmpresa  acc5 = (contaDeEmpresa)acc2; // no caso precisaremos fazer a conta receber o tipo da subclasse. Fazendo um casting Manual. Ai sim funciona
		acc5.Emprestimo(200.0); // se eu quiser fazer um emprestimo numa conta normal, eu preciso fazer um DownCasting e ai eu consigo chamar o metódo empresitimo.
		
		//contaDeEmpresa  acc6 = (contaDeEmpresa)acc3; // se for fazer o DownCasting com outra classe que seja uma subclasse não vai ser possivel. pois uma subclasse não é derivada de outra subclasse.
		// a Grosso modo uma conta polpanca é uma conta, não uma contaDeEmpresa.
		
		/* Como evitar esse erro, devemos testar se o Objetivo que está sendo será Atribuido (acc3) é realmente um objeto valido para converter.  */
		
		
		
		if (acc4 instanceof contaDeEmpresa ) { // se a variavel acc3 for instacia de ContaDeEmpresa, será criado um emprestimo e conversao será feita.
			contaDeEmpresa  acc6 = (contaDeEmpresa)acc4;    // vai receber os valores de acc4 como conta empresa
			acc6.Emprestimo(200);
			System.out.println("Emprestimo Realizado.");
	}
		if (acc4 instanceof polpanca) { // se ela for instancia de polpanca, ele vai criar uma variavel acc6 de polpanca, e vai atualizar o saldo;
			polpanca acc6 = (polpanca)acc4;  // vai receber os valores de acc4 como polpanca
			acc6.atualizarSaldo();
			System.out.println("Update");
		}
		
		
		
		
	}
	
	
}
