package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ProdutoUsado extends Produto {
	private LocalDate manufactureDate;
	private Date dataDeCriacao;
	
	public ProdutoUsado() {
		
	}

	public ProdutoUsado(String name, Double price, Date dataDeCriacao) {
		super(name, price);
		this.dataDeCriacao = dataDeCriacao;
	}

	public Date getDataDeCriacao() {
		return dataDeCriacao;
	}

	public void setDataDeCriacao(Date dataDeCriacao) {
		this.dataDeCriacao = dataDeCriacao;
	}
	public String priceTag() {
		return super.priceTag()
				+" (Manufacture Date:  "
				+ manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ")";
		
				
	}
}
