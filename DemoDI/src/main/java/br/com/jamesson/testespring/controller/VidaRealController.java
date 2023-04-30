package br.com.jamesson.testespring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.jamesson.testespring.model.Cliente;
import br.com.jamesson.testespring.service.IClienteService;

@RestController
@RequestMapping("/vidareal")
public class VidaRealController {
	
	private IClienteService clienteService;
	
	public VidaRealController(IClienteService clienteService) {
		this.clienteService = clienteService;
	}
	
	@GetMapping(produces = "application/json")
	public @ResponseBody String lista(){
		clienteService.adicionarCliente(new Cliente());
		return "vida real";
	}

}
