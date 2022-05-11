package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.GrupoColeta;

import java.util.List;

public interface GrupoColetaService {

    List<GrupoColeta> getAll();

    GrupoColeta getById(Long id);
}
