package entities;

public class PessoaFisica extends Pessoa {
	private Double gastosSaude;
	
	public PessoaFisica() {
		
	}

	public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
		super(name, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double calculoImposto() {
		double imposto = 0;
		

		    if (rendaAnual <= 20000) {
		        imposto = rendaAnual * 0.15;
		    } else {
		        imposto = rendaAnual * 0.25;
		    }

		    // Desconto por gastos com saúde (se tiver)
		    if (gastosSaude > 0) {
		        imposto -= gastosSaude * 0.5;
		    }

		    return imposto;
		

		
		
	}
	
	
}
