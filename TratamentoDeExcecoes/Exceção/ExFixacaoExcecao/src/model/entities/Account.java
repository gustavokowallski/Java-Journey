package model.entities;

import model.exceptions.DomainException;

public class Account {
	private int number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account() {
		
	}

	public Account(int number, String holder, Double balance, Double withDrawLimit) throws DomainException {
		if (balance < 0) {
			throw new DomainException("Balance cannot be negative.");
		}
		if (withDrawLimit < 0) {
			throw new DomainException("WithDraw limit cannot be negative.");
		}
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}
	
	public Double Deposit(double amount) {
		return balance += amount;
	}
	
	
	public Double withDraw(double amount) throws DomainException {
		if (amount > withDrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit ");
		}
		if (amount > balance) {
			throw new DomainException("Not enough balance");
		}
		
		
		return balance -= amount;
	}
}
