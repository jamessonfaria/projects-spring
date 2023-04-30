package Encapsulamento;

import Polimorfismo.CafeteiraEspressa;

public class AutomacaoCafe {

	public void servirCafe() {
		CafeteiraEspressa espresso = new CafeteiraEspressa();
		espresso.ligar();
		espresso.prepararCafe();
		espresso.desligar();
	}
	
	public static void main(String args[]) {
		AutomacaoCafe ac = new AutomacaoCafe();
		ac.servirCafe();
	}
	
}
