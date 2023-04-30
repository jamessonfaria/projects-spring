package SOLID.OCP.Solucao_Extensao;

public class DebitoContaCorrente implements IDebitoConta {

	@Override
	public String debitar() {
		System.out.println("debitar conta corrente");
		return formatarTransacao();
	}

}
