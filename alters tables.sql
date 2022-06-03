alter table "alarmeConsolidado" rename to "alarme_consolidado";
alter table "alarmeMqtt" rename to "alarme_mqtt";
alter table "cicloConsolidado" rename to "ciclo_consolidado";
alter table "cicloStepConsolidado" rename to "ciclo_step_consolidado";
alter table "gavetaAmqtt" rename to "gaveta_a_mqtt";
alter table "gavetaBmqtt" rename to "gaveta_b_mqtt";
alter table "grupoColeta" rename to "grupo_coleta";
alter table "oleoConsolidado" rename to "oleo_consolidado";
alter table "oleoMqtt" rename to "oleo_mqtt";
alter table "tagColeta" rename to "tag_coleta";
alter table "transdutorConsolidado" rename to "transdutor_consolidado";
alter table "transdutorMqtt" rename to "transdutor_mqtt";

alter table transdutor_consolidado
    alter column gav type char(1);