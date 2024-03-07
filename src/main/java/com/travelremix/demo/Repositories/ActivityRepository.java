package com.travelremix.demo.Repositories;

import com.travelremix.demo.Models.Activity;
import org.springframework.data.repository.CrudRepository;

public interface ActivityRepository extends CrudRepository<Activity, Integer> {
}
