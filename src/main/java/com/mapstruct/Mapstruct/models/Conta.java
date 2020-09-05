package com.mapstruct.Mapstruct.models;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Conta {

	 private int agencia;
	 private int numeroConta;
     private BigDecimal saldo;
	 
}
