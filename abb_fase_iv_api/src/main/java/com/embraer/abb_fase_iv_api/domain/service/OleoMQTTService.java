package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.OleoMQTT;

import java.util.List;

public interface OleoMQTTService {

    List<OleoMQTT> getAll();

    OleoMQTT getById(Long id);
}
