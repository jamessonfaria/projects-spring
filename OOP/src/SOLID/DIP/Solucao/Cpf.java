package SOLID.DIP.Solucao;

public class Cpf {

	public String numero;
	
	public Boolean validar() {
		return this.numero.length() != 11;
	}	
}
