package com.embraer.abb_fase_iv_api.domain.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tag_coleta")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TagColeta {

    @Id
    private Long id;

    @Column
    private LocalDateTime adicionado;

    @Column
    private LocalDateTime alterado;

    @Column
    private String tag;

    @Column
    private String cor;

    @Column(name = "descricao_brev")
    private String descricaoBrev;

    @Column(name = "descricao_long")
    private String descricaoLong;

    @Column
    private String plc;

    @Column(name = "plc_bit")
    private Integer plcBit;

    @Column
    private Integer step;

    @ManyToOne
    @JoinColumn(name = "fk_grupo_tag_id")
    private GrupoColeta grupoColeta;
}
