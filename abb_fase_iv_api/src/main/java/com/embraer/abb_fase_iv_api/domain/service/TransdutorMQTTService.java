package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.TransdutorMQTT;

import java.util.List;

public interface TransdutorMQTTService {

    List<TransdutorMQTT> getAll();

    TransdutorMQTT getById(Long id);
}
