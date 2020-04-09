package com.testeCielo.entrypoint.converter;

import java.util.List;

import org.springframework.stereotype.Component;

import com.testeCielo.entrypoint.dto.response.LancamentoExtratoResponse;
import com.testeCielo.usecase.dto.response.LancamentoExtratoOutput;

@Component
public class LancamentoConverter {

	public List<LancamentoExtratoResponse> ParaLancamentoExtratoController(
			List<LancamentoExtratoOutput> listaLancamento) {
		return null;
	}

}
