package com.testeCielo.gateway.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseIntegration {
	
	@JsonProperty(value = "quantidadeLancamentos")
	private Long lancamentos;
	
	@JsonProperty(value = "quantidadeRemessas")
	private long remessas;
	
	@JsonProperty(value = "valorLancamentos")
	private Double valor;

}
