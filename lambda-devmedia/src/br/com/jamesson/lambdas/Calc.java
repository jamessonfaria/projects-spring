package br.com.jamesson.lambdas;

import java.util.function.DoubleBinaryOperator;

public class Calc {

	private Calc() {}
	
	public static double calcular(double x, double y, DoubleBinaryOperator operacao) {
		return operacao.applyAsDouble(x, y);
	}

}
