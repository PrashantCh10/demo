package com.cg.spring.dao;

import org.springframework.data.repository.CrudRepository;

import com.cg.spring.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer> {

}
