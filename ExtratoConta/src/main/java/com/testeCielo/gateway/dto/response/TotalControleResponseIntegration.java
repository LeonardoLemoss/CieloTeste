package com.testeCielo.gateway.dto.response;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TotalControleResponseIntegration {
	
	@JsonProperty(value = "quantidadeLancamentos")
	private Long lancamentos;
	
	@JsonProperty(value = "quantidadeRemessas")
	private long remessas;
	
	@JsonProperty(value = "valorLancamentos")
	private Double valor;

}
