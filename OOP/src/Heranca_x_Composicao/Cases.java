package Heranca_x_Composicao;

import java.time.LocalDate;

import Heranca.Pessoa;

public class Cases {

	public class PessoaFisica extends Pessoa {
		public String cpf;
	}
	
	public class PessoaFisica2 {
		public String cpf;
		public Pessoa pessoa;
	}
	
	public static void main(String[] args) {
		Cases c = new Cases();
		PessoaFisica pf = c.new PessoaFisica();
		pf.nome = "Joao";
		pf.dataNascimento = LocalDate.now();
		pf.cpf = "123123213213";
	
	
		PessoaFisica2 pf2 = c.new PessoaFisica2();
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Joao";
		pessoa.dataNascimento = LocalDate.now();
		pf2.pessoa = pessoa;
		pf2.cpf = "123123213213";

		
		
	
	}
}
