package com.example.passenger_microservice.persistence.mapper;

import com.example.passenger_microservice.domain.DomainPassenger;
import com.example.passenger_microservice.persistence.entity.Passenger;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PassengerMapper {
    @Mappings({
            @Mapping(source = "id", target = "idD"),
            @Mapping(source = "name", target = "nameD"),
            @Mapping(source = "origin", target = "originD"),
            @Mapping(source = "destination", target = "destinationD"),
            @Mapping(source = "authorization", target = "authorization"),

    })
    DomainPassenger toDomainPassenger(Passenger passenger);
    List<DomainPassenger> toPassengers(List<Passenger> passengers);



}
