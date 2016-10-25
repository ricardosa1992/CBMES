--
-- PostgreSQL database dump
--

-- Dumped from database version 9.5.4
-- Dumped by pg_dump version 9.5.4

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: categoria; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE categoria (
    idcategoria integer NOT NULL,
    descricao character varying(60) NOT NULL
);


ALTER TABLE categoria OWNER TO postgres;

--
-- Name: categoria_idcategoria_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE categoria_idcategoria_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE categoria_idcategoria_seq OWNER TO postgres;

--
-- Name: categoria_idcategoria_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE categoria_idcategoria_seq OWNED BY categoria.idcategoria;


--
-- Name: empenho; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE empenho (
    idempenho integer NOT NULL,
    descricao character varying(100) NOT NULL,
    datainicio date NOT NULL,
    datafim date NOT NULL,
    idequipe integer NOT NULL
);


ALTER TABLE empenho OWNER TO postgres;

--
-- Name: empenho_idempenho_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE empenho_idempenho_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE empenho_idempenho_seq OWNER TO postgres;

--
-- Name: empenho_idempenho_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE empenho_idempenho_seq OWNED BY empenho.idempenho;


--
-- Name: equipamento; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE equipamento (
    idequipamento integer NOT NULL,
    nome character varying(100) NOT NULL,
    marca character varying(60) NOT NULL,
    isalocado boolean NOT NULL,
    idstatus integer NOT NULL,
    idunidade integer NOT NULL,
    idviatura integer
);


ALTER TABLE equipamento OWNER TO postgres;

--
-- Name: equipamento_idequipamento_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE equipamento_idequipamento_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE equipamento_idequipamento_seq OWNER TO postgres;

--
-- Name: equipamento_idequipamento_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE equipamento_idequipamento_seq OWNED BY equipamento.idequipamento;


--
-- Name: equipe; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE equipe (
    idequipe integer NOT NULL,
    descricao character varying(100) NOT NULL,
    idsco integer,
    idunidade integer
);


ALTER TABLE equipe OWNER TO postgres;

--
-- Name: equipe_idequipe_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE equipe_idequipe_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE equipe_idequipe_seq OWNER TO postgres;

--
-- Name: equipe_idequipe_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE equipe_idequipe_seq OWNED BY equipe.idequipe;


--
-- Name: militar; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE militar (
    idmilitar integer NOT NULL,
    isalocado boolean NOT NULL,
    idequipe integer NOT NULL,
    safo_idfuncionario integer NOT NULL,
    idunidade integer NOT NULL
);


ALTER TABLE militar OWNER TO postgres;

--
-- Name: militar_idmilitar_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE militar_idmilitar_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE militar_idmilitar_seq OWNER TO postgres;

--
-- Name: militar_idmilitar_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE militar_idmilitar_seq OWNED BY militar.idmilitar;


--
-- Name: safo_funcionario; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE safo_funcionario (
    idfuncionario integer NOT NULL,
    data_ult_alteracao date NOT NULL,
    usuario_ult_alteracao character varying(150) NOT NULL,
    versao integer NOT NULL,
    ativo character varying(1),
    celular character varying(100),
    cidade_nascimento character varying(50),
    cpf character varying(14),
    agencia_conta_banco character varying(10),
    banco_conta_banco character varying(10),
    banco_pis_pasep character varying(10),
    conta_conta_banco character varying(10),
    data_pis_pasep date,
    gera_pasep character varying(1),
    numero_pis_pasep character varying(20),
    tipo_pagamento_conta_banco character varying(10),
    data_incorporacao date,
    data_nascimento date,
    categoriacnh character varying(20),
    datactpsidentidadep date,
    data_carteira_profissional date,
    data_emissaocnh date,
    data_expedicao_documentom date,
    data_expedicaorg date,
    numerocnh character varying(20),
    numero_carteira_profissional character varying(20),
    numero_identidade_profissional character varying(20),
    numerorg character varying(9) NOT NULL,
    numero_titulo_eleitor character varying(20),
    orgao_expeditorrg character varying(20),
    secao_titulo_eleitor character varying(10),
    serie_carteira_profissional character varying(10),
    serie_identidade_profissional character varying(10),
    tipo_identidade_profissional character varying(20),
    tiporg character varying(20),
    ufcnh character varying(255),
    uf_carteira_profissional character varying(255),
    uf_identidade_profissional character varying(255),
    ufrg character varying(255),
    uf_titulo_eleitor character varying(255),
    validadecnh date,
    zona_titulo_eleitor character varying(10),
    email character varying(200),
    estado_civil character varying(255),
    fone character varying(100),
    grupo_sanguineo character varying(255),
    ano_primeiro_emprego character varying(4),
    data_censo date,
    data_inatividade date,
    escolaridade character varying(255),
    existe_tempo_averbado character varying(20),
    motivo_inatividade character varying(200),
    uf_emprego_anterior character varying(255),
    nacionalidade character varying(50),
    nome character varying(100) NOT NULL,
    nome_guerra character varying(50),
    nome_mae character varying(200),
    nome_pai character varying(200),
    numero_funcional character varying(20) NOT NULL,
    pais_nascimento character varying(50),
    prontuariohpm character varying(20),
    raca_cor character varying(255),
    sexo character varying(1),
    tipo_cadastro character varying(50),
    uf_nascimento character varying(255),
    posto_graduacao integer,
    idpostograducao integer NOT NULL,
    idlotacao integer NOT NULL
);


ALTER TABLE safo_funcionario OWNER TO postgres;

--
-- Name: safo_funcionario_idfuncionario_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE safo_funcionario_idfuncionario_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE safo_funcionario_idfuncionario_seq OWNER TO postgres;

--
-- Name: safo_funcionario_idfuncionario_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE safo_funcionario_idfuncionario_seq OWNED BY safo_funcionario.idfuncionario;


--
-- Name: safo_lotacao; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE safo_lotacao (
    idlotacao integer NOT NULL,
    data_ult_alteracao date NOT NULL,
    usuario_ult_alteracao character varying(150) NOT NULL,
    versao integer NOT NULL,
    atual character varying(1) NOT NULL,
    data_fim date NOT NULL,
    data_inicio date NOT NULL,
    substituicao character varying(1) NOT NULL,
    funcaoqdi integer NOT NULL,
    funcionario integer NOT NULL,
    local integer NOT NULL
);


ALTER TABLE safo_lotacao OWNER TO postgres;

--
-- Name: safo_lotacao_idlotacao_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE safo_lotacao_idlotacao_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE safo_lotacao_idlotacao_seq OWNER TO postgres;

--
-- Name: safo_lotacao_idlotacao_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE safo_lotacao_idlotacao_seq OWNED BY safo_lotacao.idlotacao;


--
-- Name: safo_posto_graducao; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE safo_posto_graducao (
    idpostograducao integer NOT NULL,
    data_ult_alteracao date NOT NULL,
    usuario_ult_alteracao character varying(150) NOT NULL,
    versao integer NOT NULL,
    abreviacao character varying(15) NOT NULL,
    descricao character varying(30) NOT NULL,
    numero_ordem character varying(3)
);


ALTER TABLE safo_posto_graducao OWNER TO postgres;

--
-- Name: safo_posto_graducao_idpostograducao_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE safo_posto_graducao_idpostograducao_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE safo_posto_graducao_idpostograducao_seq OWNER TO postgres;

--
-- Name: safo_posto_graducao_idpostograducao_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE safo_posto_graducao_idpostograducao_seq OWNED BY safo_posto_graducao.idpostograducao;


--
-- Name: sco; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE sco (
    idsco integer NOT NULL,
    nome character varying(80) NOT NULL,
    datainicio date NOT NULL,
    datafim date NOT NULL,
    local character varying(80) NOT NULL,
    idfuncionariocomando integer,
    idfuncionariooperacoes integer,
    idfuncionarioplanejamento integer,
    idfuncionariologistica integer,
    idfuncionarioadministracao integer
);


ALTER TABLE sco OWNER TO postgres;

--
-- Name: sco_idsco_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE sco_idsco_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE sco_idsco_seq OWNER TO postgres;

--
-- Name: sco_idsco_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE sco_idsco_seq OWNED BY sco.idsco;


--
-- Name: status; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE status (
    idstatus integer NOT NULL,
    descricao character varying(45) NOT NULL
);


ALTER TABLE status OWNER TO postgres;

--
-- Name: status_idstatus_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE status_idstatus_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE status_idstatus_seq OWNER TO postgres;

--
-- Name: status_idstatus_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE status_idstatus_seq OWNED BY status.idstatus;


--
-- Name: tipocombustivel; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tipocombustivel (
    idtipocombustivel integer NOT NULL,
    descricao character varying(45) NOT NULL
);


ALTER TABLE tipocombustivel OWNER TO postgres;

--
-- Name: tipocombustivel_idtipocombustivel_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tipocombustivel_idtipocombustivel_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE tipocombustivel_idtipocombustivel_seq OWNER TO postgres;

--
-- Name: tipocombustivel_idtipocombustivel_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tipocombustivel_idtipocombustivel_seq OWNED BY tipocombustivel.idtipocombustivel;


--
-- Name: tipoviatura; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tipoviatura (
    idtipoviatura integer NOT NULL,
    descricao character varying(45) NOT NULL
);


ALTER TABLE tipoviatura OWNER TO postgres;

--
-- Name: tipoviatura_idtipoviatura_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tipoviatura_idtipoviatura_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE tipoviatura_idtipoviatura_seq OWNER TO postgres;

--
-- Name: tipoviatura_idtipoviatura_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tipoviatura_idtipoviatura_seq OWNED BY tipoviatura.idtipoviatura;


--
-- Name: unidade; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE unidade (
    idunidade integer NOT NULL,
    nome character varying(80),
    idcomandante integer NOT NULL,
    idsubcomandante integer NOT NULL
);


ALTER TABLE unidade OWNER TO postgres;

--
-- Name: unidade_idunidade_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE unidade_idunidade_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE unidade_idunidade_seq OWNER TO postgres;

--
-- Name: unidade_idunidade_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE unidade_idunidade_seq OWNED BY unidade.idunidade;


--
-- Name: viatura; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE viatura (
    idviatura integer NOT NULL,
    isalocado boolean NOT NULL,
    iscbmes boolean NOT NULL,
    prefixo character varying(45) NOT NULL,
    placa character varying(45) NOT NULL,
    marca character varying(45) NOT NULL,
    modelo character varying(45) NOT NULL,
    ano integer NOT NULL,
    capagua integer NOT NULL,
    cappessoas integer NOT NULL,
    idcategoria integer NOT NULL,
    idtipoviatura integer NOT NULL,
    idstatus integer NOT NULL,
    idtipocombustivel integer NOT NULL,
    idunidade integer NOT NULL,
    idequipe integer,
    idsco integer
);


ALTER TABLE viatura OWNER TO postgres;

--
-- Name: viatura_idviatura_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE viatura_idviatura_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE viatura_idviatura_seq OWNER TO postgres;

--
-- Name: viatura_idviatura_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE viatura_idviatura_seq OWNED BY viatura.idviatura;


--
-- Name: idcategoria; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY categoria ALTER COLUMN idcategoria SET DEFAULT nextval('categoria_idcategoria_seq'::regclass);


--
-- Name: idempenho; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY empenho ALTER COLUMN idempenho SET DEFAULT nextval('empenho_idempenho_seq'::regclass);


--
-- Name: idequipamento; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY equipamento ALTER COLUMN idequipamento SET DEFAULT nextval('equipamento_idequipamento_seq'::regclass);


--
-- Name: idequipe; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY equipe ALTER COLUMN idequipe SET DEFAULT nextval('equipe_idequipe_seq'::regclass);


--
-- Name: idmilitar; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY militar ALTER COLUMN idmilitar SET DEFAULT nextval('militar_idmilitar_seq'::regclass);


--
-- Name: idfuncionario; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY safo_funcionario ALTER COLUMN idfuncionario SET DEFAULT nextval('safo_funcionario_idfuncionario_seq'::regclass);


--
-- Name: idlotacao; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY safo_lotacao ALTER COLUMN idlotacao SET DEFAULT nextval('safo_lotacao_idlotacao_seq'::regclass);


--
-- Name: idpostograducao; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY safo_posto_graducao ALTER COLUMN idpostograducao SET DEFAULT nextval('safo_posto_graducao_idpostograducao_seq'::regclass);


--
-- Name: idsco; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY sco ALTER COLUMN idsco SET DEFAULT nextval('sco_idsco_seq'::regclass);


--
-- Name: idstatus; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY status ALTER COLUMN idstatus SET DEFAULT nextval('status_idstatus_seq'::regclass);


--
-- Name: idtipocombustivel; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tipocombustivel ALTER COLUMN idtipocombustivel SET DEFAULT nextval('tipocombustivel_idtipocombustivel_seq'::regclass);


--
-- Name: idtipoviatura; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tipoviatura ALTER COLUMN idtipoviatura SET DEFAULT nextval('tipoviatura_idtipoviatura_seq'::regclass);


--
-- Name: idunidade; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY unidade ALTER COLUMN idunidade SET DEFAULT nextval('unidade_idunidade_seq'::regclass);


--
-- Name: idviatura; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY viatura ALTER COLUMN idviatura SET DEFAULT nextval('viatura_idviatura_seq'::regclass);


--
-- Data for Name: categoria; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY categoria (idcategoria, descricao) FROM stdin;
1	OPERACIONAL 
2	 ADMINISTRATIVA 
3	 LANCHA 
4	 TRANSPORTE DE PESSOAS 
5	 OUTROS
\.


--
-- Name: categoria_idcategoria_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('categoria_idcategoria_seq', 1, false);


--
-- Data for Name: empenho; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY empenho (idempenho, descricao, datainicio, datafim, idequipe) FROM stdin;
\.


--
-- Name: empenho_idempenho_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('empenho_idempenho_seq', 1, false);


--
-- Data for Name: equipamento; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY equipamento (idequipamento, nome, marca, isalocado, idstatus, idunidade, idviatura) FROM stdin;
4	machado	oii	f	1	1	\N
6	Enxada	nao sei	f	1	1	\N
2	MOTA	ASDF	t	1	1	\N
3	rfrs	fvdfsd	t	3	1	\N
5	Alicate	lala	t	1	1	\N
\.


--
-- Name: equipamento_idequipamento_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('equipamento_idequipamento_seq', 6, true);


--
-- Data for Name: equipe; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY equipe (idequipe, descricao, idsco, idunidade) FROM stdin;
1	erat, eget	99	1
2	leo, in	8	2
3	luctus	44	3
4	enim mi	50	4
5	eu odio	14	5
6	luctus	90	6
7	Suspendisse	99	7
8	massa rutrum	52	8
9	Aliquam gravida	56	9
10	sit amet	41	10
11	sapien,	66	11
12	magna	35	12
13	et	49	13
14	magna. Sed	73	14
15	libero est,	15	15
16	tempor,	41	16
17	ligula	11	17
18	ut ipsum	37	18
19	non enim	78	19
20	sit amet	85	1
21	Etiam	79	2
22	sed,	26	3
23	enim,	75	4
24	ac	31	5
25	blandit.	28	6
26	ornare, elit	95	7
27	ante	100	8
28	Vestibulum ante	12	9
29	Phasellus dolor	64	10
30	a,	52	11
31	Maecenas libero	99	12
32	consectetuer	43	13
33	euismod urna.	6	14
34	nonummy. Fusce	30	15
35	ut, nulla.	87	16
36	magna. Ut	18	17
37	sociis	97	18
38	Integer tincidunt	35	19
39	sem, vitae	13	1
40	at arcu.	57	2
41	vel arcu	37	3
42	euismod in,	66	4
43	et nunc.	99	5
44	magna.	82	6
45	amet	62	7
46	lacus.	44	8
47	vel,	82	9
48	ut,	86	10
49	mollis nec,	46	11
50	Nam	53	12
51	Nunc	81	13
52	Praesent luctus.	79	14
53	fringilla	6	15
54	Maecenas iaculis	61	16
55	auctor.	84	17
56	In	87	18
57	non,	31	19
58	et,	93	1
59	Curabitur	22	2
60	interdum	45	3
61	aliquet libero.	8	4
62	neque	60	5
63	tincidunt	47	6
64	lobortis augue	94	7
65	nostra, per	56	8
66	et	46	9
67	eget	97	10
68	eleifend, nunc	50	11
69	faucibus	46	12
70	et	77	13
71	pharetra sed,	87	14
72	diam	18	15
73	luctus	66	16
74	mollis.	76	17
75	eu erat	18	18
76	commodo	13	19
77	Fusce	20	1
78	gravida mauris	13	2
79	fringilla mi	84	3
80	Sed	87	4
81	enim commodo	48	5
82	neque. Nullam	45	6
83	ac mattis	36	7
84	dignissim pharetra.	1	8
85	tristique	70	9
86	Donec	31	10
87	feugiat. Lorem	30	11
88	at	51	12
89	Donec	99	13
90	nonummy ut,	83	14
91	metus	61	15
92	Fusce fermentum	34	16
93	Cras vehicula	78	17
94	dolor	6	18
95	mi tempor	71	19
96	mi eleifend	79	1
97	vulputate,	22	2
98	ante dictum	2	3
99	non,	41	4
100	in felis.	90	5
\.


--
-- Name: equipe_idequipe_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('equipe_idequipe_seq', 1, false);


--
-- Data for Name: militar; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY militar (idmilitar, isalocado, idequipe, safo_idfuncionario, idunidade) FROM stdin;
\.


--
-- Name: militar_idmilitar_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('militar_idmilitar_seq', 1, false);


--
-- Data for Name: safo_funcionario; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY safo_funcionario (idfuncionario, data_ult_alteracao, usuario_ult_alteracao, versao, ativo, celular, cidade_nascimento, cpf, agencia_conta_banco, banco_conta_banco, banco_pis_pasep, conta_conta_banco, data_pis_pasep, gera_pasep, numero_pis_pasep, tipo_pagamento_conta_banco, data_incorporacao, data_nascimento, categoriacnh, datactpsidentidadep, data_carteira_profissional, data_emissaocnh, data_expedicao_documentom, data_expedicaorg, numerocnh, numero_carteira_profissional, numero_identidade_profissional, numerorg, numero_titulo_eleitor, orgao_expeditorrg, secao_titulo_eleitor, serie_carteira_profissional, serie_identidade_profissional, tipo_identidade_profissional, tiporg, ufcnh, uf_carteira_profissional, uf_identidade_profissional, ufrg, uf_titulo_eleitor, validadecnh, zona_titulo_eleitor, email, estado_civil, fone, grupo_sanguineo, ano_primeiro_emprego, data_censo, data_inatividade, escolaridade, existe_tempo_averbado, motivo_inatividade, uf_emprego_anterior, nacionalidade, nome, nome_guerra, nome_mae, nome_pai, numero_funcional, pais_nascimento, prontuariohpm, raca_cor, sexo, tipo_cadastro, uf_nascimento, posto_graduacao, idpostograducao, idlotacao) FROM stdin;
\.


--
-- Name: safo_funcionario_idfuncionario_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('safo_funcionario_idfuncionario_seq', 1, false);


--
-- Data for Name: safo_lotacao; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY safo_lotacao (idlotacao, data_ult_alteracao, usuario_ult_alteracao, versao, atual, data_fim, data_inicio, substituicao, funcaoqdi, funcionario, local) FROM stdin;
\.


--
-- Name: safo_lotacao_idlotacao_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('safo_lotacao_idlotacao_seq', 1, false);


--
-- Data for Name: safo_posto_graducao; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY safo_posto_graducao (idpostograducao, data_ult_alteracao, usuario_ult_alteracao, versao, abreviacao, descricao, numero_ordem) FROM stdin;
\.


--
-- Name: safo_posto_graducao_idpostograducao_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('safo_posto_graducao_idpostograducao_seq', 1, false);


--
-- Data for Name: sco; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY sco (idsco, nome, datainicio, datafim, local, idfuncionariocomando, idfuncionariooperacoes, idfuncionarioplanejamento, idfuncionariologistica, idfuncionarioadministracao) FROM stdin;
1	Nonummy Ac Industries	2016-02-22	2016-09-08	Aachen	19	11	182	169	169
2	Libero Morbi Ltd	2016-01-15	2016-09-07	Lions Bay	103	16	36	53	149
3	A Neque Corporation	2016-02-14	2016-09-22	Corte Brugnatella	49	105	27	147	128
4	Lacus Cras Interdum Ltd	2016-04-18	2016-09-04	Ibadan	4	59	143	34	26
5	Justo Eu Arcu LLC	2016-02-25	2016-10-03	Ham-sur-Sambre	5	131	136	136	199
6	Vitae Diam Limited	2016-06-06	2016-09-16	Gander	82	123	136	145	181
7	Hymenaeos Mauris Foundation	2016-03-14	2016-09-07	Merbes-Sainte-Marie	94	28	131	45	168
8	Duis At LLP	2016-02-04	2016-09-20	Merbes-le-Ch‰teau	178	143	79	29	172
9	Enim Condimentum Limited	2016-07-01	2016-09-05	Prestatyn	169	80	165	77	183
10	Risus Quisque Corporation	2016-06-15	2016-09-15	Gravelbourg	36	150	15	51	39
11	Duis Mi Industries	2016-08-14	2016-09-27	Piscinas	162	95	47	44	89
12	Eu Odio Ltd	2016-08-03	2016-09-11	Sciacca	150	7	162	190	179
13	Arcu Morbi Sit Institute	2016-05-15	2016-09-04	Maubeuge	198	107	72	122	80
14	Risus Incorporated	2016-02-26	2016-09-09	Waitakere	130	142	155	191	17
15	Dapibus Ligula Associates	2016-03-23	2016-10-02	Campobasso	102	136	47	75	35
16	Ipsum Dolor Sit Ltd	2016-03-15	2016-09-16	Ceuta	130	95	114	47	105
17	Amet Foundation	2016-08-22	2016-09-03	Nieuwerkerken	90	99	17	183	64
18	Etiam Inc.	2016-08-27	2016-10-03	Lasne-Chapelle-Saint-Lambert	177	196	138	83	68
19	Lobortis Quam A Corporation	2016-02-21	2016-09-21	Brindisi	62	143	198	90	166
20	Quisque Nonummy Consulting	2016-03-13	2016-09-20	Penicuik	102	193	4	100	101
21	Adipiscing Lacus Ut Corporation	2016-06-26	2016-09-19	Tobermory	173	1	191	115	135
22	Cursus Incorporated	2016-01-11	2016-10-02	Kincardine	149	64	183	86	110
23	Auctor Nunc Industries	2016-07-28	2016-09-25	Opdorp	94	89	20	7	184
24	Rutrum Non Hendrerit Incorporated	2016-06-16	2016-09-24	Bocchigliero	137	29	179	104	149
25	Sed Malesuada Incorporated	2016-07-06	2016-09-14	Piancastagnaio	8	89	151	162	8
26	Nec Tellus Nunc Industries	2016-05-10	2016-09-29	Matera	104	97	74	101	173
27	Nunc Nulla Industries	2016-04-17	2016-09-17	Lowell	142	186	56	4	24
28	Risus Quisque Associates	2016-07-04	2016-09-29	Naumburg	43	190	200	141	10
29	Vel Nisl Institute	2016-08-15	2016-09-13	Vreren	196	53	29	4	143
30	Ac Mattis Velit PC	2016-05-10	2016-09-12	Camerino	24	120	193	91	151
31	Id Magna Et Limited	2016-01-02	2016-10-01	Neumünster	52	195	115	26	43
32	Enim Institute	2016-03-25	2016-09-06	Orlando	161	191	1	12	63
33	Lectus PC	2016-04-04	2016-09-20	Völklingen	4	168	194	10	93
34	Praesent Associates	2016-04-18	2016-09-28	BertrŽe	106	169	26	141	102
35	Fermentum Incorporated	2016-07-26	2016-09-02	Fauglia	127	124	16	84	197
36	Venenatis A Company	2016-06-30	2016-09-21	Zelem	143	78	32	60	126
37	Magnis Company	2016-02-21	2016-09-18	Andalo	8	91	129	63	87
38	Sit Amet Corp.	2016-08-10	2016-09-21	Bay Roberts	131	134	95	100	153
39	Rutrum Urna Limited	2016-03-12	2016-09-25	Salcito	50	66	103	137	175
40	Eu Eleifend Ltd	2016-08-30	2016-09-25	Frankfurt am Main	182	63	25	41	176
41	Proin Ultrices Duis Corp.	2016-05-08	2016-09-27	San Felice a Cancello	166	48	11	102	29
42	Ridiculus Mus Proin Associates	2016-01-26	2016-09-27	Teltow	158	184	15	195	126
43	Quis Institute	2016-06-10	2016-09-18	Castelluccio Superiore	63	158	182	10	81
44	Non Justo Ltd	2016-06-25	2016-09-13	Daiano	126	153	20	123	97
45	Aliquet Vel Institute	2016-06-17	2016-09-27	Le Cannet	12	21	39	149	55
46	Tortor Nunc Commodo Associates	2016-06-06	2016-09-04	Mornimont	100	28	87	168	186
47	Conubia Nostra Ltd	2016-04-10	2016-09-29	Maintal	55	114	126	184	39
48	Amet LLC	2016-01-27	2016-09-18	PiŽtrebais	2	176	137	92	183
49	Eu Consulting	2016-07-17	2016-09-20	Alloa	91	73	190	87	9
50	Interdum LLC	2016-06-30	2016-09-15	Lexington	67	28	154	9	147
51	Nullam Lobortis Quam PC	2016-04-06	2016-09-02	Montresta	100	35	124	99	106
52	Suspendisse Ac Metus Corp.	2016-05-20	2016-09-06	Calder	54	102	199	79	74
53	Adipiscing LLC	2016-05-29	2016-09-29	Rixensart	33	16	82	163	85
54	Ridiculus Associates	2016-05-19	2016-09-24	San Vito Chietino	86	154	77	105	75
55	Sit Associates	2016-02-28	2016-09-08	Hay River	35	120	75	174	31
56	Morbi Limited	2016-01-27	2016-09-21	Bredene	5	36	31	127	162
57	Libero LLC	2016-08-14	2016-09-17	Jambes	54	183	140	31	105
58	Ut Consulting	2016-05-14	2016-09-28	Elmshorn	50	50	133	57	179
59	Lectus Rutrum Urna Corporation	2016-08-23	2016-09-28	Upplands Väsby	82	184	166	152	76
60	Tincidunt Dui Augue Industries	2016-05-16	2016-09-07	Poggio San Marcello	51	23	47	28	52
61	Ac Corporation	2016-04-18	2016-09-02	Coevorden	127	14	157	154	13
62	Proin Industries	2016-07-30	2016-09-25	San Cesario di Lecce	69	83	126	44	74
63	Arcu Vel Quam Limited	2016-07-03	2016-09-09	Albacete	44	190	27	75	164
64	Odio Etiam Foundation	2016-04-17	2016-09-19	Gdynia	36	105	150	29	20
65	At Libero Morbi Incorporated	2016-01-22	2016-09-15	Beauport	45	60	120	47	43
66	Laoreet Ltd	2016-01-09	2016-09-14	Saint-Dizier	124	20	192	30	194
67	Posuere Corporation	2016-01-25	2016-09-29	Fayetteville	30	112	141	155	65
68	Dapibus Quam Corporation	2016-02-16	2016-09-07	Sperlinga	37	45	137	29	44
69	Ad Ltd	2016-03-17	2016-09-20	Shrewsbury	181	60	2	101	133
70	Etiam Ligula Industries	2016-05-04	2016-09-02	Castellina in Chianti	135	134	179	112	166
71	Et Arcu Imperdiet Ltd	2016-03-19	2016-09-03	Selva di Cadore	115	42	106	128	158
72	Proin Foundation	2016-01-04	2016-10-02	Villers-Perwin	91	53	100	183	36
73	Non Lorem Associates	2016-01-10	2016-09-02	Vitrolles	172	197	13	2	198
74	Velit Pellentesque Corporation	2016-04-20	2016-09-03	Jamoigne	161	123	133	110	81
75	Arcu Inc.	2016-01-30	2016-09-14	Camrose	28	116	31	191	122
76	Libero Mauris Institute	2016-01-16	2016-09-26	Washington	118	19	176	97	125
77	Facilisis Consulting	2016-04-14	2016-09-12	Snellegem	167	76	81	105	75
78	Ligula Consectetuer Rhoncus Associates	2016-04-01	2016-10-03	Pastena	56	189	143	77	131
79	Erat LLC	2016-02-11	2016-09-30	Strongoli	195	16	26	142	172
80	Parturient Montes Nascetur Ltd	2016-03-04	2016-09-08	Patarrá	19	13	109	62	199
81	Duis Risus Industries	2016-04-05	2016-09-11	Gualdo Cattaneo	140	184	107	61	117
82	Vitae Incorporated	2016-03-02	2016-09-02	Ancaster Town	28	142	4	31	1
83	Sem Ut Cursus Consulting	2016-08-14	2016-09-22	Kuringen	32	24	115	192	143
84	Consectetuer Limited	2016-05-17	2016-09-19	Welland	45	42	169	83	138
85	Rutrum Urna LLP	2016-07-31	2016-09-21	Linsmeau	22	85	135	116	146
86	Non Ante Bibendum Corporation	2016-04-28	2016-09-07	Groß-Gerau	19	132	176	84	195
87	Cum Sociis Associates	2016-03-13	2016-09-26	Mazy	23	61	151	148	114
88	A Purus Duis Foundation	2016-04-11	2016-09-04	Appelterre-Eichem	148	30	182	118	82
89	Luctus Corporation	2016-07-18	2016-09-23	Lampeter	35	137	110	182	84
90	Fermentum Consulting	2016-01-28	2016-09-06	Detroit	82	100	63	36	58
91	Inceptos Ltd	2016-03-21	2016-10-01	Racine	59	197	46	76	23
92	Nec LLP	2016-03-14	2016-09-14	Valtournenche	57	92	191	198	180
93	Lectus Pede Ltd	2016-06-04	2016-09-20	Bothey	137	40	71	25	129
94	Id Erat Etiam Corporation	2016-03-16	2016-09-10	Abbateggio	196	118	146	164	196
95	Eget Tincidunt Dui Corp.	2016-02-10	2016-09-21	Ferrazzano	29	106	14	48	149
96	Laoreet Associates	2016-08-07	2016-09-06	Obaix	149	56	121	139	86
97	Mauris LLP	2016-05-18	2016-09-13	Vieste	98	43	119	126	167
98	Lacus Pede Sagittis PC	2016-06-17	2016-09-05	Worthing	15	16	122	136	170
99	Proin Limited	2016-02-21	2016-09-29	Bay Roberts	24	81	42	107	85
100	Aliquam Auctor Inc.	2016-07-28	2016-09-22	Schweinfurt	184	140	200	129	138
\.


--
-- Name: sco_idsco_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('sco_idsco_seq', 1, false);


--
-- Data for Name: status; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY status (idstatus, descricao) FROM stdin;
1	DISPONIVEL
2	ALOCADA
3	EMPRESTADA
4	BAIXADA
\.


--
-- Name: status_idstatus_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('status_idstatus_seq', 1, false);


--
-- Data for Name: tipocombustivel; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY tipocombustivel (idtipocombustivel, descricao) FROM stdin;
1	FLEX
2	 DIESEL
3	 GASOLINA
4	 ETANOL 
5	GASOLINA/GNV 
6	ETANOL/GNV 
7	GASOLINA/ETANOL/GNV
8	 DIESEL S-10
\.


--
-- Name: tipocombustivel_idtipocombustivel_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('tipocombustivel_idtipocombustivel_seq', 1, false);


--
-- Data for Name: tipoviatura; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY tipoviatura (idtipoviatura, descricao) FROM stdin;
1	 TRANSPORTE DE PESSOAS
2	 PLATAFORMA
3	 PLATAFORMA
4	 PLATAFORMA
5	 TRANSPORTE DE CARGA
6	 ADMINISTRATIVA
7	 QUADRICICULO
8	 INCENDIO FLORESTAL
9	 QUADRICICULO
10	 TRAILER
11	 TRANSPORTE DE PESSOAS
12	 TRANSPORTE DE PESSOAS
13	ABS
14	 CAES
15	 ADMINISTRATIVA
16	 CHEFE DE OPERACOES CORTE DE ARVORES
17	 PRODUTOS PERIGOSOS
18	 INCENDIO FLORESTAL
19	 CAES
20	 ADMINISTRATIVA
21	 CEPDEC
\.


--
-- Name: tipoviatura_idtipoviatura_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('tipoviatura_idtipoviatura_seq', 1, false);


--
-- Data for Name: unidade; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY unidade (idunidade, nome, idcomandante, idsubcomandante) FROM stdin;
1	1ª CIA / 1ºBBM	14	113
2	 2ª CIA / 1ºBBM	15	94
3	 1ª CIA / 2ºBBM	21	98
4	 2ª CIA / 2ºBBM	58	95
5	 2ª CIA / 2ºBBM - P.A.	37	93
6	 1ª CIA / 3ºBBM	40	98
7	 2ª CIA / 3ºBBM	32	126
8	 1ª CIA / 4ºBBM	11	147
9	 2ª CIA / 4ºBBM	52	82
10	 1ª CIA / 5ºBBM	49	71
11	 2ª CIA / 5ºBBM	57	140
12	 1ª CIA / 6ºBBM	9	140
13	 2ª CIA / 6ºBBM	37	86
14	 1ª CIA IND	28	103
15	 2ª CIA IND	46	142
16	 3ª CIA IND	13	71
17	 DOp	33	104
18	 DepMTR	17	133
19	 CEIB	31	133
\.


--
-- Name: unidade_idunidade_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('unidade_idunidade_seq', 1, false);


--
-- Data for Name: viatura; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY viatura (idviatura, isalocado, iscbmes, prefixo, placa, marca, modelo, ano, capagua, cappessoas, idcategoria, idtipoviatura, idstatus, idtipocombustivel, idunidade, idequipe, idsco) FROM stdin;
1	f	t	KWQ767	XGR1474	 Citroen 	Ligula Ltd	2000	0	17	1	19	1	2	15	19	53
2	f	f	OKE253	LIX1646	 Pegeout 	Nec Malesuada Ut Associates	1970	0	6	1	8	2	3	7	16	25
3	t	t	OHV174	ZNP2361	 Audi 	Augue Ac Associates	1964	0	6	1	3	2	6	4	32	9
4	f	f	JUH156	OYH2496	 Hyundai 	Dictum Augue Malesuada Institute	2001	0	12	2	14	1	3	1	19	50
5	f	f	MTI522	LTO2191	 Volkswagen 	Sit Amet Foundation	1984	0	10	4	4	3	7	4	78	79
6	f	t	FYF461	ZXY5020	 Mitsubitshi 	Porta Inc.	2006	0	22	4	7	2	7	4	50	98
7	t	t	FUM150	JWP2777	 Troller 	Conubia Nostra Corporation	2012	0	24	3	7	3	1	15	50	51
8	t	t	UHV399	ERH3726	Agrale 	Hendrerit Id Ante Incorporated	1956	0	7	1	21	3	1	14	1	91
9	f	t	JNP404	HCS5336	 Volkswagen 	Aliquam Iaculis Lacus Inc.	1983	0	8	1	18	3	6	7	57	100
10	t	t	RKT812	QWW2376	 Ford 	Cursus In Industries	1959	0	14	4	19	1	2	16	91	8
11	t	f	EAC050	FVN8823	 Jeep 	Sed Pharetra Felis Corporation	1960	2000	14	4	21	1	3	18	80	27
12	t	t	TLW320	TYO9093	 Troller 	Vivamus LLP	1970	2000	1	5	4	1	5	2	50	37
13	f	f	MHB789	SHA3095	 Chevrolet 	Nibh Sit Company	1952	0	24	1	13	3	2	14	69	49
14	f	t	LIG712	HZN7889	 Audi 	Non Hendrerit Institute	1959	0	3	5	4	2	4	1	57	68
15	t	t	XCF344	JRJ1938	 Dodge 	Dignissim Maecenas Ornare PC	1985	0	22	2	18	3	3	17	66	10
16	t	t	ALP315	XVO7524	 Mitsubitshi 	Malesuada Malesuada Integer Corporation	1994	0	8	1	14	4	4	6	74	73
17	t	f	DXI879	GFO5489	 Iveco 	Egestas Fusce Aliquet Institute	1978	2000	13	2	10	4	6	6	4	24
18	t	f	QOL082	GUK3505	 Volvo	Donec Industries	2007	0	1	1	11	2	1	15	54	15
19	f	t	CCM246	SYI4302	 Volkswagen 	Magnis Dis Parturient Industries	1965	0	7	1	21	2	7	19	25	16
20	t	t	ZLR943	BSY4831	 Audi 	Nunc Ac Inc.	2011	10000	1	5	16	4	4	12	74	72
21	t	t	HHN336	JEF7328	 Yamaha 	Natoque Penatibus Et Institute	1984	0	2	3	6	4	8	19	17	34
22	t	f	JPT803	YVA5630	 Iveco 	Quam LLC	1957	0	3	2	5	3	4	11	62	60
23	t	f	ZCY431	KMP2137	 Honda 	Nisl Sem Company	1984	0	21	1	9	1	3	18	51	47
24	t	t	VQE050	XZI2404	 Jeep 	Lectus Quis Corp.	1992	0	16	2	13	4	2	17	43	14
25	f	t	DTZ833	LYK5013	 Nissan 	Quisque Ac Corp.	1982	0	2	2	7	1	7	7	17	42
26	f	t	HAC892	GOG8352	 Mahindra 	Dolor Associates	2012	0	7	4	3	3	2	11	22	47
27	t	f	MMA245	FKI1005	 Jeep 	Justo Faucibus Lectus Industries	1957	0	14	5	9	3	4	6	22	59
28	t	f	MYJ981	IQV8909	 Jeep 	Quis Pede Suspendisse Consulting	1987	0	6	5	12	2	1	19	85	70
29	t	f	IBZ377	WVZ5960	 Kia 	Id Associates	2002	0	9	4	16	2	6	15	6	7
30	f	t	XKS929	QRJ9892	 Toyota 	Sem Corp.	1962	2000	23	4	4	3	7	18	98	22
31	t	t	ZFJ661	KOW0340	 Troller 	Dui Nec Tempus Foundation	2007	0	3	5	12	3	8	10	43	52
32	f	f	HHP237	IIB2841	 Honda 	Pellentesque Tincidunt Tempus LLP	1958	0	25	5	15	3	2	4	49	99
33	t	f	GHY060	QQL0936	 Yamaha 	Nisl PC	1964	0	12	2	16	4	6	12	69	32
34	f	f	LIH023	QRI7138	 Chevrolet 	Enim Suspendisse Institute	1971	0	5	3	2	1	4	8	43	53
35	f	f	ZLL853	NAY4396	 Pegeout 	Facilisis Inc.	1966	0	2	1	5	1	3	15	17	20
36	t	t	GOT107	MPS6833	 Dodge 	Cursus Incorporated	2002	0	22	2	11	1	1	13	21	23
37	t	t	KEU892	URD6350	 Ford 	Magna Inc.	2003	0	17	4	18	4	6	17	28	14
38	f	f	EUW129	OYG9123	 Citroen 	Dolor Nulla Semper Consulting	1992	0	6	5	15	2	2	17	14	40
39	t	t	UJM031	FIN1348	 Hyundai 	Nec Ante Blandit Consulting	2016	0	14	4	19	4	3	12	23	59
40	f	t	DAE533	TWG1614	 Yamaha 	Ligula LLC	2000	500	2	5	7	2	8	7	62	61
41	f	f	CPC901	LLX0391	Agrale 	Nulla Incorporated	1982	0	25	5	13	4	2	1	64	100
42	f	f	TZM789	NZN1761	 Troller 	Sem Egestas Blandit Institute	2017	0	3	2	2	4	4	1	3	54
43	t	t	KLE341	YZK7031	 Toyota 	Dolor Quam Elementum Ltd	1951	0	19	3	1	3	4	3	41	23
44	t	f	RTD420	JUG4712	 Toyota 	Luctus Ltd	1953	2000	14	4	7	3	2	8	15	27
45	f	f	RCL099	SJK0153	 Suzuki 	Magna LLC	1988	2000	7	4	18	1	6	16	21	13
46	f	t	ESU011	EPP8059	 Jeep 	Ut Corp.	1995	10000	1	5	21	4	5	11	70	95
47	f	t	CBR039	BRH9453	 Fiat 	Purus Limited	2002	0	19	1	4	2	6	15	17	83
48	t	t	QXI174	ESC4510	 Nissan 	Posuere At LLP	1961	2000	12	3	19	2	4	16	13	81
49	t	f	ZFM469	KUL7707	 Audi 	Augue Ut Ltd	1980	0	3	3	12	4	8	16	77	82
50	t	f	ZNN270	TBY5236	 Kia 	Aliquam Arcu Corp.	1981	0	11	3	8	4	1	11	66	85
51	f	f	MLM376	ZQZ1507	 Honda 	Lacinia LLP	2013	0	24	2	18	1	8	7	29	33
52	t	f	LKL234	YUL8014	 Honda 	Scelerisque Dui Suspendisse Inc.	1972	0	14	2	14	2	1	17	13	24
53	t	t	WND352	TAC9605	 Suzuki 	Nulla Eu Neque Consulting	1998	0	10	3	6	3	6	15	11	85
54	f	f	QKP388	VWH1861	 Volvo	Nonummy Corporation	1987	0	22	5	1	1	4	9	56	66
55	t	f	EZH771	GAR9715	 Ford 	Quis Tristique Ac Incorporated	1982	10000	3	2	15	3	2	8	33	91
56	t	t	YBN657	HDD1792	 Dodge 	Amet Consectetuer Foundation	2011	0	5	5	14	4	6	11	66	4
57	t	f	DMJ242	TFK2161	 Ford 	Purus In Molestie Ltd	1978	0	5	3	13	2	2	5	48	67
58	f	t	UXJ775	MXU9497	 Chevrolet 	Duis Dignissim Tempor Limited	1995	2000	14	4	2	3	3	4	91	65
59	t	f	YVA133	SZD9952	 Audi 	Ac Industries	1989	0	13	4	18	2	1	5	46	90
60	f	f	UIA410	XEL5230	 Nissan 	In Ltd	1963	10000	1	4	15	1	1	3	71	53
61	f	f	XSP696	NJY6547	 Honda 	Ornare Tortor LLC	1961	10000	11	1	13	3	8	5	36	34
62	t	f	PVS186	URP4992	 Toyota 	Ut Sagittis Corporation	2013	0	15	2	7	4	5	18	34	77
63	f	t	CYZ375	MZL6474	 Yamaha 	Pharetra Nibh LLP	1975	0	7	3	14	1	2	12	11	85
64	f	t	RIV210	WPQ1838	 Audi 	Orci Donec Nibh LLP	1995	0	21	4	6	3	8	17	69	83
65	t	t	ZQU183	AMR5248	 Jeep 	Pellentesque Corp.	1965	0	22	1	11	4	3	7	8	38
66	f	f	PBL363	XGO3319	 Chevrolet 	Lacus Varius Consulting	1979	0	7	4	2	3	8	4	95	44
67	f	t	MZA194	FJC8902	 Mahindra 	Nec Luctus Felis LLC	1992	0	21	5	18	1	8	11	7	20
68	f	f	PIH535	MTQ2547	 Toyota 	Fusce Foundation	2016	0	2	3	20	2	6	12	5	88
69	f	f	RZH629	YNT5402	 Toyota 	Congue Elit Sed Incorporated	2017	0	5	2	15	4	6	11	29	86
70	t	f	LNY695	BPV8277	 Audi 	Dui Fusce Aliquam Corp.	1974	0	10	5	7	4	5	8	8	10
71	t	f	FXM319	FNQ7648	 Fiat 	Auctor Velit Aliquam Corp.	2004	0	1	4	5	1	1	6	79	85
72	f	t	GLL359	EXC6410	 Chevrolet 	Elementum Dui Consulting	1992	0	13	5	21	4	3	12	42	70
73	t	t	LKQ611	MUX9269	 Mahindra 	Magna Phasellus Foundation	1974	0	2	4	12	4	4	2	35	79
74	f	t	VHF003	YPI3253	 Troller 	Sit Amet Massa Limited	1964	0	17	4	9	1	4	12	77	45
75	f	f	DIZ643	NBB5921	 Kia 	Dolor Sit Corporation	2004	0	8	1	15	3	4	7	92	32
76	f	f	LFW018	KEW5809	 Mahindra 	Lorem Tristique Aliquet Incorporated	1961	0	25	1	16	3	5	1	37	78
77	t	t	HQQ788	BRZ8834	 Mahindra 	Class Aptent LLC	1959	10000	16	3	2	1	4	8	60	76
78	t	t	VSM015	YJG9092	 Hyundai 	Ornare Sagittis LLC	1958	500	20	2	16	1	4	11	99	48
79	f	t	IFQ358	WIS5849	 Fiat 	Diam Institute	1962	0	12	5	5	3	1	2	13	79
80	f	f	JRK475	MBK0703	 Jeep 	Per Inceptos Hymenaeos Corporation	1990	0	5	2	19	4	6	18	61	23
81	f	t	CIL212	AIJ7070	 Kia 	Enim Company	1957	0	4	4	15	1	5	17	67	99
82	f	t	RIN070	LXB2157	Agrale 	Sed Diam Lorem Consulting	1998	0	1	2	16	4	8	2	7	100
83	t	t	APQ960	RGT1597	 Kia 	Lobortis Corporation	1994	0	11	5	18	3	6	4	14	37
84	f	f	WXG642	AXY2146	 Chevrolet 	Tellus Consulting	2012	0	10	3	16	4	5	1	58	48
85	t	f	ZEM624	VQA0390	 Fiat 	Amet Luctus Foundation	1957	10000	10	5	15	4	7	4	81	30
86	t	f	OCT994	OFN8437	 Nissan 	Aliquet Phasellus Fermentum LLC	1991	0	21	2	14	4	6	17	99	99
87	t	t	BWN360	IMO5357	 Jeep 	Amet LLP	2014	0	9	2	1	1	2	14	55	9
88	t	t	IET120	HKA7772	Agrale 	Odio PC	1994	0	14	3	14	4	8	5	26	50
89	f	t	BHW753	PVU8638	 Nissan 	Libero At Auctor Institute	1969	0	13	3	19	3	8	7	35	7
90	f	t	FIZ458	CER5531	 Dodge 	Dolor Ltd	1981	2000	13	3	6	1	6	19	50	42
91	f	f	BRC359	OVI0103	 Dodge 	Magna Limited	1959	0	1	3	19	2	5	13	24	24
92	t	t	CNH200	GCU1548	 Dodge 	Mattis Incorporated	2007	0	2	3	15	1	8	19	34	67
93	f	t	NPP423	QSQ3749	 Pegeout 	Donec Egestas Duis Foundation	1961	0	21	1	13	2	8	13	59	43
94	f	t	KCW122	EEJ3566	Agrale 	Faucibus Inc.	1962	0	13	4	9	3	1	6	74	7
95	t	f	XGA855	DTO9256	 Pegeout 	Magna Inc.	2014	0	15	5	7	3	4	14	10	59
96	f	f	XEO860	ADL6742	 Troller 	Nulla Inc.	2001	0	7	2	6	1	4	15	22	87
97	t	f	GHI738	KBL1864	 Kia 	Suscipit Nonummy Corporation	2001	0	4	3	8	3	3	2	53	71
98	f	t	BDC987	LMU8687	 Pegeout 	Penatibus Et Magnis Ltd	1998	0	2	3	20	3	8	2	71	92
99	t	f	DHD786	IOQ8323	 Honda 	Sed Pede Cum Associates	2013	10000	21	4	9	2	7	14	49	35
100	t	f	AWG346	KCX7090	 Volkswagen 	Cras Eget Nisi Company	1972	0	6	2	13	4	8	12	61	67
101	t	f	EAC050	FVN8823	 Jeep 	Sed Pharetra Felis Corporation	1960	2000	14	4	21	1	3	18	80	27
102	f	f	fbdf	fbdf	fvbdfv	vdv	12	23	12	1	12	1	1	1	\N	\N
103	f	f	lala	ms0182	Uno	Fiat	2016	0	12	1	12	1	3	1	\N	\N
\.


--
-- Name: viatura_idviatura_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('viatura_idviatura_seq', 103, true);


--
-- Name: categoria_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY categoria
    ADD CONSTRAINT categoria_pkey PRIMARY KEY (idcategoria);


--
-- Name: empenho_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY empenho
    ADD CONSTRAINT empenho_pkey PRIMARY KEY (idempenho);


--
-- Name: equipamento_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY equipamento
    ADD CONSTRAINT equipamento_pkey PRIMARY KEY (idequipamento);


--
-- Name: equipe_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY equipe
    ADD CONSTRAINT equipe_pkey PRIMARY KEY (idequipe);


--
-- Name: militar_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY militar
    ADD CONSTRAINT militar_pkey PRIMARY KEY (idmilitar);


--
-- Name: safo_funcionario_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY safo_funcionario
    ADD CONSTRAINT safo_funcionario_pkey PRIMARY KEY (idfuncionario);


--
-- Name: safo_lotacao_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY safo_lotacao
    ADD CONSTRAINT safo_lotacao_pkey PRIMARY KEY (idlotacao);


--
-- Name: safo_posto_graducao_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY safo_posto_graducao
    ADD CONSTRAINT safo_posto_graducao_pkey PRIMARY KEY (idpostograducao);


--
-- Name: sco_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY sco
    ADD CONSTRAINT sco_pkey PRIMARY KEY (idsco);


--
-- Name: status_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY status
    ADD CONSTRAINT status_pkey PRIMARY KEY (idstatus);


--
-- Name: tipocombustivel_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tipocombustivel
    ADD CONSTRAINT tipocombustivel_pkey PRIMARY KEY (idtipocombustivel);


--
-- Name: tipoviatura_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tipoviatura
    ADD CONSTRAINT tipoviatura_pkey PRIMARY KEY (idtipoviatura);


--
-- Name: unidade_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY unidade
    ADD CONSTRAINT unidade_pkey PRIMARY KEY (idunidade);


--
-- Name: viatura_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY viatura
    ADD CONSTRAINT viatura_pkey PRIMARY KEY (idviatura);


--
-- Name: empenho_idequipe_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY empenho
    ADD CONSTRAINT empenho_idequipe_fkey FOREIGN KEY (idequipe) REFERENCES equipe(idequipe);


--
-- Name: equipamento_idstatus_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY equipamento
    ADD CONSTRAINT equipamento_idstatus_fkey FOREIGN KEY (idstatus) REFERENCES status(idstatus);


--
-- Name: equipamento_idunidade_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY equipamento
    ADD CONSTRAINT equipamento_idunidade_fkey FOREIGN KEY (idunidade) REFERENCES unidade(idunidade);


--
-- Name: equipamento_idviatura_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY equipamento
    ADD CONSTRAINT equipamento_idviatura_fkey FOREIGN KEY (idviatura) REFERENCES viatura(idviatura);


--
-- Name: equipe_idsco_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY equipe
    ADD CONSTRAINT equipe_idsco_fkey FOREIGN KEY (idsco) REFERENCES sco(idsco);


--
-- Name: equipe_idunidade_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY equipe
    ADD CONSTRAINT equipe_idunidade_fkey FOREIGN KEY (idunidade) REFERENCES unidade(idunidade);


--
-- Name: militar_idequipe_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY militar
    ADD CONSTRAINT militar_idequipe_fkey FOREIGN KEY (idequipe) REFERENCES equipe(idequipe);


--
-- Name: militar_idunidade_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY militar
    ADD CONSTRAINT militar_idunidade_fkey FOREIGN KEY (idunidade) REFERENCES unidade(idunidade);


--
-- Name: militar_safo_idfuncionario_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY militar
    ADD CONSTRAINT militar_safo_idfuncionario_fkey FOREIGN KEY (safo_idfuncionario) REFERENCES safo_funcionario(idfuncionario);


--
-- Name: safo_funcionario_idlotacao_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY safo_funcionario
    ADD CONSTRAINT safo_funcionario_idlotacao_fkey FOREIGN KEY (idlotacao) REFERENCES safo_lotacao(idlotacao);


--
-- Name: safo_funcionario_idpostograducao_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY safo_funcionario
    ADD CONSTRAINT safo_funcionario_idpostograducao_fkey FOREIGN KEY (idpostograducao) REFERENCES safo_posto_graducao(idpostograducao);


--
-- Name: viatura_idcategoria_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY viatura
    ADD CONSTRAINT viatura_idcategoria_fkey FOREIGN KEY (idcategoria) REFERENCES categoria(idcategoria);


--
-- Name: viatura_idequipe_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY viatura
    ADD CONSTRAINT viatura_idequipe_fkey FOREIGN KEY (idequipe) REFERENCES equipe(idequipe);


--
-- Name: viatura_idsco_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY viatura
    ADD CONSTRAINT viatura_idsco_fkey FOREIGN KEY (idsco) REFERENCES sco(idsco);


--
-- Name: viatura_idstatus_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY viatura
    ADD CONSTRAINT viatura_idstatus_fkey FOREIGN KEY (idstatus) REFERENCES status(idstatus);


--
-- Name: viatura_idtipocombustivel_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY viatura
    ADD CONSTRAINT viatura_idtipocombustivel_fkey FOREIGN KEY (idtipocombustivel) REFERENCES tipocombustivel(idtipocombustivel);


--
-- Name: viatura_idtipoviatura_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY viatura
    ADD CONSTRAINT viatura_idtipoviatura_fkey FOREIGN KEY (idtipoviatura) REFERENCES tipoviatura(idtipoviatura);


--
-- Name: viatura_idunidade_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY viatura
    ADD CONSTRAINT viatura_idunidade_fkey FOREIGN KEY (idunidade) REFERENCES unidade(idunidade);


--
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


--
-- PostgreSQL database dump complete
--

