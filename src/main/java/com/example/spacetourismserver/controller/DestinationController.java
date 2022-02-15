package com.example.spacetourismserver.controller;

import com.example.spacetourismserver.model.Destination;
import com.example.spacetourismserver.service.DestinationService;
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
@RequestMapping("/api/destination")
@RequiredArgsConstructor
public class DestinationController {
    private final DestinationService destinationService;

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<List<Destination>> findAll(){
        return new ResponseEntity<List<Destination>>(destinationService.findAll(), OK);
    }
}
