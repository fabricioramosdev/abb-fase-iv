package com.embraer.abb_fase_iv_api.application.rest;

import com.embraer.abb_fase_iv_api.domain.service.AlarmeMQTTService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/alarme-mqtt")
public class AlarmeMQTTController {

    private final AlarmeMQTTService alarmeMQTTService;

    public AlarmeMQTTController(AlarmeMQTTService alarmeMQTTService) {
        this.alarmeMQTTService = alarmeMQTTService;
    }

    @GetMapping
    public ResponseEntity<?> getAllAlarmeMQTTs() {
        return ResponseEntity.ok(this.alarmeMQTTService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getAlarmeMQTTById(@PathVariable Long id) {
        return ResponseEntity.ok(this.alarmeMQTTService.getById(id));
    }
}
