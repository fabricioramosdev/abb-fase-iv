package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.AlarmeConsolidado;
import com.embraer.abb_fase_iv_api.domain.model.CicloConsolidado;
import com.embraer.abb_fase_iv_api.domain.repository.CicloConsolidadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CicloConsolidadoServiceImpl implements CicloConsolidadoService{

    private CicloConsolidadoRepository cicloConsolidadoRepository;

    public CicloConsolidadoServiceImpl(CicloConsolidadoRepository cicloConsolidadoRepository) {
        this.cicloConsolidadoRepository = cicloConsolidadoRepository;
    }

    @Override
    public List<CicloConsolidado> getAll() {
        return null;
    }

    @Override
    public CicloConsolidado getById(Long id) {
        return null;
    }
}
