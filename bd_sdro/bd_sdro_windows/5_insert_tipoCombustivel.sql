\set AUTOCOMMIT OFF
BEGIN;

INSERT INTO "tipocombustivel" (idTipoCombustivel,descricao) 
VALUES (1,'FLEX'),
		(2,' DIESEL'),
		(3,' GASOLINA'),
		(4,' ETANOL '),
		(5,'GASOLINA/GNV '),
		(6,'ETANOL/GNV '),
		(7,'GASOLINA/ETANOL/GNV'),
		(8,' DIESEL S-10');

COMMIT;