package br.com.jamesson.testespring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

	@GetMapping("/produto")
	public ResponseEntity<String> getProduto() {
		return ResponseEntity.ok("teste");
	}
	
}
