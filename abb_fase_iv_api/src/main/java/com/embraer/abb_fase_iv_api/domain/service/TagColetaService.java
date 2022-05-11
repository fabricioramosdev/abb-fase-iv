package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.TagColeta;

import java.util.List;

public interface TagColetaService {

    List<TagColeta> getAll();

    TagColeta getById(Long id);
}
