package SOLID.SRP.Solucao;

public class Email {

	public String endereco;
		
	public Boolean validar() {
		return this.endereco.contains("@");
	}
}
