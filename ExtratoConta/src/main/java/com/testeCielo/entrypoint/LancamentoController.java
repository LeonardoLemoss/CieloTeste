package com.testeCielo.entrypoint;

import com.testeCielo.entrypoint.dto.response.LancamentoExtratoResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@Api(value = "Extrato")
public interface LancamentoController {
	
	@ApiResponses(value = {
		    @ApiResponse(code = 200, message = "Dados obtidos com sucesso"),
		    @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
		    @ApiResponse(code = 500, message = "Erro interno"),
		})
	public LancamentoExtratoResponse retiraExtrato();
	
}