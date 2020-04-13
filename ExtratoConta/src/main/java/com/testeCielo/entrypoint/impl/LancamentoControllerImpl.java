package com.testeCielo.entrypoint.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testeCielo.entrypoint.LancamentoController;
import com.testeCielo.entrypoint.converter.LancamentoConverterHttp;
import com.testeCielo.entrypoint.dto.response.LancamentoExtratoResponse;
import com.testeCielo.usecase.LancamentoUsecase;
import com.testeCielo.usecase.dto.response.LancamentoExtratoOutput;

@RestController
@RequestMapping(value = "/lancamento")
public class LancamentoControllerImpl implements LancamentoController{

	@Autowired
	private LancamentoUsecase usecase; 
	
	@Autowired
	private LancamentoConverterHttp converter;
	
	@Autowired
	@GetMapping(value = "/extrato")
	public LancamentoExtratoResponse retiraExtrato() {
		
		LancamentoExtratoOutput extrato = 
				usecase.retirarExtrato();
		
		LancamentoExtratoResponse LancamentoController =
				converter.ParaLancamentoExtratoController(extrato);
		
		return LancamentoController;
	}

}
