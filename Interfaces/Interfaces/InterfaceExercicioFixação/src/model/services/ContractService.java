package model.services;

import java.time.LocalDate;


import model.entities.Contract;
import model.entities.Fatura;

public class ContractService {
	
	private OnlinePaymentService ops;

	public ContractService(OnlinePaymentService ops) {
		this.ops = ops;
	}
	public void processContract(Contract contract, Integer months) {
		
		double parcelas = contract.getTotalValue()/ months;
		
		
		for (int i =1; i<=months;i++) {
			double juros = ops.interest(parcelas, i);//primeiro adiciona o juros correspondente a parcela
			double finalValue= parcelas + juros; //depois soma esse valor do juros com o valor da parcela
			
			finalValue+= ops.paymentFee(finalValue); //e por fim adiciona juntamente ao o valor da Taxa de Pagamento
			
			LocalDate date = contract.getDate().plusMonths(i); // adiciona o valor de i aos meses para adicionar na fatura.
			Fatura fatura = new Fatura(date, finalValue);
			contract.addFatura(fatura); //poderia instanciar a fatura no parenteses tambem;
		}
		
		
		
		
	}
}
