package com.example.spacetourismserver.service;

import com.example.spacetourismserver.model.Technology;
import com.example.spacetourismserver.repository.TechnologyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TechnologyService {
    private final TechnologyRepository technologyRepository;

    public List<Technology> findAll() {
        return technologyRepository.findAll();
    }
}
