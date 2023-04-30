package SOLID.ISP.Violacao;

public class CadastroProduto implements ICadastro {

	@Override
	public void validarDados() {
		System.out.println("validando dados do produto ...");
	}

	@Override
	public void salvarBanco() {
		System.out.println("inserindo na tabela produto");
	}

	@Override
	public void enviarEmail() {
		// TODO Auto-generated method stub

	}

}
