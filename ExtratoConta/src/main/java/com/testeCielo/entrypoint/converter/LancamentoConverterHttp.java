package com.testeCielo.entrypoint.converter;

import java.util.List;

import org.springframework.stereotype.Component;

import com.testeCielo.entrypoint.dto.response.LancamentoExtratoResponse;
import com.testeCielo.usecase.dto.response.LancamentoExtratoOutput;
import static java.util.Objects.isNull;

import java.util.ArrayList;

@Component
public class LancamentoConverterHttp {

	public List<LancamentoExtratoResponse> ParaLancamentoExtratoController(
			List<LancamentoExtratoOutput> listaLancamento) {
		
		if(isNull(listaLancamento)) {
			return null;
		}
		
		List<LancamentoExtratoResponse> listaExtratoController = new ArrayList<>();
		
		listaLancamento.forEach(
				l -> listaExtratoController.add(ToExtratoController(l)) );
		
		
		return listaExtratoController;
	}

	private LancamentoExtratoResponse ToExtratoController(LancamentoExtratoOutput l) {

		if(isNull(l)) {
			return null;
		}
		
		return LancamentoExtratoResponse.builder()										
				.descricao(l.getDescricao())
				.numero(l.getNumero())
				.dataConfirmacao(l.getDataConfirmacao())
				.dadosBancario(l.getDadosBancario())
				.valorFinal(l.getValorFinal())
				.build();
	}

}
