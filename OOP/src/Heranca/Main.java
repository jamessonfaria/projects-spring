package Heranca;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		funcionario.nome = "joao da silva";
		funcionario.dataNascimento = LocalDate.of(1990, 01, 01);
		funcionario.dataAdmissao = LocalDate.now();
		funcionario.registro = "414123123";
		System.out.println(funcionario.calcularIdade());
	}

}
