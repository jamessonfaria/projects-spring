package SOLID.DIP.Solucao;

import SOLID.DIP.Solucao.Interfaces.IClienteRepository;
import SOLID.DIP.Solucao.Interfaces.IClienteServices;
import SOLID.DIP.Solucao.Interfaces.IEmailServices;

public class ClienteService implements IClienteServices {

	private IClienteRepository clienteRepository;
	private IEmailServices emailService;
	
	public ClienteService(IEmailServices emailService, 
			IClienteRepository clienteRepository) {
		this.emailService = emailService;
		this.clienteRepository = clienteRepository;
	}
	
	@Override
	public String adicionarCliente(Cliente cliente) {
		
		if(!cliente.validar())
			return "Dados invalidos";
		
		clienteRepository.adicionarCliente(cliente);
		emailService.enviar("jame@aol.com", "fulano@gmail.com", "teste", "tal tal tal...", "123");
		return "Cliente cadastrado com sucesso";
		
	}
	
}
