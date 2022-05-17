package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.OleoConsolidado;
import com.embraer.abb_fase_iv_api.domain.repository.OleoConsolidadoRepository;
import com.embraer.abb_fase_iv_api.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OleoConsolidadoServiceImpl implements OleoConsolidadoService {

    private final OleoConsolidadoRepository oleoConsolidadoRepository;

    public OleoConsolidadoServiceImpl(OleoConsolidadoRepository oleoConsolidadoRepository) {
        this.oleoConsolidadoRepository = oleoConsolidadoRepository;
    }

    @Override
    public List<OleoConsolidado> getAll() {
        return oleoConsolidadoRepository.findAll();
    }

    @Override
    public OleoConsolidado getById(Long id) {
        return oleoConsolidadoRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Oleo Consolidado não encontrado"));
    }
}
