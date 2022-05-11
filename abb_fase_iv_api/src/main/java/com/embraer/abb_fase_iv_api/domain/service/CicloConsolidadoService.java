package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.CicloConsolidado;

import java.util.List;

public interface CicloConsolidadoService {

    List<CicloConsolidado> getAll();

    CicloConsolidado getById(Long id);
}
