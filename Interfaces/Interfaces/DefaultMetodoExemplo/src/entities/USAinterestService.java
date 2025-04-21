package entities;

public class USAinterestService implements InterestService{
	private double interestRate;

	public USAinterestService(double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}
	
	public double interestRate() {
		return interestRate;
	}
	
}
