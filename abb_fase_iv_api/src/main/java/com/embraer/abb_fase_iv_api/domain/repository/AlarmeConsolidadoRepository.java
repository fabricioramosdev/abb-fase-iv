package com.embraer.abb_fase_iv_api.domain.repository;

import com.embraer.abb_fase_iv_api.domain.model.AlarmeConsolidado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlarmeConsolidadoRepository extends JpaRepository<AlarmeConsolidado, Long> {
}
