package Encapsulamento;

public class Main {

	public static void main(String[] args) {

		Publica p = new Publica();
		p.testeProtegido();
		p.testePublico();
		
		p.new ClassePublica();
		p.new ClasseProtegida();
		
	}

}
