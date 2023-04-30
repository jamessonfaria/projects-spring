package SOLID.SRP.Solucao;

public class ClienteService {

	public String adicionarCliente(Cliente cliente) {
		if(!cliente.validar())
			return "Dados invalidos";
		
		ClienteRepository repository = new ClienteRepository();
		repository.adicionarCliente(cliente);
		
		EmailService.enviar("jame@aol.com", "fulano@gmail.com", "teste", "tal tal tal...", "123");
		return "Cliente cadastrado com sucesso";
	}
	
}
