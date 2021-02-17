package com.github.diansleyfl.citiesapi.countries.repositories;

import com.github.diansleyfl.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}