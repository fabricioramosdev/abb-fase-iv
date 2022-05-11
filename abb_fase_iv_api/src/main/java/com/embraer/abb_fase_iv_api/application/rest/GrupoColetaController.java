package com.embraer.abb_fase_iv_api.application.rest;

import com.embraer.abb_fase_iv_api.domain.service.GrupoColetaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("grupo-coleta")
public class GrupoColetaController {

    private final GrupoColetaService grupoColetaService;

    public GrupoColetaController(GrupoColetaService grupoColetaService) {
        this.grupoColetaService = grupoColetaService;
    }

    @GetMapping
    public ResponseEntity<?> getAllGrupoColetas() {
        return ResponseEntity.ok(this.grupoColetaService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getGrupoColetaId(@PathVariable Long id) {
        return ResponseEntity.ok(this.grupoColetaService.getById(id));
    }
}
