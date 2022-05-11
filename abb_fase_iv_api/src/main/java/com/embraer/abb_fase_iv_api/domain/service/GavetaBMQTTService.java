package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.GavetaBMQTT;

import java.util.List;

public interface GavetaBMQTTService {

    List<GavetaBMQTT> getAll();

    GavetaBMQTT getById(Long id);
}
