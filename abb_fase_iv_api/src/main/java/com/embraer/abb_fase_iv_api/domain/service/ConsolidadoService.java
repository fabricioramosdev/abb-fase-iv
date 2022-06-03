package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.application.DTO.ConsolidadoDTO;
import com.embraer.abb_fase_iv_api.application.DTO.Payload;

import java.time.LocalDate;

public interface ConsolidadoService {

    Payload getConsolidadoByPeriod(LocalDate start, LocalDate end);
}
