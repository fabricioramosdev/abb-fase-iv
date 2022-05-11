package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.OleoConsolidado;

import java.util.List;

public interface OleoConsolidadoService {

    List<OleoConsolidado> getAll();

    OleoConsolidado getById(Long id);
}
