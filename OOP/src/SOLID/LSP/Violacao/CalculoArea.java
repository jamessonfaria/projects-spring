package SOLID.LSP.Violacao;

public class CalculoArea {

	public static void main(String[] args) {
		Quadrado quad = new Quadrado();
		quad.setAltura(10);
		quad.setLargura(5);
		obterAreaRetangulo(quad);
		
		Retangulo ret = new Retangulo();
		ret.setAltura(10);
		ret.setLargura(5);
		obterAreaRetangulo(ret);
		
	}
	
	private static void obterAreaRetangulo(Retangulo ret) {
		System.out.println("Calculo da area do retangulo");
		System.out.println(ret.getAltura() + " * " + ret.getLargura());
		System.out.println(ret.area());
	}

}
