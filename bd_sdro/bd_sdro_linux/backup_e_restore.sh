#!/bin/bash

# Get the system time


now_init=$(date +"%T")
echo "********Inicio Geral: $now_init********"
echo "                                                                                                  "
echo "                                                                                                  "
echo "                                                                                                  "
echo "                                                                                                  "
pg_dump -Ft -U postgres -h localhost -f bkup.backup sdro-testando
echo "                                                                                                  "
echo "                                                                                                  "
echo "Inicio do processo de BackUp: " $now_init
fim=$(date +"%T")
echo "Fim do processo de BackUp: " $fim
echo "                                                                                                  "
echo "                                                                                                  "



now=$(date +"%T")
pg_restore -h localhost -U postgres -d test_bk -v "/home/tiagoassun/Downloads/linux_bd_sdro/bkup.backup"
echo "                                                                                                  "
echo "Inicio do processo de Restore: " $now
fim_geral=$(date +"%T")
echo "Fim do processo de Restore: " $fim_geral
echo "                                                                                                  "
echo "                                                                                                  "



echo "                                                                                                  "
echo "                                                                                                  "
echo "********TEMPOS********"
echo "                                                                                                  "
echo "Inicio Geral: " $now_init
echo "Fim geral: " $fim_geral
