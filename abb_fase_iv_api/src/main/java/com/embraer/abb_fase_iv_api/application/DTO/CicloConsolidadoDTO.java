package com.embraer.abb_fase_iv_api.application.DTO;

import lombok.Builder;
import lombok.Data;

import java.time.LocalTime;

@Data
@Builder
public class CicloConsolidadoDTO {

    private Integer pressaoA;
    private Integer pressaoB;
    private Integer qtdCiclos;
    private LocalTime tempoMedioCiclo;
    private LocalTime tempoMaximoCiclo;
}
