package SOLID.DIP.Solucao;

public class Teste {

	public static void main(String[] args) {
		
		ClienteService srv = new ClienteService(new EmailService(), new ClienteRepositoryNOVO());
		Cliente c = new Cliente();
		srv.adicionarCliente(c);
	}

}
