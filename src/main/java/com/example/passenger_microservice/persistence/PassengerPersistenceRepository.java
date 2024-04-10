package com.example.passenger_microservice.persistence;
import com.example.passenger_microservice.domain.DomainPassenger;
import com.example.passenger_microservice.domain.repository.PassengerRepository;
import com.example.passenger_microservice.persistence.crud.PassengerCrudRepository;
import com.example.passenger_microservice.persistence.entity.Passenger;
import com.example.passenger_microservice.persistence.mapper.PassengerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PassengerPersistenceRepository implements PassengerRepository {
    @Autowired
    private PassengerCrudRepository passengerCrudRepository;

    @Autowired
    private PassengerMapper mapper;

    @Override
    public List<DomainPassenger> getAll() {
        List<Passenger> passengers = (List<Passenger>) passengerCrudRepository.findAll();
        return mapper.toPassengers(passengers);
    }

    @Override
    public List<DomainPassenger> getByAuthorization(boolean authorization) {
        return List.of();
    }

    @Override
    public Optional<List<DomainPassenger>> getByPassenger(Long idPassenger) {
        return Optional.empty();
    }

    @Override
    public DomainPassenger save(DomainPassenger domainPassenger) {
        return null;
    }

    @Override
    public void delete(int idPassenger) {

    }
}
