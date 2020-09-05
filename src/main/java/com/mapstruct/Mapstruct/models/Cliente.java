package com.mapstruct.Mapstruct.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
	 
	private String nome;
	private List<Conta> contas;

}
