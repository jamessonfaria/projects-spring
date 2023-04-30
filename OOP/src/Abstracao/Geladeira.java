package Abstracao;

public class Geladeira extends Eletrodomestico {

	public Geladeira(String nome, int voltagem) {
		super(nome, voltagem);
	}

	@Override
	public void ligar() {
		System.out.println("geladeira ligando...");
	}

	@Override
	public void desligar() {
		System.out.println("geladeira desligando...");
	}

	public void imprimir() {
		System.out.println(this.getNome() + " - " + this.getVoltagem());
	}
}
