package com.embraer.abb_fase_iv_api.domain.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "transdutorConsolidado")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransdutorConsolidado {

    @Id
    private Long id;

    @Column
    private LocalDateTime adicionado;

    @Column
    private LocalDateTime alterado;

    @Column
    private LocalDateTime data;

    @Column
    private Integer tps125;

    @Column
    private Integer tps170;

    @Column(name = "setpointa")
    private Integer setPointA;

    @Column(name = "setpointb")
    private Integer setPointB;
}
