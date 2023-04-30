package SOLID.OCP.Solucao;

public class DebitoContaInvestimento extends DebitoConta{

	@Override
	public String debitar(long valor, String conta) {
		// debito conta investimento
		// isentar taxas
		return formatarTransacao();
	}

}
