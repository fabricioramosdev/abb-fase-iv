package com.embraer.abb_fase_iv_api.application.DTO;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class GavetaDTO {

    private Integer totalCiclos;
    private List<CicloConsolidadoDTO> cicloConsolidadoDTOList;
}
