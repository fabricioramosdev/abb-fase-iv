package com.embraer.abb_fase_iv_api.application.rest;

import com.embraer.abb_fase_iv_api.domain.service.GavetaBMQTTService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/gaveta-b-mqtt")
public class GavetaBMQTTController {

    private final GavetaBMQTTService gavetaBMQTTService;

    public GavetaBMQTTController(GavetaBMQTTService gavetaBMQTTService) {
        this.gavetaBMQTTService = gavetaBMQTTService;
    }

    @GetMapping
    public ResponseEntity<?> getAllGavetaBMQTTs() {
        return ResponseEntity.ok(this.gavetaBMQTTService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getGavetaBMQTTById(@PathVariable Long id) {
        return ResponseEntity.ok(this.gavetaBMQTTService.getById(id));
    }
}
