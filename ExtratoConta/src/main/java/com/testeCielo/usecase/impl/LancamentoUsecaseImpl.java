package com.testeCielo.usecase.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.testeCielo.gateway.LancamentoGateWay;
import com.testeCielo.gateway.dto.response.ExtratoResponseIntegration;
import com.testeCielo.usecase.LancamentoUsecase;
import com.testeCielo.usecase.converter.LancamentoUsecaseConverter;
import com.testeCielo.usecase.dto.response.LancamentoExtratoOutput;

public class LancamentoUsecaseImpl implements LancamentoUsecase{

	@Autowired
	private LancamentoGateWay gateway;
	
	@Autowired
	private LancamentoUsecaseConverter converter;
	
	@Override
	public List<LancamentoExtratoOutput> retirarExtrato() {
		
		ExtratoResponseIntegration extratoIntegration =
				gateway.lancarExtrato();
		
		List<LancamentoExtratoOutput> listaLancamento =
				converter.ParaLancamentoExtratoUsecase(extratoIntegration);
				
		return listaLancamento;
	}


}
