package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.TransdutorConsolidado;
import com.embraer.abb_fase_iv_api.domain.repository.TransdutorConsolidadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransdutorConsolidadoServiceImpl implements TransdutorConsolidadoService {

    private TransdutorConsolidadoRepository transdutorConsolidadoRepository;

    public TransdutorConsolidadoServiceImpl(TransdutorConsolidadoRepository transdutorConsolidadoRepository) {
        this.transdutorConsolidadoRepository = transdutorConsolidadoRepository;
    }

    @Override
    public List<TransdutorConsolidado> getAll() {
        return null;
    }

    @Override
    public TransdutorConsolidado getById(Long id) {
        return null;
    }
}
