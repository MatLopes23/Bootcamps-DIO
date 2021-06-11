package com.github.matlopes23.citiesapi.countries.repository;

import com.github.matlopes23.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
