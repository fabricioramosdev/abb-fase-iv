package com.embraer.abb_fase_iv_api.application.rest;

import com.embraer.abb_fase_iv_api.domain.service.OleoConsolidadoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/oleo-consolidado")
public class OleoConsolidadoController {

    private final OleoConsolidadoService oleoConsolidadoService;

    public OleoConsolidadoController(OleoConsolidadoService oleoConsolidadoService) {
        this.oleoConsolidadoService = oleoConsolidadoService;
    }

    @GetMapping
    public ResponseEntity<?> getAllOleoConsolidados() {
        return ResponseEntity.ok(this.oleoConsolidadoService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOleoConsolidadoById(@PathVariable Long id) {
        return ResponseEntity.ok(this.oleoConsolidadoService.getById(id));
    }
}
