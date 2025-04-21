package entities;

public class Hospede {
	private String name;
	private String cpf;
	
	public Hospede(){
		
	}

	public Hospede(String name, String cpf) {
		super();
		this.name = name;
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString() {
		return String.format("Nome: %s%nCPF: %s", name, cpf);
	}
}
