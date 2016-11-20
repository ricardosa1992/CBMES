\set AUTOCOMMIT OFF
BEGIN;

INSERT INTO "categoria" (idCategoria,descricao) 
VALUES (1,'OPERACIONAL '),
		(2,' ADMINISTRATIVA '),
		(3,' LANCHA '),
		(4,' TRANSPORTE DE PESSOAS '),
		(5,' OUTROS');

COMMIT;