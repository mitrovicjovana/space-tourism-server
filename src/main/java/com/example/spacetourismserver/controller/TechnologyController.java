package com.example.spacetourismserver.controller;

import com.example.spacetourismserver.model.Technology;
import com.example.spacetourismserver.service.TechnologyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/technology")
@RequiredArgsConstructor
public class TechnologyController {
    private final TechnologyService technologyService;

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<List<Technology>> findAll(){
        return new ResponseEntity<List<Technology>>(technologyService.findAll(), OK);
    }
}
