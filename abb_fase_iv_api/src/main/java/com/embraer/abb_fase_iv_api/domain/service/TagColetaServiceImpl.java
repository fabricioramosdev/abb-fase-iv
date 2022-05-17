package com.embraer.abb_fase_iv_api.domain.service;

import com.embraer.abb_fase_iv_api.domain.model.TagColeta;
import com.embraer.abb_fase_iv_api.domain.repository.TagColetaRepository;
import com.embraer.abb_fase_iv_api.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagColetaServiceImpl implements TagColetaService {

    private final TagColetaRepository tagColetaRepository;

    public TagColetaServiceImpl(TagColetaRepository tagColetaRepository) {
        this.tagColetaRepository = tagColetaRepository;
    }

    @Override
    public List<TagColeta> getAll() {
        return tagColetaRepository.findAll();
    }

    @Override
    public TagColeta getById(Long id) {
        return tagColetaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("tag não encontrada"));
    }
}
