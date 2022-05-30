select * from (select now() as adicionado, now() as alterado, to_timestamp(payload->>'data', 'YYYY-MM-DD HH24:MI:SS')::timestamp WITHOUT
    time ZONE AT time ZONE 'UTC' AS data, cast(payload->>'tps125' as numeric) AS tps125,
                      cast(payload->>'tps170' as numeric)  AS tps170, cast(payload->>'setpointA' as numeric)  AS setpoint_a,
                      cast(payload->>'setpointB' as numeric)  AS setpoint_b, cast(payload->>'uuid' as numeric) AS  uuid,
                      nullif(payload->>'gav','') AS gav
               from public."transdutorMqtt" order by adicionado asc) as q1
where q1.uuid > 0;

insert into "transdutorConsolidado" (adicionado, alterado, data, tps125, tps170, setpointa, setpontb, uuid, gav)
select * from (select now() as adicionado, now() as alterado, to_timestamp(payload->>'data', 'YYYY-MM-DD HH24:MI:SS')::timestamp WITHOUT
    time ZONE AT time ZONE 'UTC' AS data, cast(payload->>'tps125' as numeric) AS tps125,
                      cast(payload->>'tps170' as numeric)  AS tps170, cast(payload->>'setpointA' as numeric)  AS setpoint_a,
                      cast(payload->>'setpointB' as numeric)  AS setpoint_b, cast(payload->>'uuid' as numeric) AS uuid,
                      cast(concat('{' , nullif(payload->>'gav',''), '}') as character varying[]) AS gav
               from public."transdutorMqtt" order by adicionado asc) as q1
where q1.uuid > 0;