package model.entities;

public class PaymentProcessor implements ConversorMoeda {
	private ConversorMoeda conversorMoeda;

	public PaymentProcessor(ConversorMoeda convesorMoeda) {

		this.conversorMoeda = convesorMoeda;
	}

	@Override
	public double convert(double amount) {
		return conversorMoeda.convert(amount);
	}
	
	
	
}
