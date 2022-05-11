package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.TagColeta;
import com.embraer.abb_fase_iv_api.domain.repository.TagColetaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagColetaServiceImpl implements TagColetaService {

    private TagColetaRepository tagColetaRepository;

    public TagColetaServiceImpl(TagColetaRepository tagColetaRepository) {
        this.tagColetaRepository = tagColetaRepository;
    }

    @Override
    public List<TagColeta> getAll() {
        return null;
    }

    @Override
    public TagColeta getById(Long id) {
        return null;
    }
}
