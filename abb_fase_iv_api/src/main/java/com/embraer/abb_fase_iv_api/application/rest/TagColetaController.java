package com.embraer.abb_fase_iv_api.application.rest;

import com.embraer.abb_fase_iv_api.domain.service.TagColetaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tag-coleta")
public class TagColetaController {

    private final TagColetaService tagColetaService;

    public TagColetaController(TagColetaService tagColetaService) {
        this.tagColetaService = tagColetaService;
    }

    @GetMapping
    public ResponseEntity<?> getAllTagColetas() {
        return ResponseEntity.ok(this.tagColetaService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getTagColetaById(@PathVariable Long id) {
        return ResponseEntity.ok(this.tagColetaService.getById(id));
    }
}
