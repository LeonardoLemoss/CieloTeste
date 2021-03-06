package com.testeCielo.entrypoint.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LancamentoExtratoResponse {
	
	private String dataLançamento;
	private String descricao;
	private String situacao;
	private String numero;
	private String dataConfirmacao;
	private String dadosBancario;
	private Double valorFinal;

}
