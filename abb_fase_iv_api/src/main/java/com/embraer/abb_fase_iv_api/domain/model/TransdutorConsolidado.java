package com.embraer.abb_fase_iv_api.domain.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "`transdutorConsolidado`")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TransdutorConsolidado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Column(name = "setpontb")
    private Integer setPointB;
}
