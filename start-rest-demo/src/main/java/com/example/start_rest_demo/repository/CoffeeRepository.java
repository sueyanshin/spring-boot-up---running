package com.example.start_rest_demo.repository;


import com.example.start_rest_demo.model.Coffee;
import org.springframework.data.repository.CrudRepository;
public interface CoffeeRepository extends CrudRepository<Coffee, String> {
}
