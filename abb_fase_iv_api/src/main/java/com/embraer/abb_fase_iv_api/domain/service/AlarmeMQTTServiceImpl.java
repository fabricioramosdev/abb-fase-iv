package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.AlarmeMQTT;
import com.embraer.abb_fase_iv_api.domain.repository.AlarmeMQTTRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlarmeMQTTServiceImpl implements AlarmeMQTTService{

    private AlarmeMQTTRepository alarmeMQTTRepository;

    public AlarmeMQTTServiceImpl(AlarmeMQTTRepository alarmeMQTTRepository) {
        this.alarmeMQTTRepository = alarmeMQTTRepository;
    }

    @Override
    public List<AlarmeMQTT> getAll() {
        return null;
    }

    @Override
    public AlarmeMQTT getById(Long id) {
        return null;
    }
}
