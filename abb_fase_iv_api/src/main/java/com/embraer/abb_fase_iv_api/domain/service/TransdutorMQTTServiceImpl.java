package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.TransdutorMQTT;
import com.embraer.abb_fase_iv_api.domain.repository.TransdutorMQTTRepository;
import com.embraer.abb_fase_iv_api.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransdutorMQTTServiceImpl implements TransdutorMQTTService {

    private final TransdutorMQTTRepository transdutorMQTTRepository;

    public TransdutorMQTTServiceImpl(TransdutorMQTTRepository transdutorMQTTRepository) {
        this.transdutorMQTTRepository = transdutorMQTTRepository;
    }

    @Override
    public List<TransdutorMQTT> getAll() {
        return transdutorMQTTRepository.findAll();
    }

    @Override
    public TransdutorMQTT getById(Long id) {
        return transdutorMQTTRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Transdutor MQTT não encontrado"));
    }
}
