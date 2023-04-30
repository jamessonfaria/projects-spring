package SOLID.OCP.Solucao;

import java.time.LocalDate;

public abstract class DebitoConta {

	public String numeroTransacao;
	public abstract String debitar(long valor, String conta);
	
	public final String formatarTransacao() {
		final String chars = "AAFGBRRTGNYUFSDADA4444";
		return this.numeroTransacao = chars + "@" + LocalDate.now();
	}
	
}
