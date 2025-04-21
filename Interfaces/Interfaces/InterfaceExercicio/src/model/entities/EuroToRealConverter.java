package model.entities;

public class EuroToRealConverter implements ConversorMoeda{

	public EuroToRealConverter() {

	}

	@Override
	public double convert(double amount) {
		
		return amount * 6; //Dolar valendo 6;
		
	}
	
}
