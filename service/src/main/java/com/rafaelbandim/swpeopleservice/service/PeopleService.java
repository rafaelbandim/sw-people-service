package com.rafaelbandim.swpeopleservice.service;

import com.rafaelbandim.swpeopleservice.dto.PeopleDTO;
import com.rafaelbandim.swpeopleservice.entity.People;

import java.util.List;

public interface PeopleService {

    List<People> getAll();

    PeopleDTO findById(Long id);
}
