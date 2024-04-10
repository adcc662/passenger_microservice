package com.example.passenger_microservice.domain.service;

import com.example.passenger_microservice.domain.DomainPassenger;
import com.example.passenger_microservice.domain.repository.PassengerRepository;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Service
public class PassengerService {
    @Autowired
    public PassengerRepository passengerRepository;

    public List<DomainPassenger> getAll(){
        return passengerRepository.getAll();
    }

    public Optional<List<DomainPassenger>> getPassenger(Long idPassenger){
        return passengerRepository.getByPassenger(idPassenger);
    }

}
