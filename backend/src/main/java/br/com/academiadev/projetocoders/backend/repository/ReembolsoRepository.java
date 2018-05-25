package br.com.academiadev.projetocoders.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.academiadev.projetocoders.backend.model.Reembolso;

@Repository
public interface ReembolsoRepository extends CrudRepository<Reembolso, Long> {

}
