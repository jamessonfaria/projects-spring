package SOLID.LSP.Solucao;

public class CalculoArea {

	public static void main(String[] args) throws Exception {
		Quadrado quad = new Quadrado(5, 5);
		obterAreaParalelogramo(quad);

		Retangulo ret = new Retangulo(10, 5);
		obterAreaParalelogramo(ret);
	}

	private static void obterAreaParalelogramo(Paralelogramo par) {
		System.out.println("Calculo da area do retangulo");
		System.out.println(par.altura + " * " + par.largura);
		System.out.println(par.area());
	}

}
