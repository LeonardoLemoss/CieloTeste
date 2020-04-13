package com.testeCielo.usecase.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LancamentoExtratoOutput {
	
	private String dataLancamento;
	private String descricao;
	private String numero;
	private String situacao;
	private String dataConfirmacao;
	private String dadosBancario;
	private Double valorFinal;

}
