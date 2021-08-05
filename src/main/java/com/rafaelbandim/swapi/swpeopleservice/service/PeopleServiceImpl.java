package com.rafaelbandim.swapi.swpeopleservice.service;

import com.rafaelbandim.swapi.swpeopleservice.entity.People;
import com.rafaelbandim.swapi.swpeopleservice.repository.PeopleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService{

    private PeopleRepository peopleRepository;

    public PeopleServiceImpl(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Override
    public List<People> getAll() {
        return peopleRepository.findAll();
    }
}
