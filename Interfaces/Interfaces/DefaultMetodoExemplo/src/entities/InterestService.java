package entities;

import java.security.InvalidParameterException;

public interface InterestService {
	double getInterestRate();
	
	default double payment(double amount, int months) {
		if (months < 0) {
			throw new InvalidParameterException("Meses não podem ser menores que 0");
		}
		return  amount * Math.pow((1 + getInterestRate() /100 ),  months);
		
	}
}
