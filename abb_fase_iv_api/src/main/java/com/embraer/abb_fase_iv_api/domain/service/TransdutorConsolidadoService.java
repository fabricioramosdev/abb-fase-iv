package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.TransdutorConsolidado;

import java.util.List;

public interface TransdutorConsolidadoService {

    List<TransdutorConsolidado> getAll();

    TransdutorConsolidado getById(Long id);
}
