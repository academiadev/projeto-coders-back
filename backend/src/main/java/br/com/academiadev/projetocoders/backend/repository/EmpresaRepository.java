package br.com.academiadev.projetocoders.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.academiadev.projetocoders.backend.model.Empresa;

@Repository
public interface EmpresaRepository extends CrudRepository<Empresa, Long>{
	
	public Empresa findByCodigo(Long codigo);

}
