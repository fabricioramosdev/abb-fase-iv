package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.AlarmeConsolidado;
import com.embraer.abb_fase_iv_api.domain.model.TransdutorMQTT;
import com.embraer.abb_fase_iv_api.domain.repository.TransdutorMQTTRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransdutorMQTTServiceImpl implements TransdutorMQTTService {

    private TransdutorMQTTRepository transdutorMQTTRepository;

    public TransdutorMQTTServiceImpl(TransdutorMQTTRepository transdutorMQTTRepository) {
        this.transdutorMQTTRepository = transdutorMQTTRepository;
    }

    @Override
    public List<TransdutorMQTT> getAll() {
        return null;
    }

    @Override
    public TransdutorMQTT getById(Long id) {
        return null;
    }
}
