package com.rafaelbandim.swpeopleservice.service;

import com.rafaelbandim.swpeopleservice.dto.PlanetDTO;
import org.apache.camel.ProducerTemplate;
import org.springframework.stereotype.Service;
import com.rafaelbandim.swpeopleservice.dto.PeopleDTO;
import com.rafaelbandim.swpeopleservice.entity.People;
import com.rafaelbandim.swpeopleservice.repository.PeopleRepository;

import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService {

    private PeopleRepository peopleRepository;
    private ProducerTemplate producerTemplate;

    public PeopleServiceImpl(PeopleRepository peopleRepository, ProducerTemplate producerTemplate) {
        this.peopleRepository = peopleRepository;
        this.producerTemplate = producerTemplate;
    }

    @Override
    public List<People> getAll() {
        return peopleRepository.findAll();
    }

    @Override
    public PeopleDTO findById(Long id) {
        People people = peopleRepository.findById(id).get();
        PlanetDTO planetDTO = producerTemplate.requestBody("activemq:get-planet", people.getPlanetId(), PlanetDTO.class);
        return new PeopleDTO();
    }
}
