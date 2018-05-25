package br.com.academiadev.projetocoders.backend.converter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.academiadev.projetocoders.backend.dto.ReembolsoDTO;
import br.com.academiadev.projetocoders.backend.model.Reembolso;

@Component
public class ReembolsoConverter implements Converter<Reembolso, ReembolsoDTO> {
	
	@Autowired
	private FuncionarioConverter funcionarioConverter;
	
	@Autowired
	private StatusConverter statusConverter;

	@Override
	public ReembolsoDTO toDTO(Reembolso entity) {
		ReembolsoDTO dto = new ReembolsoDTO();
		dto.setArquivoPath(entity.getArquivoPath());
		dto.setCategoria(entity.getCategoria());
		dto.setData(entity.getData().toString());
		dto.setDescricao(entity.getDescricao());
		dto.setFuncionario(funcionarioConverter.toDTO(entity.getFuncionario()));
		dto.setStatus(statusConverter.toDTO(entity.getStatus()));
		dto.setValor(entity.getValor().toString());
		return dto;
	}

	@Override
	public Reembolso toEntity(ReembolsoDTO dto) {
		Reembolso reembolso = new Reembolso();
		reembolso.setArquivoPath(dto.getArquivoPath());
		reembolso.setCategoria(dto.getCategoria());
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime data = LocalDateTime.parse(dto.getData(), formatter);		
		reembolso.setData(data);
		
		reembolso.setDataEnviado(LocalDate.now());
		
		reembolso.setDescricao(dto.getDescricao());
		reembolso.setStatus(statusConverter.toEntity(dto.getStatus()));
		
		return reembolso;
	}



}
