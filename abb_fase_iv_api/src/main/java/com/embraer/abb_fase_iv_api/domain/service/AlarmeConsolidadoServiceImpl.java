package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.AlarmeConsolidado;
import com.embraer.abb_fase_iv_api.domain.repository.AlarmeConsolidadoRepository;
import com.embraer.abb_fase_iv_api.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlarmeConsolidadoServiceImpl implements AlarmeConsolidadoService{

    private final AlarmeConsolidadoRepository alarmeConsolidadoRepository;

    public AlarmeConsolidadoServiceImpl(AlarmeConsolidadoRepository alarmeConsolidadoRepository) {
        this.alarmeConsolidadoRepository = alarmeConsolidadoRepository;
    }

    @Override
    public List<AlarmeConsolidado> getAll() {
        return alarmeConsolidadoRepository.findAll();
    }

    @Override
    public AlarmeConsolidado getById(Long id) {
        return alarmeConsolidadoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Alarme Consolidado não encontrado."));
    }
}
