package SOLID.OCP.Violacao;

public class DebitoConta {

	public void debitar(long valor, String conta, TipoConta tipoConta) {
		if(tipoConta == TipoConta.Corrente) {
			// debitar conta corrente
		}
		
		if(tipoConta == TipoConta.Poupanca) {
			// validar aniversario
			// debitar conta poupanca
		}
	}
	
}
