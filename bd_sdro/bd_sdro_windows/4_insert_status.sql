\set AUTOCOMMIT OFF
BEGIN;

INSERT INTO "status" (idStatus,descricao) VALUES (1,'DISPONIVEL'),(2,'ALOCADA'),(3,'EMPRESTADA'),(4,'BAIXADA');

COMMIT;