package br.com.jamesson.testespring.repository;

import br.com.jamesson.testespring.model.Cliente;
import ch.qos.logback.classic.Logger;

public class ClienteRepository implements IClienteRepository {

	Logger logger;
	
	@Override
	public void adicionarCliente(Cliente cliente) {
		logger.log(null, "cadastrando cliente no DB ...", 0, null, null, null);
	}

}
