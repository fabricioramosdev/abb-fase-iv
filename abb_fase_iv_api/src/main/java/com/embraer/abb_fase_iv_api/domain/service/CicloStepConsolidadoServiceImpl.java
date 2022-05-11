package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.CicloStepConsolidado;
import com.embraer.abb_fase_iv_api.domain.repository.CicloStepConsolidadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CicloStepConsolidadoServiceImpl implements CicloStepConsolidadoService{

    private CicloStepConsolidadoRepository cicloStepConsolidadoRepository;

    public CicloStepConsolidadoServiceImpl(CicloStepConsolidadoRepository cicloStepConsolidadoRepository) {
        this.cicloStepConsolidadoRepository = cicloStepConsolidadoRepository;
    }

    @Override
    public List<CicloStepConsolidado> getAll() {
        return null;
    }

    @Override
    public CicloStepConsolidado getById(Long id) {
        return null;
    }
}
