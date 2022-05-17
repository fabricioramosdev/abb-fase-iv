package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.CicloStepConsolidado;
import com.embraer.abb_fase_iv_api.domain.repository.CicloStepConsolidadoRepository;
import com.embraer.abb_fase_iv_api.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CicloStepConsolidadoServiceImpl implements CicloStepConsolidadoService{

    private final CicloStepConsolidadoRepository cicloStepConsolidadoRepository;

    public CicloStepConsolidadoServiceImpl(CicloStepConsolidadoRepository cicloStepConsolidadoRepository) {
        this.cicloStepConsolidadoRepository = cicloStepConsolidadoRepository;
    }

    @Override
    public List<CicloStepConsolidado> getAll() {
        return cicloStepConsolidadoRepository.findAll();
    }

    @Override
    public CicloStepConsolidado getById(Long id) {
        return cicloStepConsolidadoRepository.findById(id)
                .orElseThrow( () -> new ResourceNotFoundException("Ciclo consolidado não encontrado"));
    }
}
