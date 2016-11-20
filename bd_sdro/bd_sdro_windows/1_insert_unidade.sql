\set AUTOCOMMIT OFF
BEGIN;

INSERT INTO "unidade" (idUnidade,nome,idComandante,idSubComandante) VALUES (1,'1ª CIA / 1ºBBM',14,113),(2,' 2ª CIA / 1ºBBM',15,94),(3,' 1ª CIA / 2ºBBM',21,98),(4,' 2ª CIA / 2ºBBM',58,95),(5,' 2ª CIA / 2ºBBM - P.A.',37,93),(6,' 1ª CIA / 3ºBBM',40,98),(7,' 2ª CIA / 3ºBBM',32,126),(8,' 1ª CIA / 4ºBBM',11,147),(9,' 2ª CIA / 4ºBBM',52,82),(10,' 1ª CIA / 5ºBBM',49,71);
INSERT INTO "unidade" (idUnidade,nome,idComandante,idSubComandante) VALUES (11,' 2ª CIA / 5ºBBM',57,140),(12,' 1ª CIA / 6ºBBM',9,140),(13,' 2ª CIA / 6ºBBM',37,86),(14,' 1ª CIA IND',28,103),(15,' 2ª CIA IND',46,142),(16,' 3ª CIA IND',13,71),(17,' DOp',33,104),(18,' DepMTR',17,133),(19,' CEIB',31,133);

COMMIT;