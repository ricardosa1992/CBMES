\set AUTOCOMMIT OFF
BEGIN;
-- -----------------------------------------------------
-- Table Unidade
-- -----------------------------------------------------
DROP TABLE IF EXISTS Unidade CASCADE;
CREATE TABLE IF NOT EXISTS Unidade (
  idUnidade SERIAL NOT NULL ,
  nome VARCHAR(80) ,
  idComandante INT NOT NULL ,
  idSubComandante INT NOT NULL ,
  PRIMARY KEY (idUnidade)  
);

-- -----------------------------------------------------
-- Table Categoria
-- -----------------------------------------------------
DROP TABLE IF EXISTS Categoria CASCADE;
CREATE TABLE IF NOT EXISTS Categoria (
  idCategoria SERIAL NOT NULL ,
  descricao VARCHAR(60) NOT NULL,
  PRIMARY KEY (idCategoria)  
);

-- -----------------------------------------------------
-- Table TipoViatura
-- -----------------------------------------------------
DROP TABLE IF EXISTS TipoViatura CASCADE;
CREATE TABLE IF NOT EXISTS TipoViatura (
  idTipoViatura SERIAL NOT NULL ,
  descricao VARCHAR(45) NOT NULL ,
  PRIMARY KEY (idTipoViatura)  
);

-- -----------------------------------------------------
-- Table Status
-- -----------------------------------------------------
DROP TABLE IF EXISTS Status CASCADE;
CREATE TABLE IF NOT EXISTS Status (
  idStatus SERIAL NOT NULL ,
  descricao VARCHAR(45) NOT NULL ,
  PRIMARY KEY (idStatus)  
);

-- -----------------------------------------------------
-- Table TipoCombustivel
-- -----------------------------------------------------
DROP TABLE IF EXISTS TipoCombustivel CASCADE;
CREATE TABLE IF NOT EXISTS TipoCombustivel (
  idTipoCombustivel SERIAL NOT NULL ,
  descricao VARCHAR(45) NOT NULL ,
  PRIMARY KEY (idTipoCombustivel)  
);

-- -----------------------------------------------------
-- Table SCO
-- -----------------------------------------------------
DROP TABLE IF EXISTS SCO CASCADE;
CREATE TABLE IF NOT EXISTS SCO (
  idSCO SERIAL NOT NULL ,
  nome VARCHAR(80) NOT NULL ,
  dataInicio DATE NOT NULL ,
  dataFim DATE NOT NULL ,
  local VARCHAR(80) NOT NULL ,
  idFuncionarioComando INT ,
  idFuncionarioOperacoes INT ,
  idFuncionarioPlanejamento INT ,
  idFuncionarioLogistica INT ,
  idFuncionarioAdministracao INT ,
  PRIMARY KEY (idSCO)  
);

-- -----------------------------------------------------
-- Table Equipe
-- -----------------------------------------------------
DROP TABLE IF EXISTS Equipe CASCADE;
CREATE TABLE IF NOT EXISTS Equipe (
  idEquipe SERIAL NOT NULL ,
  Descricao VARCHAR(100) NOT NULL ,
  PRIMARY KEY (idEquipe)  ,
  idSCO INT REFERENCES sco(idSCO),
  idUnidade INT REFERENCES Unidade(idUnidade)
);


-- -----------------------------------------------------
-- Table Viatura
-- -----------------------------------------------------
DROP TABLE IF EXISTS Viatura CASCADE;
CREATE TABLE IF NOT EXISTS Viatura (
  idViatura SERIAL NOT NULL ,
  isAlocado BOOLEAN NOT NULL ,
  isCBMES BOOLEAN NOT NULL ,
  prefixo VARCHAR(45) NOT NULL ,
  placa VARCHAR(45) NOT NULL ,
  marca VARCHAR(45) NOT NULL ,
  modelo VARCHAR(45) NOT NULL ,
  ano INT NOT NULL ,
  capAgua INT NOT NULL ,
  capPessoas INT NOT NULL ,
  PRIMARY KEY (idViatura)  ,
  idCategoria int NOT NULL REFERENCES Categoria(idCategoria),
  idTipoViatura int NOT NULL REFERENCES TipoViatura(idTipoViatura),
  idStatus int NOT NULL REFERENCES Status(idStatus),
  idTipoCombustivel int NOT NULL REFERENCES TipoCombustivel(idTipoCombustivel),
  idUnidade INT NOT NULL REFERENCES Unidade(idUnidade),
  idEquipe INT NULL REFERENCES Equipe(idEquipe),
  idSCO INT NULL REFERENCES SCO(idSCO)
);


-- -----------------------------------------------------
-- Table Empenho
-- -----------------------------------------------------
DROP TABLE IF EXISTS Empenho CASCADE;
CREATE TABLE IF NOT EXISTS Empenho (
  idEmpenho SERIAL NOT NULL ,
  descricao VARCHAR(100) NOT NULL ,
  dataInicio DATE NOT NULL ,
  dataFim DATE NOT NULL ,
  PRIMARY KEY (idEmpenho)  ,
  idEquipe INT NOT NULL REFERENCES Equipe(idEquipe)
);


-- -----------------------------------------------------
-- Table Equipamento
-- -----------------------------------------------------
DROP TABLE IF EXISTS Equipamento CASCADE;
CREATE TABLE IF NOT EXISTS Equipamento (
  idEquipamento SERIAL NOT NULL ,
  nome VARCHAR(100) NOT NULL ,
  marca VARCHAR(60) NOT NULL ,
  isAlocado BOOLEAN NOT NULL ,
  PRIMARY KEY (idEquipamento)  ,
  idStatus INT NOT NULL REFERENCES Status(idStatus),
  idUnidade INT NOT NULL REFERENCES Unidade(idUnidade),
  idViatura INT NULL REFERENCES Viatura(idViatura)
);


--######################################################
--######################################################
-- -----------------------------------------------------
-- Table SAFO_funcionario
-- -----------------------------------------------------
DROP TABLE IF EXISTS SAFO_lotacao CASCADE;
CREATE TABLE IF NOT EXISTS SAFO_lotacao (
    idLotacao SERIAL NOT NULL,
    data_ult_alteracao DATE NOT NULL,
    usuario_ult_alteracao VARCHAR(150) NOT NULL,
    versao INT NOT NULL,
    atual VARCHAR(1) NOT NULL,
    data_fim date NOT NULL,
    data_inicio date NOT NULL,
    substituicao VARCHAR(1) NOT NULL,
    funcaoqdi INT NOT NULL,
    funcionario INT NOT NULL,
    local INT NOT NULL,
    primary key (idLotacao)
);


DROP TABLE IF EXISTS SAFO_posto_graducao CASCADE;
CREATE TABLE IF NOT EXISTS SAFO_posto_graducao (
    idPostoGraducao SERIAL NOT NULL,
    data_ult_alteracao date NOT NULL,
    usuario_ult_alteracao VARCHAR(150) NOT NULL,
    versao INT NOT NULL,
    abreviacao VARCHAR(15) NOT NULL,
    descricao VARCHAR(30) NOT NULL,
    numero_ordem VARCHAR(3),
    primary key (idPostoGraducao)
);


DROP TABLE IF EXISTS SAFO_funcionario CASCADE;
CREATE TABLE IF NOT EXISTS SAFO_funcionario (
	idFuncionario SERIAL NOT NULL ,
	data_ult_alteracao date NOT NULL,
	usuario_ult_alteracao VARCHAR(150) NOT NULL,
	versao INT NOT NULL,
	ativo VARCHAR(1),
	celular VARCHAR(100),
	cidade_nascimento VARCHAR(50),
	cpf VARCHAR(14),
	agencia_conta_banco VARCHAR(10),
	banco_conta_banco VARCHAR(10),
	banco_pis_pasep VARCHAR(10),
	conta_conta_banco VARCHAR(10),
	data_pis_pasep date,
	gera_pasep VARCHAR(1),
	numero_pis_pasep VARCHAR(20),
	tipo_pagamento_conta_banco VARCHAR(10),
	data_incorporacao date,
	data_nascimento date,
	categoriacnh VARCHAR(20),
	datactpsidentidadep date,
	data_carteira_profissional date,
	data_emissaocnh date,
	data_expedicao_documentom date,
	data_expedicaorg date,
	numerocnh VARCHAR(20),
	numero_carteira_profissional VARCHAR(20),
	numero_identidade_profissional VARCHAR(20),
	numerorg VARCHAR(9) NOT NULL,
	numero_titulo_eleitor VARCHAR(20),
	orgao_expeditorrg VARCHAR(20),
	secao_titulo_eleitor VARCHAR(10),
	serie_carteira_profissional VARCHAR(10),
	serie_identidade_profissional VARCHAR(10),
	tipo_identidade_profissional VARCHAR(20),
	tiporg VARCHAR(20),
	ufcnh VARCHAR(255),
	uf_carteira_profissional VARCHAR(255),
	uf_identidade_profissional VARCHAR(255),
	ufrg VARCHAR(255),
	uf_titulo_eleitor VARCHAR(255),
	validadecnh date,
	zona_titulo_eleitor VARCHAR(10),
	email VARCHAR(200),
	estado_civil VARCHAR(255),
	fone VARCHAR(100),
	grupo_sanguineo VARCHAR(255),
	ano_primeiro_emprego VARCHAR(4),
	data_censo date,
	data_inatividade date,
	escolaridade VARCHAR(255),
	existe_tempo_averbado VARCHAR(20),
	motivo_inatividade VARCHAR(200),
	uf_emprego_anterior VARCHAR(255),
	nacionalidade VARCHAR(50),
	nome VARCHAR(100) NOT NULL,
	nome_guerra VARCHAR(50),
	nome_mae VARCHAR(200),
	nome_pai VARCHAR(200),
	numero_funcional VARCHAR(20) NOT NULL,
	pais_nascimento VARCHAR(50),
	prontuariohpm VARCHAR(20),
	raca_cor VARCHAR(255),
	sexo VARCHAR(1),
	tipo_cadastro VARCHAR(50),
	uf_nascimento VARCHAR(255),
	posto_graduacao INT,
	PRIMARY KEY (idfuncionario),
	idPostoGraducao INT NOT NULL REFERENCES SAFO_posto_graducao(idPostoGraducao),
	idLotacao INT NOT NULL REFERENCES SAFO_lotacao(idLotacao)
);


--#########################################################
--#########################################################


-- -----------------------------------------------------
-- Table Militar
-- -----------------------------------------------------
DROP TABLE IF EXISTS Militar CASCADE;
CREATE TABLE IF NOT EXISTS Militar (
  idMilitar SERIAL NOT NULL ,
  isAlocado BOOLEAN NOT NULL ,
  PRIMARY KEY (idMilitar)  ,
  idEquipe INT NOT NULL REFERENCES Equipe(idEquipe),
  SAFO_idfuncionario INT NOT NULL REFERENCES SAFO_funcionario(idFuncionario),
  idUnidade INT NOT NULL REFERENCES Unidade(idUnidade)
);


-- -----------------------------------------------------
-- Table Usuario
-- -----------------------------------------------------
DROP TABLE IF EXISTS Usuario CASCADE;
CREATE TABLE IF NOT EXISTS Usuario (
  idUsuario SERIAL NOT NULL ,
  login VARCHAR(50) NOT NULL,
  senha VARCHAR(50) NOT NULL,
  tipo_login INT NOT NULL,
  idmilitar int not null,
  PRIMARY KEY (idUsuario),
  foreign key(idmilitar) references militar(idmilitar)
  
);

DROP TABLE IF EXISTS historicopostomilitar CASCADE;
create table historicopostomilitar (
	id serial not null,
	id_funcionario int not null,
	data_saida date not null,
	id_posto_graduacao int not null

);

COMMIT;
