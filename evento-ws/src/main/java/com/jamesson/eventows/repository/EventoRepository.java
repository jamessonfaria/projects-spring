package com.jamesson.eventows.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jamesson.eventows.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {

}
