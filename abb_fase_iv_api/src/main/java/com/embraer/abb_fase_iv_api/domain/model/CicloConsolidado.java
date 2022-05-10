package com.embraer.abb_fase_iv_api.domain.model;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "cicloConsolidado")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CicloConsolidado {

    @Id
    private Long id;

    @Column
    private LocalDateTime adicionado;

    @Column
    private LocalDateTime alterado;

    @Column
    private LocalDateTime data;

    @Column(name = "step_inicio")
    private LocalDateTime stepInicio;

    @Column(name = "step_tempo")
    private LocalDateTime stepTempo;

    @Column(name = "step_final")
    private LocalDateTime stepFinal;

    @Column
    private String gaveta;

    @Column(unique = true)
    private Integer uuid;
}
