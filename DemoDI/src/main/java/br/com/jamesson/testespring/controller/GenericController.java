package br.com.jamesson.testespring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.jamesson.testespring.cases.gereric.IGenericRepository;
import br.com.jamesson.testespring.model.Cliente;

@RestController
@RequestMapping("/generic")
public class GenericController {

	private IGenericRepository<Cliente> genericRepository;
	
	public GenericController(IGenericRepository<Cliente> genericRepository) {
		this.genericRepository = genericRepository;
	}
	
	@GetMapping(produces = "application/json")
	public @ResponseBody String lista(){
		genericRepository.adicionar(new Cliente());
		return "Generic.....";
	}
	
}
