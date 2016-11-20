
CREATE OR REPLACE FUNCTION random_string(INTEGER)
RETURNS TEXT AS
$BODY$
SELECT array_to_string(
    ARRAY (
        SELECT substring(
            'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz'
            FROM (ceil(random()*62))::int FOR 1
        )
        FROM generate_series(1, $1)
    ), 
    ''
)
$BODY$
LANGUAGE sql VOLATILE;


-- ##################################################################################################################################################


CREATE or replace FUNCTION insert_viatura() RETURNS void AS $$
BEGIN
	FOR i IN 1..1300000 LOOP
		INSERT INTO public.viatura(isalocado, iscbmes, prefixo, placa, marca, modelo, ano, capagua, cappessoas, idcategoria, idtipoviatura, idstatus, idtipocombustivel, idunidade, idequipe, idsco)
		VALUES (false, false, random_string(4), random_string(5), random_string(10), random_string(10), 1+ round(random() * 2000), 1+ round(random() * 10),1+ round(random() * 8) , 1+ round(random() * 4),1+ round(random() * 19), 1+ round(random() * 3), 1+ round(random() * 7),1+ round(random() * 18), 1+ round(random() * 99), 1+ round(random() * 99));
	END LOOP;
END;
$$ LANGUAGE 'plpgsql';


-- \set AUTOCOMMIT OFF
-- BEGIN;
-- select insert_viatura();
-- COMMIT;


-- ##################################################################################################################################################


CREATE or replace FUNCTION insert_equipamento() RETURNS void AS $$
BEGIN
	FOR i IN 1..1500000 LOOP
		INSERT INTO public.equipamento(nome, marca, isalocado, idstatus, idunidade, idviatura)
		VALUES (random_string(10),random_string(10),false, 1+ round(random() * 3), 1+ round(random() * 18),1 + round(random() * 90000));
	END LOOP;
END;
$$ LANGUAGE 'plpgsql';


\set AUTOCOMMIT OFF
BEGIN;
select insert_viatura();
select insert_equipamento();
COMMIT;