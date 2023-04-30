package Polimorfismo;

import Encapsulamento.Publica;

public class Main extends Publica {

	public static void main(String[] args) {
		CafeteiraEspressa ce = new CafeteiraEspressa();
		ce.prepararCafe();

		Publica p = new Publica();
		//p.testeProtegido();
		p.testePublico();
		
		p.new ClassePublica();
		p.new ClasseProtegida();
	
	
	}

}
