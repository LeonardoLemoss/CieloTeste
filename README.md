# CieloTeste
Criar projeto Java com API para Extrato de Lançamentos em conta.


        Projeto separado por 3 camadas principais:  EntryPoint / UseCase / Gateway.
        - seguindo arquiteruta de onion architecture, achei interessante implementar algo diferente em cima do projeto.
        
        Entrypoint - exposicao de servico, ou seja nossa controller.
        UseCase - nosso service, Regras de negocios e chamadas para outras camadas.
        Gateway - nossa camada de Integracao, com API / Mensageria / Banco de dados e etc, tudo que envolva integracao.
        
        DTOs - cada camada possui seus dtos e com nomeclatura proprias de cada camada, exemplo
                        -dtoEntrypoint  "NomeClasse"Response/Request
                        -dtoUseCase "NomeClasse"Outpu/Input
                        -dtoGateWay "NomeClasse"OutputIntegration/InputIntegration

        Fluxo de camadas:
        
        EntryPoint ------> useCase -----> Gateway   
                                         
      ParaEntryPoint     (Converters)    ParaUseCase
                                         
        EntryPoint <------ useCase
                           
     ----------------------------------------------- Detalhe sobre a integracao do legado --------------------------------------- 
                
                
                
        Como nao foi passado de fato uma Url de servico para ser consultada, irei mockar a integracao do servico, 
        assim os dados desse "sistema legado" serao apresentados normalmente, 
        mesmo assim vou construir o RestTemplate como se fosse fazer de fato a integracao com esse sistema, porem o metodo
        que vou usar vai ser o do mock.
        
                
     --------------------------------------------------------------------------------------------------------------------------- 
                
       Segue o url do endpoint:         
                http://localhost:8080/lancamento/extrato
                
     ---------------------------------------------------------------------------------------------------------------------------
      
      Fiz um swagger de boas praticas tambem...
      http://localhost:8080/swagger-ui.html#/
      
                
                
                
                
                
                
                
                
                

