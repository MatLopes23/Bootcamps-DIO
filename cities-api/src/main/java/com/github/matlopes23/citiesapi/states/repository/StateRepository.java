package com.github.matlopes23.citiesapi.states.repository;

import com.github.matlopes23.citiesapi.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
