package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.AlarmeMQTT;
import com.embraer.abb_fase_iv_api.domain.repository.AlarmeMQTTRepository;
import com.embraer.abb_fase_iv_api.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlarmeMQTTServiceImpl implements AlarmeMQTTService{

    private final AlarmeMQTTRepository alarmeMQTTRepository;

    public AlarmeMQTTServiceImpl(AlarmeMQTTRepository alarmeMQTTRepository) {
        this.alarmeMQTTRepository = alarmeMQTTRepository;
    }

    @Override
    public List<AlarmeMQTT> getAll() {
        return alarmeMQTTRepository.findAll();
    }

    @Override
    public AlarmeMQTT getById(Long id) {
        return alarmeMQTTRepository.findById(id)
                .orElseThrow( () -> new ResourceNotFoundException("Alarme MQTT não encontrado"));
    }
}
