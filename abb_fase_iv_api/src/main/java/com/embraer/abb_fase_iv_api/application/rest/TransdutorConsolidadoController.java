package com.embraer.abb_fase_iv_api.application.rest;

import com.embraer.abb_fase_iv_api.domain.service.TransdutorConsolidadoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/transdutor-consolidado")
public class TransdutorConsolidadoController {

    private final TransdutorConsolidadoService transdutorConsolidadoService;

    public TransdutorConsolidadoController(TransdutorConsolidadoService transdutorConsolidadoService) {
        this.transdutorConsolidadoService = transdutorConsolidadoService;
    }

    @GetMapping
    public ResponseEntity<?> getAllTransdutorConsolidados() {
        return ResponseEntity.ok(this.transdutorConsolidadoService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getTransdutorConsolidadoById(@PathVariable Long id) {
        return ResponseEntity.ok(this.transdutorConsolidadoService.getById(id));
    }
}
