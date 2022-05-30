package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.application.DTO.ConsolidadoData;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ConsolidadoServiceImpl implements ConsolidadoService {

    @Override
    public ConsolidadoData getConsolidadoByPeriod(LocalDate start, LocalDate end) {
        return null;
    }
}
