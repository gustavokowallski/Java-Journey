package model.entities;

public class DollarToRealConverter implements ConversorMoeda{
	
	public DollarToRealConverter() {

	}

	@Override
	public double convert(double amount) {
		
		return amount * 5; //Dolar valendo 6;
		
	}
	
}
