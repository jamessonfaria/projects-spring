package SOLID.ISP.Solucao;

public class CadastroCliente implements ICadastroCliente{
	@Override
	public void validarDados() {
		System.out.println("validando CPF, email ...");
	}

	@Override
	public void salvarBanco() {
		System.out.println("inserindo na tabela cliente");		
	}

	@Override
	public void enviarEmail() {
		System.out.println("enviar email para o cliente ...");		
	}

}
