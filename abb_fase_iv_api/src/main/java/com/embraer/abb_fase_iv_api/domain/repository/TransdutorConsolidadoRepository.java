package com.embraer.abb_fase_iv_api.domain.repository;

import com.embraer.abb_fase_iv_api.domain.model.TransdutorConsolidado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TransdutorConsolidadoRepository extends JpaRepository<TransdutorConsolidado, Long> {

    @Query(nativeQuery = true, value =
            "select * from \"transdutorConsolidado\" where data between '2022-05-01 00:00:00' and '2022-05-31 00:00:00';")
    List<TransdutorConsolidado> findAllByDataBetween(LocalDateTime start, LocalDateTime end);
}
