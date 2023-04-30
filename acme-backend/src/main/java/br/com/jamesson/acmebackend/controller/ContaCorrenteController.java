package br.com.jamesson.acmebackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contacorrente")
public class ContaCorrenteController {

	@GetMapping(produces = "application/json")
	public @ResponseBody String test() {
		return "{id: 1, message: 'olaaa'}";
	}
	
}
