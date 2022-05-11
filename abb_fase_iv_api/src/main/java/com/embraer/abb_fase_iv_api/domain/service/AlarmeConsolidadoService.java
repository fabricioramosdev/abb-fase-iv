package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.AlarmeConsolidado;

import java.util.List;

public interface AlarmeConsolidadoService {

    List<AlarmeConsolidado> getAll();

    AlarmeConsolidado getById(Long id);
}
