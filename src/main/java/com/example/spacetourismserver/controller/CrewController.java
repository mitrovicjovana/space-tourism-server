package com.example.spacetourismserver.controller;

import com.example.spacetourismserver.model.Crew;
import com.example.spacetourismserver.service.CrewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/crew")
@RequiredArgsConstructor
public class CrewController {
    private final CrewService crewService;

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<List<Crew>> findAll(){
        return new ResponseEntity<List<Crew>>(crewService.findAll(), OK);
    }

}