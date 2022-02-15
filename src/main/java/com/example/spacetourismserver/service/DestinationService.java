package com.example.spacetourismserver.service;

import com.example.spacetourismserver.model.Destination;
import com.example.spacetourismserver.repository.DestinationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DestinationService {
    private final DestinationRepository destinationRepository;

    public List<Destination> findAll(){
        return destinationRepository.findAll();
    }
}
