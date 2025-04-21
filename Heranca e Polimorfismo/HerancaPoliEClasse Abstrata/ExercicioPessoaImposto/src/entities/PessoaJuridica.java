package entities;

public class PessoaJuridica extends Pessoa {
	private int numFuncionarios;

	public PessoaJuridica(String name, Double rendaAnual, int numFuncionarios) {
		super(name, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	public int getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public double calculoImposto() {
		double imposto=0;
		if (numFuncionarios <=10) {
			imposto = rendaAnual * 0.10;
		}
		else  {
			imposto = rendaAnual * 0.14;
		}
		return imposto;
	}
	
	
	
}
