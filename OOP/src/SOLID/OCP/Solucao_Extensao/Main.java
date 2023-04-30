package SOLID.OCP.Solucao_Extensao;

public class Main {

	public static void main(String[] args) {

		ServicoDebitoConta s = new ServicoDebitoConta();
		DebitoContaCorrente cc = new DebitoContaCorrente();
		DebitoContaPoupanca cp = new DebitoContaPoupanca();
		DebitoContaInvestimento ci = new DebitoContaInvestimento();
		
		s.debitar(cc);
		s.debitar(cp);
		s.debitar(ci);
		
	}

}
