package com.mapstruct.Mapstruct.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mapstruct.Mapstruct.models.Cliente;
import com.mapstruct.Mapstruct.to.ClienteTO;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
	
	@Mapping(source = "contasTO", target = "contas")
	Cliente convert(ClienteTO clienteTO);

}
