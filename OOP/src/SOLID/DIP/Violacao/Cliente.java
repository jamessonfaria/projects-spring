package SOLID.DIP.Violacao;

import java.time.LocalDate;

public class Cliente {

	public int clienteId;
	public String nome;
	public Email email;
	public Cpf cpf;
	public LocalDate dataCadastro;

	public Boolean validar() {
		return email.validar() && cpf.validar();
	}

	
}
