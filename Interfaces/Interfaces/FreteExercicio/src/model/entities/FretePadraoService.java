package model.entities;

public class FretePadraoService implements FreteService {

	public FretePadraoService() {

	}

	@Override
	public double calculo(double peso) {
		return peso * 10;
	}

	
	
}
