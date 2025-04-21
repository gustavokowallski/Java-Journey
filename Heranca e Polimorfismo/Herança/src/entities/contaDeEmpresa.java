package entities;

public class contaDeEmpresa extends Conta{ // essa é a sintexe da herança, colocar a classe extends e a classe que ela vai pegar os atributos.
	
	private Double limiteEmprestimo;
	
	public contaDeEmpresa() {
		super(); // super é para puxar se tiver algum código/ condição,  dentro do construtor da classe principal.
	}

	public contaDeEmpresa(Integer number, String holder, Double balance, Double limiteEmprestimo) {
		super(number, holder, balance);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	public void Emprestimo(double amount) {
		if (amount <= limiteEmprestimo) {
		 balance += amount -10;
	}
	}
		
		@Override // usar o Override para sobrescrever o metodo.
		public void saque(double valor) {
			super.saque(valor);
			 balance -= 2;
		}
	

	}
/* Herança trabalha com extensão de classes, como a classe contaDeEmpresa é uma extensão de conta, ela tem as mesmas coisas que a Conta tem mais com coisas a mais.
 /* Quando formos instanciar ela vai ter os mesmo atributos e vai ser 1 objeto, não vai ser igual a composição, que ela vai estar vinculada a Conta, ela vai ser um objeto
  * solo*/
