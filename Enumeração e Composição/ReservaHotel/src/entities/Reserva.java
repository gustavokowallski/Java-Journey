package entities;

public class Reserva {
	private Hospede hospede;
	private Quarto quarto;
	
	public Reserva() {
		
	}

	public Reserva(Hospede hospede, Quarto quarto) {
		this.hospede = hospede;
		this.quarto = quarto;
	}

	public Hospede getHospede() {
		return hospede;
	}

	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Hóspede:\n ");
		sb.append(hospede + "\n");
		sb.append("\n");
		sb.append("Quarto Reservado: \n");
		sb.append(quarto);
		return sb.toString();
	}
	
	
}