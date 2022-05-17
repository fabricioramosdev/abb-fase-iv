package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.GavetaAMQTT;
import com.embraer.abb_fase_iv_api.domain.repository.GavetaAMQTTRepository;
import com.embraer.abb_fase_iv_api.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GavetaAMQTTServiceImpl implements GavetaAMQTTService{

    private final GavetaAMQTTRepository gavetaAMQTTRepository;

    public GavetaAMQTTServiceImpl(GavetaAMQTTRepository gavetaAMQTTRepository) {
        this.gavetaAMQTTRepository = gavetaAMQTTRepository;
    }

    @Override
    public List<GavetaAMQTT> getAll() {
        return gavetaAMQTTRepository.findAll();
    }

    @Override
    public GavetaAMQTT getById(Long id) {
        return gavetaAMQTTRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Log da Gaveta A MQTT não encontrada"));
    }
}
