package SOLID.LSP.Solucao;

public class Quadrado extends Paralelogramo {

	protected Quadrado(double altura, double largura) throws Exception {
		super(altura, largura);
		if(altura != largura)
			throw new Exception("Os dois lados do quadrado precisam ser iguais.");
	}

}
