package br.com.jamesson.testespring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.jamesson.testespring.cases.gereric.GenericRepository;
import br.com.jamesson.testespring.cases.gereric.IGenericRepository;
import br.com.jamesson.testespring.model.Cliente;
import br.com.jamesson.testespring.repository.ClienteRepository;
import br.com.jamesson.testespring.repository.IClienteRepository;
import br.com.jamesson.testespring.service.ClienteService;
import br.com.jamesson.testespring.service.IClienteService;

@Configuration
public class AppConfig {

	@Bean
	public IClienteRepository clienteRepository() {
		return new ClienteRepository();
	}

	@Bean
	public IClienteService clienteService() {
		return new ClienteService(clienteRepository());
	}

	@Bean
	public IGenericRepository<Cliente> genericRepository() {
		return new GenericRepository<>();
	}

}
