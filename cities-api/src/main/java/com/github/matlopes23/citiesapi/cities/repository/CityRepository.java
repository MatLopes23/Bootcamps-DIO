package com.github.matlopes23.citiesapi.cities.repository;

import com.github.matlopes23.citiesapi.cities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
