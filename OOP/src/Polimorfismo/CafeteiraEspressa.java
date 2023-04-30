package Polimorfismo;

import Abstracao.Eletrodomestico;

public class CafeteiraEspressa extends Eletrodomestico{

	public CafeteiraEspressa(String nome, int voltagem) {
		super(nome, voltagem);
	}
	
	public CafeteiraEspressa() {
		super("Padrao", 220);
	}
	
	private void aquecerAguar() { System.out.println("aquecer aguar..."); }

	private void moerGraos() { System.out.println("moer graos ..."); }
	
	public void prepararCafe() {
		testar();
		aquecerAguar();
		moerGraos();
	}
	
	@Override
	public void ligar() {
		System.out.println("ligando cafeteira...");
	}

	@Override
	public void desligar() {
		System.out.println("desligando cafeteira...");
	}

}
