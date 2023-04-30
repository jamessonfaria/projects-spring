package br.com.jamesson.testespring.service;

import br.com.jamesson.testespring.model.Cliente;
import br.com.jamesson.testespring.repository.IClienteRepository;

public class ClienteService implements IClienteService {

	private IClienteRepository clienteRepository;
	
	public ClienteService(IClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	@Override
	public void adicionarCliente(Cliente cliente) {
		clienteRepository.adicionarCliente(cliente);
	}

}
