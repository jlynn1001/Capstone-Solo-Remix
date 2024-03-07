package com.travelremix.demo.Repositories;

import com.travelremix.demo.Models.Trip;
import org.springframework.data.repository.CrudRepository;

public interface TripRepository extends CrudRepository<Trip, Integer> {
}
