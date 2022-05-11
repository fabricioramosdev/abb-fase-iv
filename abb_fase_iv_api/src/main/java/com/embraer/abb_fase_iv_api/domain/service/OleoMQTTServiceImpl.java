package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.AlarmeConsolidado;
import com.embraer.abb_fase_iv_api.domain.model.OleoMQTT;
import com.embraer.abb_fase_iv_api.domain.repository.OleoMQTTRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OleoMQTTServiceImpl implements OleoMQTTService {

    private OleoMQTTRepository oleoMQTTRepository;

    public OleoMQTTServiceImpl(OleoMQTTRepository oleoMQTTRepository) {
        this.oleoMQTTRepository = oleoMQTTRepository;
    }

    @Override
    public List<OleoMQTT> getAll() {
        return null;
    }

    @Override
    public OleoMQTT getById(Long id) {
        return null;
    }
}
