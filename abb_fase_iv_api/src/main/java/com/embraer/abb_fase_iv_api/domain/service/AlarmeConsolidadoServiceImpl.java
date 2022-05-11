package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.AlarmeConsolidado;
import com.embraer.abb_fase_iv_api.domain.repository.AlarmeConsolidadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlarmeConsolidadoServiceImpl implements AlarmeConsolidadoService{

    private AlarmeConsolidadoRepository alarmeConsolidadoRepository;

    public AlarmeConsolidadoServiceImpl(AlarmeConsolidadoRepository alarmeConsolidadoRepository) {
        this.alarmeConsolidadoRepository = alarmeConsolidadoRepository;
    }

    @Override
    public List<AlarmeConsolidado> getAll() {
        return null;
    }

    @Override
    public AlarmeConsolidado getById(Long id) {
        return null;
    }
}
