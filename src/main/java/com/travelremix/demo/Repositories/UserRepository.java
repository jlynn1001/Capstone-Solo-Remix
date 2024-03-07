package com.travelremix.demo.Repositories;

import com.travelremix.demo.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
