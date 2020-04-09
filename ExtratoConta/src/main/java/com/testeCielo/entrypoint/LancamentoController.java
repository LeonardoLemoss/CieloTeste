package com.testeCielo.entrypoint;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testeCielo.entrypoint.dto.response.LancamentoExtratoResponse;

@RestController
@RequestMapping(name = "/lacamento")
public interface LancamentoController {
	
	@GetMapping(value = "/extrato")
	public List<LancamentoExtratoResponse> retiraExtrato (LancamentoExtratoResponse lancamento);
	
}
