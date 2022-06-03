package com.embraer.abb_fase_iv_api.application.DTO;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Builder
@Data
public class Payload {

    List<Map<LocalDate, ConsolidadoDTO>> payload;
}
