package com.embraer.abb_fase_iv_api.application.rest;

import com.embraer.abb_fase_iv_api.domain.service.AlarmeConsolidadoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/alarme-consolidado")
public class AlarmeConsolidadoController {

    private final AlarmeConsolidadoService alarmeConsolidadoService;

    public AlarmeConsolidadoController(AlarmeConsolidadoService alarmeConsolidadoService) {
        this.alarmeConsolidadoService = alarmeConsolidadoService;
    }
    @GetMapping
    public ResponseEntity<?> getAllAlarmeConsolidados(){
        return ResponseEntity.ok(this.alarmeConsolidadoService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getAlarmeConsolidadoById(@PathVariable Long id){
        return ResponseEntity.ok(this.alarmeConsolidadoService.getById(id));
    }


}
