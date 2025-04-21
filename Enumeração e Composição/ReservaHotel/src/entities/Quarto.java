package entities;

import entities.enums.TipoQuarto;

public class Quarto {
	private Integer roomNumber;
	private TipoQuarto tipo;
	
	
	public Quarto() {
		
	}

	public Quarto(Integer roomNumber, TipoQuarto tipo, Hospede hospede) {

		this.roomNumber = roomNumber;
		this.tipo = tipo;
		
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public TipoQuarto getTipo() {
		return tipo;
	}

	public void setTipo(TipoQuarto tipo) {
		this.tipo = tipo;
	}


	public String toString() {
		return String.format("Numero Quarto: %s%nTipo: %s", roomNumber, tipo);
	}
	
	
}
