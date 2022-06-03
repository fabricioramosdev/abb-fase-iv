package com.embraer.abb_fase_iv_api.domain.repository;

import com.embraer.abb_fase_iv_api.domain.model.TransdutorConsolidado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TransdutorConsolidadoRepository extends JpaRepository<TransdutorConsolidado, Long> {

    List<TransdutorConsolidado> findAllByDataBetween(LocalDateTime start, LocalDateTime end);
}
