package br.com.jamesson.testespring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.jamesson.testespring.model.Cliente;
import br.com.jamesson.testespring.service.IClienteService;

@RestController
@RequestMapping("/servicelocator")
public class ServiceLocatorController {
	private IClienteService serviceLocatorFactoryBean;
	
//	public ServiceLocatorController(final IClienteService clienteServiceLocator) {
//		this.serviceLocatorFactoryBean = clienteServiceLocator;
//	}
	
	@GetMapping(produces = "application/json")
	public @ResponseBody String lista(){
		serviceLocatorFactoryBean.adicionarCliente(new Cliente());
		return "From Services locator.....";
	}
}
