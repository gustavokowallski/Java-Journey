package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

public class Contract {
	private Integer number;
	private LocalDate date;
	private Double totalValue;
	
	public List<Fatura> parcelas = new ArrayList<>(); //quando nos temos a relação de um para muitos, devemos usar a lista para representar
	
	public Contract() {
		
	}

	public Contract(Integer number, LocalDate date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;

	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public void addFatura(Fatura fatura) {
		parcelas.add(fatura);
	}
	public void removeFatura(Fatura fatura) {
		parcelas.remove(fatura);
	}



	
	
	
}
