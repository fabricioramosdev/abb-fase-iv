package com.embraer.abb_fase_iv_api.application.DTO;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ConsolidadoDTO {

    private GavetaDTO gavetaA;
    private GavetaDTO gavetaB;
}
