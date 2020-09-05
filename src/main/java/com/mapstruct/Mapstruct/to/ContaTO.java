package com.mapstruct.Mapstruct.to;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaTO {
	
	 private int agencia;
	 private int numeroConta;
     private BigDecimal saldoConta;
}
