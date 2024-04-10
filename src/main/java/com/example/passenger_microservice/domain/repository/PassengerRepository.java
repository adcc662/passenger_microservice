package com.example.passenger_microservice.domain.repository;

import com.example.passenger_microservice.domain.DomainPassenger;

import java.util.List;
import java.util.Optional;

;
public interface PassengerRepository {
    List<DomainPassenger> getAll();
    List<DomainPassenger> getByAuthorization(boolean authorization);
    Optional<List<DomainPassenger>> getByPassenger(Long idPassenger);
    DomainPassenger save(DomainPassenger domainPassenger);
    void delete(int idPassenger);

}
