package br.com.jamesson.testespring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.jamesson.testespring.model.Cliente;
import br.com.jamesson.testespring.service.IClienteService;

@RestController
@RequestMapping("/fromservices")
public class FromServiceController {
	
	// using constructor injection
	
	private IClienteService clienteServiceNew;
	
	public FromServiceController(final IClienteService clienteServiceNew) {
		this.clienteServiceNew = clienteServiceNew;
	}
	
	@GetMapping(produces = "application/json")
	public @ResponseBody String lista(){
		clienteServiceNew.adicionarCliente(new Cliente());
		return "From Services.....";
	}
}
