package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.application.DTO.ConsolidadoDTO;
import com.embraer.abb_fase_iv_api.application.DTO.Payload;
import com.embraer.abb_fase_iv_api.domain.repository.CicloConsolidadoRepository;
import com.embraer.abb_fase_iv_api.domain.repository.CicloStepConsolidadoRepository;
import com.embraer.abb_fase_iv_api.domain.repository.TransdutorConsolidadoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class ConsolidadoServiceImpl implements ConsolidadoService {

    private final TransdutorConsolidadoRepository transdutorConsolidadoRepository;
    private final CicloConsolidadoRepository cicloConsolidadoRepository;
    private final CicloStepConsolidadoRepository cicloStepConsolidadoRepository;

    public ConsolidadoServiceImpl(TransdutorConsolidadoRepository transdutorConsolidadoRepository,
                                  CicloConsolidadoRepository cicloConsolidadoRepository,
                                  CicloStepConsolidadoRepository cicloStepConsolidadoRepository) {
        this.transdutorConsolidadoRepository = transdutorConsolidadoRepository;
        this.cicloConsolidadoRepository = cicloConsolidadoRepository;
        this.cicloStepConsolidadoRepository = cicloStepConsolidadoRepository;
    }

    @Override
    public Payload getConsolidadoByPeriod(LocalDate start, LocalDate end) {
        var teste = transdutorConsolidadoRepository.findAllByDataBetween(start.atStartOfDay(), end.atTime(LocalTime.MAX));
        System.out.println(teste);
        return null;
    }
}
