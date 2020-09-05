package com.mapstruct.Mapstruct.to;

import java.util.List;

import com.mapstruct.Mapstruct.models.Conta;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteTO {

	private String nome;
	private List<ContaTO> contasTO;
}
