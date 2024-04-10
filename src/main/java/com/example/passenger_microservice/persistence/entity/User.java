package com.example.passenger_microservice.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigInteger;

@Entity(name = "user")
public class User {
    @Id
    private Long id;
    private String username;
    private String password;
    private boolean authorization;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAuthorization() {
        return authorization;
    }

    public void setAuthorization(boolean authorization) {
        this.authorization = authorization;
    }
}
