package com.embraer.abb_fase_iv_api.domain.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "oleo_consolidado")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OleoConsolidado {

    @Id
    private Long id;

    @Column
    private LocalDateTime adicionado;

    @Column
    private LocalDateTime alterado;

    @Column
    private LocalDateTime data;

    @Column
    private BigDecimal nivel;

    @Column(name = "temp_avg")
    private BigDecimal tempAvg;

    @Column(name = "temp_min")
    private BigDecimal tempMin;

    @Column(name = "temp_max")
    private BigDecimal tempMax;

    @Column(name = "temp_aumento")
    private BigDecimal tempAumento;
}
