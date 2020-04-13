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
public class ContaCorrenteClienteResponseIntegration {
	
	@JsonProperty(value = "numeroRemessaBanco")
	private long numeroRemessaBanco;
	
	@JsonProperty(value = "nomeSituacaoRemessa")
	private String situacao;
	
	@JsonProperty(value = "dadosDomicilioBancario")
	private DadosBancarioResponseIntegration dadosBancario;
	
	@JsonProperty(value = "nomeTipoOperacao")
	private String operacao;


}
