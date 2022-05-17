package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.CicloConsolidado;
import com.embraer.abb_fase_iv_api.domain.repository.CicloConsolidadoRepository;
import com.embraer.abb_fase_iv_api.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CicloConsolidadoServiceImpl implements CicloConsolidadoService{

    private final CicloConsolidadoRepository cicloConsolidadoRepository;

    public CicloConsolidadoServiceImpl(CicloConsolidadoRepository cicloConsolidadoRepository) {
        this.cicloConsolidadoRepository = cicloConsolidadoRepository;
    }

    @Override
    public List<CicloConsolidado> getAll() {
        return cicloConsolidadoRepository.findAll();
    }

    @Override
    public CicloConsolidado getById(Long id) {
        return cicloConsolidadoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Ciclo Consolidado não encontrado"));
    }
}
