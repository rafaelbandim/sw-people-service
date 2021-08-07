package com.rafaelbandim.swapi.people.service;

import com.rafaelbandim.swapi.people.dto.PeopleDTO;
import com.rafaelbandim.swapi.people.entity.People;

import java.util.List;

public interface PeopleService {

    List<People> getAll();

    PeopleDTO findById(Long id);
}
