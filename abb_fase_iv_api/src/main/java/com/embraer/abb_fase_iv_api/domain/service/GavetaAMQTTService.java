package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.GavetaAMQTT;

import java.util.List;

public interface GavetaAMQTTService {

    List<GavetaAMQTT> getAll();

    GavetaAMQTT getById(Long id);
}
