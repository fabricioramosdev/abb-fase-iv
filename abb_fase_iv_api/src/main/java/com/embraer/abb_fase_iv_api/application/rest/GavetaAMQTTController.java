package com.embraer.abb_fase_iv_api.application.rest;

import com.embraer.abb_fase_iv_api.domain.service.GavetaAMQTTService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/gaveta-a-mqtt")
public class GavetaAMQTTController {

    private final GavetaAMQTTService gavetaAMQTTService;

    public GavetaAMQTTController(GavetaAMQTTService gavetaAMQTTService) {
        this.gavetaAMQTTService = gavetaAMQTTService;
    }

    @GetMapping
    public ResponseEntity<?> getAllGavetaAMQTTs() {
        return ResponseEntity.ok(this.gavetaAMQTTService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getGavetaAMQTTById(@PathVariable Long id) {
        return ResponseEntity.ok(this.gavetaAMQTTService.getById(id));
    }
}
