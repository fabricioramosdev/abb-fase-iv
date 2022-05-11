package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.CicloStepConsolidado;

import java.util.List;

public interface CicloStepConsolidadoService {

    List<CicloStepConsolidado> getAll();

    CicloStepConsolidado getById(Long id);
}
