package SOLID.OCP.Solucao_Extensao;

public class DebitoContaPoupanca implements IDebitoConta {

	@Override
	public String debitar() {
		System.out.println("validar aniversario");
		System.out.println("debitar conta poupanca");
		return formatarTransacao();
	}

}
