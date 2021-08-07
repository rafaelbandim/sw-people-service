package com.rafaelbandim.swapi.people.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rafaelbandim.swapi.people.entity.People;

@Repository
public interface PeopleRepository extends JpaRepository<People, Long> {

}
