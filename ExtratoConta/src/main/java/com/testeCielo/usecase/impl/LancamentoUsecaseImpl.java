package com.testeCielo.usecase.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testeCielo.gateway.LancamentoGateWay;
import com.testeCielo.gateway.dto.response.LancamentosResponseIntegration;
import com.testeCielo.usecase.LancamentoUsecase;
import com.testeCielo.usecase.converter.LancamentoUsecaseConverter;
import com.testeCielo.usecase.dto.response.LancamentoExtratoOutput;

@Service
public class LancamentoUsecaseImpl implements LancamentoUsecase{

	@Autowired
	private LancamentoGateWay gateway;
	
	@Autowired
	private LancamentoUsecaseConverter converter;
	
	@Override
	public LancamentoExtratoOutput retirarExtrato() {
		
		LancamentosResponseIntegration extratoIntegration =
				gateway.extratoGateway();
		
		LancamentoExtratoOutput Lancamento =
				converter.ParaLancamentoExtratoUsecase(extratoIntegration);
				
		return Lancamento;
	}


}
