\set AUTOCOMMIT OFF
BEGIN;

INSERT INTO public.usuario(login, senha, tipo_login, idmilitar) VALUES ('ricardo', '1234', '1', '10');
INSERT INTO public.usuario(login, senha, tipo_login, idmilitar) VALUES ('tiago', '1234', '1', '12');
INSERT INTO public.usuario(login, senha, tipo_login, idmilitar) VALUES ('heitor', '1234', '2', '13');
INSERT INTO public.usuario(login, senha, tipo_login, idmilitar) VALUES ('thales', '1234', '3', '13');

COMMIT;