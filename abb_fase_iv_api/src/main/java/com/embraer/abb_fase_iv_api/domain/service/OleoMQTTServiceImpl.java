package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.OleoMQTT;
import com.embraer.abb_fase_iv_api.domain.repository.OleoMQTTRepository;
import com.embraer.abb_fase_iv_api.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OleoMQTTServiceImpl implements OleoMQTTService {

    private final OleoMQTTRepository oleoMQTTRepository;

    public OleoMQTTServiceImpl(OleoMQTTRepository oleoMQTTRepository) {
        this.oleoMQTTRepository = oleoMQTTRepository;
    }

    @Override
    public List<OleoMQTT> getAll() {
        return oleoMQTTRepository.findAll();
    }

    @Override
    public OleoMQTT getById(Long id) {
        return oleoMQTTRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Oleo MQTT não encontrado"));
    }
}
