package SOLID.LSP.Solucao;

public abstract class Paralelogramo {

	public double altura;
	public double largura;
	
	protected Paralelogramo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	protected final double area() {
		return this.altura * this.largura;
	}
	
}
