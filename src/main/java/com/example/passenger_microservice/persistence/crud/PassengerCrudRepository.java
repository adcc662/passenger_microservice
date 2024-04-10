package com.example.passenger_microservice.persistence.crud;

import com.example.passenger_microservice.persistence.entity.Passenger;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PassengerCrudRepository extends CrudRepository<Passenger, Integer> {
    List<Passenger> findById(Long idPassenger);
    List<Passenger> findByAuthorization(boolean authorization);
}
