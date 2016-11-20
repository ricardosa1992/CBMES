#!/bin/bash

# Get the system time


now_init=$(date +"%T")
echo "********Inicio Geral: $now_init********"
echo "                                                                                                  "
echo "                                                                                                  "
echo "                                                                                                  "
echo "                                                                                                  "
psql -h localhost -d sdro-testando -U postgres -p 5432 -a -W -f 0_CreateBD.sql
echo "                                                                                                  "
echo "                                                                                                  "
echo "Inicio do processo de criação das tabelas: " $now_init
fim=$(date +"%T")
echo "Fim do processo de criação das tabelas: " $fim
echo "                                                                                                  "
echo "                                                                                                  "



now=$(date +"%T")
psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 1_insert_unidade.sql
echo "                                                                                                  "
echo "Inicio do processo de inserção de unidades: " $now
fim=$(date +"%T")
echo "Fim do processo de inserção de unidades: " $fim
echo "                                                                                                  "
echo "                                                                                                  "



now=$(date +"%T")
psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 2_insert_categoria.sql
echo "                                                                                                  "
echo "Inicio do processo de insercao de categorias: " $now
fim=$(date +"%T")
echo "Fim do processo de insercao de categorias: " $fim
echo "                                                                                                  "
echo "                                                                                                  "



now=$(date +"%T")
psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 3_insert_tipoViatura.sql
echo "                                                                                                  "
echo "Inicio do processo de insercao de tipos de viaturas: " $now
fim=$(date +"%T")
echo "Fim do processo de insercao  de tipos de viaturas: " $fim
echo "                                                                                                  "
echo "                                                                                                  "



now=$(date +"%T")
psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 4_insert_status.sql
echo "                                                                                                  "
echo "Inicio do processo de inserção de status: " $now
fim=$(date +"%T")
echo "Fim do processo de inserção de status: " $fim
echo "                                                                                                  "
echo "                                                                                                  "



now=$(date +"%T")
psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 5_insert_tipoCombustivel.sql
echo "                                                                                                  "
echo "Inicio do processo de inserção de tipos de combustivel: " $now
fim=$(date +"%T")
echo "Fim do processo de inserção de tipos de combustivel: " $fim
echo "                                                                                                  "
echo "                                                                                                  "



now=$(date +"%T")
psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 6_insert_sco.sql
echo "                                                                                                  "
echo "Inicio do processo de inserção de SCO: " $now
fim=$(date +"%T")
echo "Fim do processo de inserção de SCO: " $fim
echo "                                                                                                  "
echo "                                                                                                  "



now=$(date +"%T")
psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 7_insert_equipe.sql
echo "                                                                                                  "
echo "Inicio do processo de inserção de Equipe: " $now
fim=$(date +"%T")
echo "Fim do processo de inserção de Equipe: " $fim
echo "                                                                                                  "
echo "                                                                                                  "



#now=$(date +"%T")
#psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 8_insert_viatura.sql
#echo "                                                                                                  "
#echo "Inicio do processo de inserção de Viatura: " $now
#fim_geral=$(date +"%T")
#echo "Fim do processo de inserção de Viatura: " $fim
#echo "                                                                                                  "
#echo "                                                                                                  "



now=$(date +"%T")
psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 9_insert_safo_lotacao.sql
echo "                                                                                                  "
echo "Inicio do processo de inserção de SAFO_Lotacao: " $now
fim=$(date +"%T")
echo "Fim do processo de inserção de SAFO_Lotacao: " $fim
echo "                                                                                                  "
echo "                                                                                                  "



now=$(date +"%T")
psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 10_insert_safo_posto_graducao.sql
echo "                                                                                                  "
echo "Inicio do processo de inserção de SAFO_Posto_Graducao: " $now
fim=$(date +"%T")
echo "Fim do processo de inserção de SAFO_Posto_Graducao: " $fim
echo "                                                                                                  "
echo "                                                                                                  "



now=$(date +"%T")
psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 11_insert_safo_funcionario.sql
echo "                                                                                                  "
echo "Inicio do processo de inserção de SAFO_Funcionario: " $now
fim=$(date +"%T")
echo "Fim do processo de inserção de SAFO_Funcionario: " $fim
echo "                                                                                                  "
echo "                                                                                                  "



now=$(date +"%T")
psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 12_insert_militar.sql
echo "                                                                                                  "
echo "Inicio do processo de inserção de Militar: " $now
fim=$(date +"%T")
echo "Fim do processo de inserção de Militar: " $fim
echo "                                                                                                  "
echo "                                                                                                  "



now=$(date +"%T")
psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 13_insert_usuario.sql
echo "                                                                                                  "
echo "Inicio do processo de inserção de Usuario: " $now
fim=$(date +"%T")
echo "Fim do processo de inserção de Usuario: " $fim
echo "                                                                                                  "
echo "                                                                                                  "



now=$(date +"%T")
psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 14_script_inserção_um_milhao.sql
echo "                                                                                                  "
echo "Inicio do processo de inserção de ***UM MILHAO DE REGISTROS***: " $now
fim_geral=$(date +"%T")
echo "Fim do processo de inserção de ***UM MILHAO DE REGISTROS***: " $fim_geral
echo "                                                                                                  "
echo "                                                                                                  "



echo "                                                                                                  "
echo "                                                                                                  "
echo "********TEMPOS********"
echo "                                                                                                  "
echo "Inicio Geral: " $now_init
echo "Fim geral: " $fim_geral
