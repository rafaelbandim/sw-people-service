package com.rafaelbandim.swapi.people.dto;

import com.rafaelbandim.swapi.planet.PlanetDTO;

public class PeopleDTO {
    private Long id;
    private String name;
    private PlanetDTO planetDTO;

    public PeopleDTO(Long id, String name, PlanetDTO planetDTO) {
        this.id = id;
        this.name = name;
        this.planetDTO = planetDTO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlanetDTO getPlanetDTO() {
        return planetDTO;
    }

    public void setPlanetDTO(PlanetDTO planetDTO) {
        this.planetDTO = planetDTO;
    }
}
