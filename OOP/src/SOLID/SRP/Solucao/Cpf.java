package SOLID.SRP.Solucao;

public class Cpf {

	public String numero;
	
	public Boolean validar() {
		return this.numero.length() != 11;
	}	
}
