package Heranca;

import java.time.LocalDate;

public class Pessoa {

	public String nome;
	public LocalDate dataNascimento;
	
	public int calcularIdade() {
		LocalDate dataAtual = LocalDate.now();
		int idade = dataAtual.getYear() - this.dataNascimento.getYear();
		if(dataAtual.isBefore(this.dataNascimento.plusYears(idade))) {
			idade--;
		}
			
		return idade;	
	}
	
}
