package entities;

public  class polpanca extends Conta{
	private Double juros;

	public polpanca() {
		super();
	}

	public polpanca(Integer number, String holder, Double balance, Double juros) {
		super(number, holder, balance);
		this.juros = juros;
	}

	public Double getJuros() {
		return juros;
	}

	public void setJuros(Double juros) {
		this.juros = juros;
	}
	
	public void atualizarSaldo() {
		balance += balance * juros;
	}
	
	@Override // usar o Override para sobrescrever o metodo.
	public final void saque(double valor) {
		 balance -= valor;
	}
}
