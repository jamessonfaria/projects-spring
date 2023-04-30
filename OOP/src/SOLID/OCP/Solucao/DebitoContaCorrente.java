package SOLID.OCP.Solucao;

public class DebitoContaCorrente extends DebitoConta{

	@Override
	public String debitar(long valor, String conta) {
		// debitar conta corrente
		return formatarTransacao();
	}

}
