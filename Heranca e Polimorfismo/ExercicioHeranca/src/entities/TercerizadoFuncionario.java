package entities;

public class TercerizadoFuncionario extends Funcionario {
	private Double addChange;
	

	public TercerizadoFuncionario() {
		super();
	}


	public TercerizadoFuncionario(String name, Integer hours, Double valuePerHour, Double addChange) {
		super(name, hours, valuePerHour);
		this.addChange = addChange;
	}


	public Double getAddChange() {
		return addChange;
	}


	public void setAddChange(Double addChange) {
		this.addChange = addChange;
	}
	
	@Override
	public double payment() {
		
		return super.payment() - addChange * 1.1; // chama o pagamento da classe principal e apenas complementa o valor do funcionario Teceirizado;
		
	}
	
	
	
	
}
