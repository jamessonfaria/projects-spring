package SOLID.DIP.Violacao;

public class Cpf {

	public String numero;
	
	public Boolean validar() {
		return this.numero.length() != 11;
	}	
}
