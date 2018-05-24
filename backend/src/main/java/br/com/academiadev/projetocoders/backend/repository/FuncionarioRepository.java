package br.com.academiadev.projetocoders.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.academiadev.projetocoders.backend.model.Funcionario;

@Repository
public interface FuncionarioRepository extends CrudRepository<Funcionario, Long>{
	
	public Funcionario findByNome(String nome);
	
}
