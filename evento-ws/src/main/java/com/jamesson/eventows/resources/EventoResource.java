package com.jamesson.eventows.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jamesson.eventows.models.Evento;
import com.jamesson.eventows.repository.EventoRepository;

@RestController
@RequestMapping("/evento")
public class EventoResource {

	@Autowired
	private EventoRepository er;
	
	@GetMapping(produces = "application/json")
	public @ResponseBody List<Evento> listaEventos() {
		 List<Evento> eventos = er.findAll();
		 return eventos;
	}
	
	@PostMapping
	public Evento cadastrarEvento(@RequestBody @Valid Evento evento) {
		return er.save(evento);
	}
	
	@DeleteMapping(produces = "application/json")
	public Evento deletarEvento(@RequestBody Evento evento) {
		er.delete(evento);
		return evento;
	}
	
}
