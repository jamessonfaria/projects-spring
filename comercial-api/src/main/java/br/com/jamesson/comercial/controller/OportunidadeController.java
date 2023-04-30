package br.com.jamesson.comercial.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.jamesson.comercial.model.Oportunidade;
import br.com.jamesson.comercial.repository.OportunidadeRepository;

@CrossOrigin
@RestController
@RequestMapping("/oportunidades")
public class OportunidadeController {

	@Autowired
	private OportunidadeRepository rep;

	@GetMapping
	public List<Oportunidade> listar() {
		return rep.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Oportunidade> buscar(@PathVariable Long id) {
		Optional<Oportunidade> oportunidade = rep.findById(id);
		if (!oportunidade.isPresent())
			return ResponseEntity.notFound().build();

		return ResponseEntity.ok(oportunidade.get());
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Oportunidade adicionar(@Valid @RequestBody Oportunidade oportunidade) {
		
		Optional<Oportunidade> oportunidadeExistente = rep
				.findByDescricaoAndNomeProspecto(oportunidade.getDescricao(),
				oportunidade.getNomeProspecto());
		
		if(oportunidadeExistente.isPresent())
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
					"Já existe uma oportunidade para este prospecto com a mesma descricao");
		
		return rep.save(oportunidade);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long id) {
		rep.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Oportunidade> atualizar(@Valid @PathVariable Long id, @RequestBody Oportunidade oportunidade){
		Optional<Oportunidade> resOportunidade = rep.findById(id);
		if (!resOportunidade.isPresent())
			return ResponseEntity.notFound().build();

		rep.save(oportunidade);
		return ResponseEntity.ok(oportunidade);
	}
	

}
