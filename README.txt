Descri��o do Projeto

Requisitos Funcionais(O que o sistema dever� fazer):

- O sistema dever� ter um Sistema inicial de Login com 1 administrador j� cadastrado, com bot�es para logar, limpar dados.
- Ao entrar com login, o sistema dever� realizar (CRUD) de Usu�rios, Funcion�rios e Clientes.
- O sistema dever� gerenciar vendas com (CRUD)
- Um bot�o para o cliente possa sair do Sistema e voltar para login.

Requisitos n�o funcionais(Restri��es do Sistema):

- Um usu�rio n�o cadastrado n�o poder� acessar o sistema.
- Um Usu�rio dever� ter os seguintes campos
- Nome, CPF, data de nascimento, login e senha, Onde:
	1. N�o poder� ser inserido nenhum Login ou CPF iguais em Usu�rio.
	2. Para que um usu�rio exista, dever� ter pelo menos, nome CPF, login e senha.
	3. Um funcion�rio dever� ter Nome, CPF, data de nascimento e sal�rio, Onde:
		3.1. N�o poder� ser inserido nenhum CPF igual em Funcion�rio.
		3.2. N�o dever� ter sal�rios abaixo de R$ 500,00
		3.3. Para que um funcion�rio exista, dever� ter pelo menos, nome, CPF e sal�rio.
- Um cliente dever� ter : Nome, CPF, Data de Nascimento, Tipo, Onde:
	1. N�o poder� ser inserido nenhum CPF igual em Cliente.
	2. Para que um cliente exista, dever� ter pelo menos, nome, CPF .
- Em vendas dever� ter os seguintes campos:
	1. Uma venda que s� poder� indicar um funcion�rio que est� cadastrado no sistema.
	2. Uma venda que s� poder� indicar um Cliente que est� cadastrado no sistema.
	3. Um valor que dever� ser acima de R$ 0,01 Reais.
- Produto escrito
- Data da Compra

OBS FINAIS:

- Todas as datas do sistema dever�o ser datas v�lidas.
- Todos os CPF dever�o pelo menos 11 d�gitos
- O sistema dever� ter navegabilidade entre todas as funcionalidades.
- O sistema dever� ser feito modularizado com POO.
- No m�todo Main dever� ter apenas uma chamada � uma janela.
- Para qualquer campo digitado que n�o atenda os requisitos n�o funcionais, dever� mostrar uma mensagem de Erro impedindo o processo.
- Voc� poder� usar endere�o de mem�ria ou Banco de dados para manipula��o.