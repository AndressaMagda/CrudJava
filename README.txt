Descrição do Projeto

Requisitos Funcionais(O que o sistema deverá fazer):

- O sistema deverá ter um Sistema inicial de Login com 1 administrador já cadastrado, com botões para logar, limpar dados.
- Ao entrar com login, o sistema deverá realizar (CRUD) de Usuários, Funcionários e Clientes.
- O sistema deverá gerenciar vendas com (CRUD)
- Um botão para o cliente possa sair do Sistema e voltar para login.

Requisitos não funcionais(Restrições do Sistema):

- Um usuário não cadastrado não poderá acessar o sistema.
- Um Usuário deverá ter os seguintes campos
- Nome, CPF, data de nascimento, login e senha, Onde:
	1. Não poderá ser inserido nenhum Login ou CPF iguais em Usuário.
	2. Para que um usuário exista, deverá ter pelo menos, nome CPF, login e senha.
	3. Um funcionário deverá ter Nome, CPF, data de nascimento e salário, Onde:
		3.1. Não poderá ser inserido nenhum CPF igual em Funcionário.
		3.2. Não deverá ter salários abaixo de R$ 500,00
		3.3. Para que um funcionário exista, deverá ter pelo menos, nome, CPF e salário.
- Um cliente deverá ter : Nome, CPF, Data de Nascimento, Tipo, Onde:
	1. Não poderá ser inserido nenhum CPF igual em Cliente.
	2. Para que um cliente exista, deverá ter pelo menos, nome, CPF .
- Em vendas deverá ter os seguintes campos:
	1. Uma venda que só poderá indicar um funcionário que está cadastrado no sistema.
	2. Uma venda que só poderá indicar um Cliente que está cadastrado no sistema.
	3. Um valor que deverá ser acima de R$ 0,01 Reais.
- Produto escrito
- Data da Compra

OBS FINAIS:

- Todas as datas do sistema deverão ser datas válidas.
- Todos os CPF deverão pelo menos 11 dígitos
- O sistema deverá ter navegabilidade entre todas as funcionalidades.
- O sistema deverá ser feito modularizado com POO.
- No método Main deverá ter apenas uma chamada à uma janela.
- Para qualquer campo digitado que não atenda os requisitos não funcionais, deverá mostrar uma mensagem de Erro impedindo o processo.
- Você poderá usar endereço de memória ou Banco de dados para manipulação.