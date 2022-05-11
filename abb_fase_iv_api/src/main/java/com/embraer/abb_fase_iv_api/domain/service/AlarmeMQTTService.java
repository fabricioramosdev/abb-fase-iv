package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.AlarmeMQTT;

import java.util.List;

public interface AlarmeMQTTService {

    List<AlarmeMQTT> getAll();

    AlarmeMQTT getById(Long id);
}
