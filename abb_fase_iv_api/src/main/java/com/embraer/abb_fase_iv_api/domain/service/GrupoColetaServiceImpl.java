package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.AlarmeConsolidado;
import com.embraer.abb_fase_iv_api.domain.model.GrupoColeta;
import com.embraer.abb_fase_iv_api.domain.repository.GrupoColetaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrupoColetaServiceImpl implements GrupoColetaService {

    private GrupoColetaRepository grupoColetaRepository;

    public GrupoColetaServiceImpl(GrupoColetaRepository grupoColetaRepository) {
        this.grupoColetaRepository = grupoColetaRepository;
    }

    @Override
    public List<GrupoColeta> getAll() {
        return null;
    }

    @Override
    public GrupoColeta getById(Long id) {
        return null;
    }
}
