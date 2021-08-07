package com.rafaelbandim.swapi.people.controller;

import com.rafaelbandim.swapi.people.dto.PeopleDTO;
import com.rafaelbandim.swapi.people.service.PeopleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rafaelbandim.swapi.people.entity.People;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {

    private PeopleService peopleService;

    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping
    public ResponseEntity<List<People>> getAll() {
        return ResponseEntity.ok(peopleService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PeopleDTO> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(peopleService.findById(id));
    }
}
