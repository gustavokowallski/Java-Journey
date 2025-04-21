package model.entities;

public class ProcessarPedido implements FreteService{

	private FreteService freteService;
	
	
	
	public ProcessarPedido(FreteService freteService) {

		this.freteService = freteService;
	}



	public FreteService getFreteService() {
		return freteService;
	}



	public void setFreteService(FreteService freteService) {
		this.freteService = freteService;
	}



	@Override
	public double calculo(double peso) {
		return freteService.calculo(peso);
	}
	

}
