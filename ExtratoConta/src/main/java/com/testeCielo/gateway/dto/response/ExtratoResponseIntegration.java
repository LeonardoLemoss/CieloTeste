package com.testeCielo.gateway.dto.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ExtratoResponseIntegration {

	@JsonProperty(value = "totalControleLancamento")
	private TotalControleResponseIntegration totaldeLancamento;
	@JsonProperty(value = "listaControleLancamento")
	private List<LancamentosResponseIntegration> lancamentos;
	@JsonProperty(value = "indice")
	private int indice;
	@JsonProperty(value = "tamanhoPagina")
	private int paginacao;
	@JsonProperty(value = "totalElements")
	private int totalElementos;

}
