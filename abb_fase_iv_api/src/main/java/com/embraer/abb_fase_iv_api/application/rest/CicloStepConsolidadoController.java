package com.embraer.abb_fase_iv_api.application.rest;

import com.embraer.abb_fase_iv_api.domain.service.CicloStepConsolidadoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ciclo-step-consolidado")
public class CicloStepConsolidadoController {

    private final CicloStepConsolidadoService cicloStepConsolidadoService;

    public CicloStepConsolidadoController(CicloStepConsolidadoService cicloStepConsolidadoService) {
        this.cicloStepConsolidadoService = cicloStepConsolidadoService;
    }

    @GetMapping
    public ResponseEntity<?> getAllCicloStepConsolidados() {
        return ResponseEntity.ok(this.cicloStepConsolidadoService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCicloStepConsolidadoById(@PathVariable Long id) {
        return ResponseEntity.ok(this.cicloStepConsolidadoService.getById(id));
    }
}
