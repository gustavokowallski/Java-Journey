package model.entities;

public class FreteExpressoService implements FreteService {

	public FreteExpressoService() {

	}

	@Override
	public double calculo(double peso) {
		double frete=0;
		if(peso <= 10 ) {
			frete = peso *20;
		}
		else {
			frete = (10 * 20.0) + ((peso - 10) * 15.0);
		}
		return frete;
	}


	
	
}
