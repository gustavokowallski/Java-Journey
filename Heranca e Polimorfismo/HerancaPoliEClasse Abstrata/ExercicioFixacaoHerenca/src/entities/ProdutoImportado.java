package entities;

public class ProdutoImportado extends Produto{
	private Double CustomFee;

	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String name, Double price, Double customFee) {
		super(name, price);
		CustomFee = customFee;
	}

	public Double getCustomFee() {
		return CustomFee;
	}

	public void setCustomFee(Double customFee) {
		CustomFee = customFee;
	}

	public Double totalprice() {
		return  price + CustomFee;
	}
	@Override
	public String priceTag() {
		return "product:"
				+name
				+String.format("%.2f", totalprice())
				+" ( Customs Fee: R$ "
				+CustomFee
				+" )";
				
	}
}
