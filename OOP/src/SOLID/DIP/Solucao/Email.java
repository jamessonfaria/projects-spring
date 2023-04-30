package SOLID.DIP.Solucao;

public class Email {

	public String endereco;
		
	public Boolean validar() {
		return this.endereco.contains("@");
	}
}
