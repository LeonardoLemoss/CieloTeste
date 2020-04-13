package com.testeCielo.entrypoint.converter;

import static java.util.Objects.isNull;

import org.springframework.stereotype.Component;

import com.testeCielo.entrypoint.dto.response.LancamentoExtratoResponse;
import com.testeCielo.usecase.dto.response.LancamentoExtratoOutput;

@Component
public class LancamentoConverterHttp {

	public LancamentoExtratoResponse ParaLancamentoExtratoController (LancamentoExtratoOutput l) {

		if(isNull(l)) {
			return null;
		}
		
		return LancamentoExtratoResponse.builder()										
				.dataLançamento(l.getDataLancamento())
				.descricao(l.getDescricao())
				.numero(l.getNumero())
				.situacao(l.getSituacao())
				.dataConfirmacao(l.getDataConfirmacao())
				.dadosBancario(l.getDadosBancario())
				.valorFinal(l.getValorFinal())
				.build();
	}

}
