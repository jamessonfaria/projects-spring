package SOLID.OCP.Solucao_Extensao;

public class ServicoDebitoConta {

	public String debitar(IDebitoConta debitoConta) {
		return debitoConta.debitar();
	}
	
}
