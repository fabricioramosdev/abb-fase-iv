package com.embraer.abb_fase_iv_api.application.rest;

import com.embraer.abb_fase_iv_api.domain.service.CicloConsolidadoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ciclo-consolidado")
public class CicloConsolidadoController {

    private final CicloConsolidadoService cicloConsolidadoService;

    public CicloConsolidadoController(CicloConsolidadoService cicloConsolidadoService) {
        this.cicloConsolidadoService = cicloConsolidadoService;
    }

    @GetMapping
    public ResponseEntity<?> getAllCicloConsolidados() {
        return ResponseEntity.ok(this.cicloConsolidadoService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getCicloConsolidadoById(@PathVariable Long id) {
        return ResponseEntity.ok(this.cicloConsolidadoService.getById(id));
    }
}
