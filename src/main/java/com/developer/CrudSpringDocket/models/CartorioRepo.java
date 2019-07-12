package com.developer.CrudSpringDocket.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CartorioRepo extends CrudRepository<Cartorio, Integer> {

}
