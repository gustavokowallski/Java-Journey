package entities;

public class CurrentyConvert {
	public double dolar;
	public double buyDolar;
	public static final double taxa = 0.06;
	
	public static double getConversao(double dolar, double buyDolar) {
		return  (dolar * buyDolar) + (dolar * buyDolar)*taxa;
	}
	
}

