package com.embraer.abb_fase_iv_api.domain.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;
import java.time.LocalDateTime;

@Entity
@Table(name = "cicloStepConsolidado")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CicloStepConsolidado {

    @Id
    private Long id;

    @Column
    private LocalDateTime adicionado;

    @Column
    private LocalDateTime alterado;

    @Column
    private LocalDateTime data;

    @Column
    private Integer step;

    @Column
    private String gaveta;

    @Column(unique = true)
    private Integer uuid;

    @Column
    private Time diff;


}
