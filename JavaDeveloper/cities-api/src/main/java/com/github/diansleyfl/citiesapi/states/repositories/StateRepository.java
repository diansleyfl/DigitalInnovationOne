package com.github.diansleyfl.citiesapi.states.repositories;

import com.github.diansleyfl.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
