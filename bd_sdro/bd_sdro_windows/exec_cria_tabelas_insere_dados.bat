echo "********Inicio Geral: $now_init********"
echo %time%
set TEMP_INICIO_COMPLETO=%time%
echo "                                                                                                  "
echo "                                                                                                  "
echo "                                                                                                  "
echo "                                                                                                  "



set TEMP_INICIO_CreateBD=%time%
psql -h localhost -d sdro-testando -U postgres -p 5432 -a -W -f 0_CreateBD.sql
set TEMP_FIM_CreateBD=%time%
echo "                                                                                                  "
echo "Inicio do processo de Criação das Tabelas: " %TEMP_INICIO_CreateBD%
echo "Fim do processo de Criação das Tabelas: " %TEMP_FIM_CreateBD%
echo "                                                                                                  "
echo "                                                                                                  "



set TEMP_INICIO_insert_unidade=%time%
psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 1_insert_unidade.sql
set TEMP_FIM_insert_unidade=%time%
echo "                                                                                                  "
echo "Inicio do processo de inserção de unidades: " %TEMP_INICIO_insert_unidade%
echo "Fim do processo de inserção de unidades: " %TEMP_FIM_insert_unidade%
echo "                                                                                                  "
echo "                                                                                                  "



set TEMP_INICIO_insert_categoria=%time%
psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 2_insert_categoria.sql
set TEMP_FIM_insert_categoria=%time%
echo "                                                                                                  "
echo "Inicio do processo de insercao de categorias: " %TEMP_INICIO_insert_categoria%
echo "Fim do processo de insercao de categorias: " %TEMP_FIM_insert_categoria%
echo "                                                                                                  "
echo "                                                                                                  "



set TEMP_INICIO_insert_tipoViatura=%time%
psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 3_insert_tipoViatura.sql
set TEMP_FIM_insert_tipoViatura=%time%
echo "                                                                                                  "
echo "Inicio do processo de insercao de tipos de viaturas: " %TEMP_INICIO_insert_tipoViatura%
echo "Fim do processo de insercao  de tipos de viaturas: " %TEMP_FIM_insert_tipoViatura%
echo "                                                                                                  "
echo "                                                                                                  "



set TEMP_INICIO_insert_status=%time%
psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 4_insert_status.sql
set TEMP_FIM_insert_status=%time%
echo "                                                                                                  "
echo "Inicio do processo de inserção de status: " %TEMP_INICIO_insert_status%
echo "Fim do processo de inserção de status: " %TEMP_FIM_insert_status%
echo "                                                                                                  "
echo "                                                                                                  "



set TEMP_INICIO_insert_tipoCombustivel=%time%
psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 5_insert_tipoCombustivel.sql
set TEMP_FIM_insert_tipoCombustivel=%time%
echo "                                                                                                  "
echo "Inicio do processo de inserção de tipos de combustivel: " %TEMP_INICIO_insert_tipoCombustivel%
echo "Fim do processo de inserção de tipos de combustivel: " %TEMP_FIM_insert_tipoCombustivel%
echo "                                                                                                  "
echo "                                                                                                  "



set TEMP_INICIO_insert_sco=%time%
psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 6_insert_sco.sql
set TEMP_FIM_insert_sco=%time%
echo "                                                                                                  "
echo "Inicio do processo de inserção de SCO: " %TEMP_INICIO_insert_sco%
echo "Fim do processo de inserção de SCO: " %TEMP_FIM_insert_sco%
echo "                                                                                                  "
echo "                                                                                                  "



set TEMP_INICIO_insert_equipe=%time%
psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 7_insert_equipe.sql
set TEMP_FIM_insert_equipe=%time%
echo "                                                                                                  "
echo "Inicio do processo de inserção de Equipe: " %TEMP_INICIO_insert_equipe%
echo "Fim do processo de inserção de Equipe: " %TEMP_FIM_insert_equipe%
echo "                                                                                                  "
echo "                                                                                                  "



#set TEMP_INICIO_insert_viatura=%time%
#psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 8_insert_viatura.sql
#set TEMP_FIM_insert_viatura=%time%
#echo "                                                                                                  "
#echo "Inicio do processo de inserção de Viatura: " %TEMP_INICIO_insert_viatura%
#echo "Fim do processo de inserção de Viatura: " %TEMP_FIM_insert_viatura%
#echo "                                                                                                  "
#echo "                                                                                                  "



set TEMP_INICIO_insert_safo_lotacao=%time%
psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 9_insert_safo_lotacao.sql
set TEMP_FIM_insert_safo_lotacao=%time%
echo "                                                                                                  "
echo "Inicio do processo de inserção de SAFO_Lotacao: " %TEMP_INICIO_insert_safo_lotacao%
echo "Fim do processo de inserção de SAFO_Lotacao: " %TEMP_FIM_insert_safo_lotacao%
echo "                                                                                                  "
echo "                                                                                                  "



set TEMP_INICIO_insert_safo_posto_graducao=%time%
psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 10_insert_safo_posto_graducao.sql
set TEMP_FIM_insert_safo_posto_graducao=%time%
echo "                                                                                                  "
echo "Inicio do processo de inserção de SAFO_Posto_Graducao: " %TEMP_INICIO_insert_safo_posto_graducao%
echo "Fim do processo de inserção de SAFO_Posto_Graducao: " %TEMP_FIM_insert_safo_posto_graducao%
echo "                                                                                                  "
echo "                                                                                                  "



set TEMP_INICIO_insert_safo_funcionario=%time%
psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 11_insert_safo_funcionario.sql
set TEMP_FIM_insert_safo_funcionario=%time%
echo "                                                                                                  "
echo "Inicio do processo de inserção de SAFO_Funcionario: " %TEMP_INICIO_insert_safo_funcionario%
echo "Fim do processo de inserção de SAFO_Funcionario: " %TEMP_FIM_insert_safo_funcionario%
echo "                                                                                                  "
echo "                                                                                                  "



set TEMP_INICIO_insert_militar=%time%
psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 12_insert_militar.sql
set TEMP_FIM_insert_militar=%time%
echo "                                                                                                  "
echo "Inicio do processo de inserção de Militar: " %TEMP_INICIO_insert_militar%
echo "Fim do processo de inserção de Militar: " %TEMP_FIM_insert_militar%
echo "                                                                                                  "
echo "                                                                                                  "



set TEMP_INICIO_insert_usuario=%time%
psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 13_insert_usuario.sql
set TEMP_FIM_insert_usuario=%time%
echo "                                                                                                  "
echo "Inicio do processo de inserção de Usuario: " %TEMP_INICIO_insert_usuario%
echo "Fim do processo de inserção de Usuario: " %TEMP_FIM_insert_usuario%
echo "                                                                                                  "
echo "                                                                                                  "



set TEMP_INICIO_script_inserção_um_milhao=%time%
psql -h localhost -d sdro-testando -U postgres -p 5432 -q -W -f 14_script_inserção_um_milhao.sql
set TEMP_FIM_script_inserção_um_milhao=%time%
echo "                                                                                                  "
echo "Inicio do processo de inserção de ***UM MILHAO DE REGISTROS***: " %TEMP_INICIO_script_inserção_um_milhao%
echo "Fim do processo de inserção de ***UM MILHAO DE REGISTROS***: " %TEMP_FIM_script_inserção_um_milhao%
echo "                                                                                                  "
echo "                                                                                                  "



echo "                                                                                                  "
echo "                                                                                                  "
echo "********TEMPOS********"
echo "                                                                                                  "
echo "Inicio Geral: " %TEMP_INICIO_COMPLETO%
echo "Fim geral: " %time%
