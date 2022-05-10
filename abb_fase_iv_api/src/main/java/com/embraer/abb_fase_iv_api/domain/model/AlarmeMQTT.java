package com.embraer.abb_fase_iv_api.domain.model;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "alarmeMqtt")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlarmeMQTT {

    @Id
    private Long id;

    @Column
    private LocalDateTime adicionado;

    @Column
    private LocalDateTime alterado;

    @Column(columnDefinition = "jsonb")
    @JsonValue
    private String payload;
}
