package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.GrupoColeta;
import com.embraer.abb_fase_iv_api.domain.repository.GrupoColetaRepository;
import com.embraer.abb_fase_iv_api.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrupoColetaServiceImpl implements GrupoColetaService {

    private final GrupoColetaRepository grupoColetaRepository;

    public GrupoColetaServiceImpl(GrupoColetaRepository grupoColetaRepository) {
        this.grupoColetaRepository = grupoColetaRepository;
    }

    @Override
    public List<GrupoColeta> getAll() {
        return grupoColetaRepository.findAll();
    }

    @Override
    public GrupoColeta getById(Long id) {
        return grupoColetaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Grupo Coleta não encontrado"));
    }
}
