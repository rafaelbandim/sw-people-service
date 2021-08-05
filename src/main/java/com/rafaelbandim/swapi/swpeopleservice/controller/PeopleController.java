package com.rafaelbandim.swapi.swpeopleservice.controller;

import com.rafaelbandim.swapi.swpeopleservice.entity.People;
import com.rafaelbandim.swapi.swpeopleservice.service.PeopleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {

    private PeopleService peopleService;

    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping
    public ResponseEntity<List<People>> getAll(){
        return ResponseEntity.ok(peopleService.getAll());
    }
}
