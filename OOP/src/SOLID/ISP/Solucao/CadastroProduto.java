package SOLID.ISP.Solucao;

public class CadastroProduto implements ICadastroProduto {

	@Override
	public void salvarBanco() {
		System.out.println("validando dados do produto ...");

	}

	@Override
	public void validarDados() {
		System.out.println("inserindo na tabela produto");

	}

}
