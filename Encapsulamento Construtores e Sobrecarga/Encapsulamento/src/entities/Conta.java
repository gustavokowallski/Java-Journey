package entities;

public class Conta {
	private int number;
	private String holder;
	private double balance;
	
	
	public Conta(int number, String holder) { // primeiro eu crio um construtor que recebe dois valores, apenas se ele for receber, o 
		//numero da conta e o nome do dono
		
		this.number = number;
		this.holder = holder;
	}


	public Conta(int number, String holder, double InitialDeposit) {//agora eu crio se ele for receber todos os valores
		
		this.number = number;
		this.holder = holder;
		deposit(InitialDeposit);
	}
	
	
	
	
	public int getNumber() {
		return number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	
	
	
	public void deposit(double amount) { //metodo de  deposito
		balance += amount;
	}
	
	public void withdraw(double amount) { //metodo de saque
		balance -= amount + 5.0;
	}

	
	public String toString() { //metodo string para printar
		return "Account "
				+ number 
				+"Holder "
				+holder
				+ "Balance $ "
				+ String.format("%.2f%n", balance);
	}
	
	
	
	}

	


	
	

