package com.embraer.abb_fase_iv_api.application.rest;

import com.embraer.abb_fase_iv_api.domain.service.OleoMQTTService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/oleo-mqtt")
public class OleoMQTTController {

    private final OleoMQTTService oleoMQTTService;

    public OleoMQTTController(OleoMQTTService oleoMQTTService) {
        this.oleoMQTTService = oleoMQTTService;
    }

    @GetMapping
    public ResponseEntity<?> getAllOleoMQTTs() {
        return ResponseEntity.ok(this.oleoMQTTService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOleoMQTTById(@PathVariable Long id) {
        return ResponseEntity.ok(this.oleoMQTTService.getById(id));
    }
}
