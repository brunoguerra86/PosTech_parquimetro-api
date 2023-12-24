# Parquímetro API

Este projeto é uma API desenvolvida com Java e Spring Boot, designada para gerenciar um sistema de parquímetros. O projeto foi construído como parte do Tech Challenge para a Pós-Graduação em Arquitetura JAVA. A API oferece uma série de funcionalidades para facilitar o gerenciamento de estacionamentos, incluindo registro de condutores, veículos, e formas de pagamento.

## Funcionalidades Principais

### Registro de Clientes e Veículos

| Verbo | Rota                            | Descrição                    |
|:-----:|:--------------------------------|------------------------------|
| POST  | /clientes                       | 	Cadastra um cliente         |
|  GET  | /clientes/{id_cliente}          | 	Lista um cliente            |
|  GET  | /clientes/{id_cliente}/veiculos | Lista veículos de um cliente |
| POST  | /veiculos	                      | Cadastra um veículo          |


### Controle de Tempo Estacionado 
| Verbo | Rota                                               | Descrição                                              |
|:-----:|:---------------------------------------------------|--------------------------------------------------------|
| POST  | /sessoesestacionamentos                            | Cadastra um cliente                                    |
|  PUT  | /sessoesestacionamentos{id_sessao_estacionamento}  | Atualiza com data fim do período para período variável |
|  GET  | /sessoesestacionamentos{id_sessao_estacionamento}  | Lista informações da sessão de estacionamento          | 


### Registro de Recibo após Pagamento

| Verbo | Rota     | Descrição                            |
|:-----:|:---------|--------------------------------------|
| POST  | /recibos | Cadastra um recibo de estacionamento |          


## Tecnologias Utilizadas

Este projeto foi desenvolvido utilizando:

- Java 17
- MongoDB
- Spring Boot
  - Spring Data MongoDB
  - Spring Web
  - Spring Boot DevTools
  - Lombok para redução de boilerplate em modelos Java

## Como Executar

Instruções detalhadas sobre como configurar e executar o projeto localmente serão fornecidas em breve.

--- (falar do docker, etc)
