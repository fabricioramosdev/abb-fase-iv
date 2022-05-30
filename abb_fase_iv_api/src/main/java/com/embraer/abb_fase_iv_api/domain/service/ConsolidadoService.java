package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.application.DTO.ConsolidadoData;

import java.time.LocalDate;

public interface ConsolidadoService {

    ConsolidadoData getConsolidadoByPeriod(LocalDate start, LocalDate end);
}
