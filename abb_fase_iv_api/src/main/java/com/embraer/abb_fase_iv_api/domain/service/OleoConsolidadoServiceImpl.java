package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.AlarmeConsolidado;
import com.embraer.abb_fase_iv_api.domain.model.OleoConsolidado;
import com.embraer.abb_fase_iv_api.domain.repository.OleoConsolidadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OleoConsolidadoServiceImpl implements OleoConsolidadoService {

    private OleoConsolidadoRepository oleoConsolidadoRepository;

    public OleoConsolidadoServiceImpl(OleoConsolidadoRepository oleoConsolidadoRepository) {
        this.oleoConsolidadoRepository = oleoConsolidadoRepository;
    }

    @Override
    public List<OleoConsolidado> getAll() {
        return null;
    }

    @Override
    public OleoConsolidado getById(Long id) {
        return null;
    }
}
