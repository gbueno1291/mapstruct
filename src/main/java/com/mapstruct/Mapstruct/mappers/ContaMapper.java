package com.mapstruct.Mapstruct.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mapstruct.Mapstruct.models.Conta;
import com.mapstruct.Mapstruct.to.ContaTO;

@Mapper(componentModel = "spring")
public interface ContaMapper {
	
	//@Mapping(target = "saldo",ignore = true)
	@Mapping(source = "saldoConta", target = "saldo")
	Conta convert(ContaTO contaTO);
	
}
