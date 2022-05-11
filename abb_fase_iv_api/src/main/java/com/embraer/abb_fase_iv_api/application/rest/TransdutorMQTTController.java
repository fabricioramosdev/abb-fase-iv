package com.embraer.abb_fase_iv_api.application.rest;

import com.embraer.abb_fase_iv_api.domain.service.TransdutorMQTTService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/transdutor-mqtt")
public class TransdutorMQTTController {

    private final TransdutorMQTTService transdutorMQTTService;

    public TransdutorMQTTController(TransdutorMQTTService transdutorMQTTService) {
        this.transdutorMQTTService = transdutorMQTTService;
    }

    @GetMapping
    public ResponseEntity<?> getAllTransdutorMQTTs() {
        return ResponseEntity.ok(this.transdutorMQTTService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getTransdutorMQTTById(@PathVariable Long id) {
        return ResponseEntity.ok(this.transdutorMQTTService.getById(id));
    }
}
