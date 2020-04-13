package com.testeCielo.usecase.converter;


import org.springframework.stereotype.Component;

import com.testeCielo.gateway.dto.response.LancamentosResponseIntegration;
import com.testeCielo.usecase.dto.response.LancamentoExtratoOutput;

@Component
public class LancamentoUsecaseConverter {

	public LancamentoExtratoOutput ParaLancamentoExtratoUsecase(LancamentosResponseIntegration e) {
		return LancamentoExtratoOutput.builder()
				.dataLancamento(e.getEfetivaLancamento())
				.descricao(e.getLancamentosCliente().getOperacao())
				.numero(e.getLancamentosCliente().getNumeroRemessaBanco())
				.situacao(e.getLancamentosCliente().getSituacao())
				.dadosBancario(e.getBanco())
				.dataConfirmacao(e.getContaCorrenteCliente())
				.valorFinal(e.getValorRemessa())
				.build();
	}
}
