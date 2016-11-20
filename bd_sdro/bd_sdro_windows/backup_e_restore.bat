echo "********Inicio Geral********"
echo %time%
set TEMP_INICIO_COMPLETO=%time%
echo "                                                                                                  "
echo "                                                                                                  "
echo "                                                                                                  "
echo "                                                                                                  "
set TEMP_INICIO_BACKUP=%time%
pg_dump -Ft -U postgres -h localhost -f bkup.backup sdro-testando
echo "                                                                                                  "
echo "                                                                                                  "
echo "Inicio do processo de BackUp: " %TEMP_INICIO_BACKUP%
set TEMP_FIM_BACKUP=%time%
echo "Fim do processo de BackUp: " %TEMP_FIM_BACKUP%
echo "                                                                                                  "
echo "                                                                                                  "



set TEMP_INICIO_RESTORE=%time%
pg_restore -h localhost -U postgres -d test_bk -v "/home/tiagoassun/Downloads/linux_bd_sdro/bkup.backup"
echo "                                                                                                  "
echo "Inicio do processo de Restore: " %TEMP_INICIO_RESTORE%
set TEMP_FIM_RESTORE=%time%
echo "Fim do processo de Restore: " %TEMP_FIM_RESTORE%
echo "                                                                                                  "
echo "                                                                                                  "



echo "                                                                                                  "
echo "                                                                                                  "
echo "********TEMPOS********"
echo "                                                                                                  "
echo "Inicio Geral: " %TEMP_INICIO_COMPLETO%
echo "Fim geral: " %time%
