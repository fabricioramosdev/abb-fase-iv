package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.GavetaBMQTT;
import com.embraer.abb_fase_iv_api.domain.repository.GavetaBMQTTRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GavetaBMQTTServiceImpl implements GavetaBMQTTService{

    private GavetaBMQTTRepository gavetaBMQTTRepository;

    public GavetaBMQTTServiceImpl(GavetaBMQTTRepository gavetaBMQTTRepository) {
        this.gavetaBMQTTRepository = gavetaBMQTTRepository;
    }

    @Override
    public List<GavetaBMQTT> getAll() {
        return null;
    }

    @Override
    public GavetaBMQTT getById(Long id) {
        return null;
    }
}

