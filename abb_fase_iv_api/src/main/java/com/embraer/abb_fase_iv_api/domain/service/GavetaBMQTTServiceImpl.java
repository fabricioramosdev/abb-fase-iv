package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.GavetaBMQTT;
import com.embraer.abb_fase_iv_api.domain.repository.GavetaBMQTTRepository;
import com.embraer.abb_fase_iv_api.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GavetaBMQTTServiceImpl implements GavetaBMQTTService{

    private final GavetaBMQTTRepository gavetaBMQTTRepository;

    public GavetaBMQTTServiceImpl(GavetaBMQTTRepository gavetaBMQTTRepository) {
        this.gavetaBMQTTRepository = gavetaBMQTTRepository;
    }

    @Override
    public List<GavetaBMQTT> getAll() {
        return gavetaBMQTTRepository.findAll();
    }

    @Override
    public GavetaBMQTT getById(Long id) {
        return gavetaBMQTTRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Log da Gaveta B não encontrada"));
    }
}

