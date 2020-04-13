package com.testeCielo.gateway.dto.response;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LancamentosResponseIntegration {
	
	@JsonProperty(value = "lancamentoContaCorrenteCliente")
	private ContaCorrenteClienteResponseIntegration lancamentosCliente;
	
	@JsonProperty(value = "dataEfetivaLancamento")
	private Date efetivaLancamento;
	
	@JsonProperty(value = "dataLancamentoContaCorrenteCliente")
	private Date contaCorrenteCliente;
	
	@JsonProperty(value = "numeroEvento")
	private long numeroEvento;
	
	@JsonProperty(value = "descricaoGrupoPagamento")
	private String grupoPagamento;
	
	@JsonProperty(value = "codigoIdentificadorUnico")
	private int identificador;
	
	@JsonProperty(value = "nomeBanco")
	private String banco;
	
	@JsonProperty(value = "quantidadeLancamentoRemessa")
	private int Remessa;
	
	@JsonProperty(value = "numeroRaizCNPJ")
	private long raizCnpj;
	
	@JsonProperty(value = "numeroSufixoCNPJ")
	private long sufixoCnpj;
	
	@JsonProperty(value = "valorLancamentoRemessa")
	private BigDecimal valorRemessa;
	
	@JsonProperty(value = "dateLancamentoContaCorrenteCliente")
	private Date contaCorrenteClienteCodigo;
	
	@JsonProperty(value = "dateEfetivaLancamento")
	private Date efetivaLancamentoCodigo;
	
	
	
	
}
