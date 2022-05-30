package com.embraer.abb_fase_iv_api.application.rest;

import com.embraer.abb_fase_iv_api.domain.service.ConsolidadoService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1/consolidado")
public class ConsolidadoController {

    private final ConsolidadoService consolidadoService;

    public ConsolidadoController(ConsolidadoService consolidadoService) {
        this.consolidadoService = consolidadoService;
    }


    @GetMapping
    public ResponseEntity<?> getConsolidadoByPeriod(@RequestParam("start") @DateTimeFormat(pattern="yyyy-MM-dd")
                                                        LocalDate start,
                                                    @RequestParam("end") @DateTimeFormat(pattern="yyyy-MM-dd")
                                                        LocalDate end) {
        return ResponseEntity.ok(consolidadoService.getConsolidadoByPeriod(start, end));
    }
}
