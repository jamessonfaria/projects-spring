package SOLID.OCP.Solucao_Extensao;

public class DebitoContaInvestimento implements IDebitoConta {

	@Override
	public String debitar() {
		System.out.println("debitar conta investimento");
		System.out.println("isentar impostos");
		return formatarTransacao();
	}

}
