package com.rafaelbandim.swpeopleservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rafaelbandim.swpeopleservice.entity.People;

@Repository
public interface PeopleRepository extends JpaRepository<People, Long> {

}
