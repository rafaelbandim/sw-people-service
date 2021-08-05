package com.rafaelbandim.swpeopleservice.dto;

public class PeopleDTO {
    private Long id;
    private String name;
    private PlanetDTO planetDTO;

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
