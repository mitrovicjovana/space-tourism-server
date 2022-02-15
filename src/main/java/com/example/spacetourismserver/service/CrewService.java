package com.example.spacetourismserver.service;

import com.example.spacetourismserver.model.Crew;
import com.example.spacetourismserver.repository.CrewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CrewService {
    private final CrewRepository crewRepository;

    public List<Crew> findAll(){
        return crewRepository.findAll();
    }
}
