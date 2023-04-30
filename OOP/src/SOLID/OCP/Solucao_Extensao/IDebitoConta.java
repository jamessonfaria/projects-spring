package SOLID.OCP.Solucao_Extensao;

import java.time.LocalDate;

public interface IDebitoConta {

	public String debitar();

	default String formatarTransacao() {
		final String chars = "AAFGBRRTGNYUFSDADA4444";
		return chars + "@" + LocalDate.now();
	}

}
