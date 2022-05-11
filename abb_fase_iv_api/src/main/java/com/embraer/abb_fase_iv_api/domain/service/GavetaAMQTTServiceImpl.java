package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.AlarmeConsolidado;
import com.embraer.abb_fase_iv_api.domain.model.GavetaAMQTT;
import com.embraer.abb_fase_iv_api.domain.repository.GavetaAMQTTRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GavetaAMQTTServiceImpl implements GavetaAMQTTService{

    private GavetaAMQTTRepository gavetaAMQTTRepository;

    public GavetaAMQTTServiceImpl(GavetaAMQTTRepository gavetaAMQTTRepository) {
        this.gavetaAMQTTRepository = gavetaAMQTTRepository;
    }

    @Override
    public List<GavetaAMQTT> getAll() {
        return null;
    }

    @Override
    public GavetaAMQTT getById(Long id) {
        return null;
    }
}
