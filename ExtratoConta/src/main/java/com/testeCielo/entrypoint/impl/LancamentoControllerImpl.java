package com.testeCielo.entrypoint.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.testeCielo.entrypoint.LancamentoController;
import com.testeCielo.entrypoint.converter.LancamentoConverter;
import com.testeCielo.entrypoint.dto.response.LancamentoExtratoResponse;
import com.testeCielo.usecase.LancamentoUsecase;
import com.testeCielo.usecase.dto.response.LancamentoExtratoOutput;

public class LancamentoControllerImpl implements LancamentoController{

	@Autowired
	private LancamentoUsecase usecase; 
	
	@Autowired
	private LancamentoConverter converter;
	
	@Override
	public List<LancamentoExtratoResponse> retiraExtrato() {
		
		List<LancamentoExtratoOutput> listaLancamento = 
				usecase.retirarExtrato();
		
		List<LancamentoExtratoResponse> listaLancamentoController =
				converter.ParaLancamentoExtratoController(listaLancamento);
		
		return listaLancamentoController;
	}

}
