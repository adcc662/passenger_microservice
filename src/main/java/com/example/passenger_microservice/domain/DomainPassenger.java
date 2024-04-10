package com.example.passenger_microservice.domain;

public class DomainPassenger {
    private Long idD;
    private String nameD;
    private String originD;
    private String destinationD;
    private boolean authorizationD;

    public Long getId() {
        return idD;
    }

    public void setId(Long idD) {
        this.idD = idD;
    }

    public String getNameD() {
        return nameD;
    }

    public void setNameD(String nameD) {
        this.nameD = nameD;
    }

    public String getOriginD() {
        return originD;
    }

    public void setOriginD(String originD) {
        this.originD = originD;
    }

    public String getDestinationD() {
        return destinationD;
    }

    public void setDestinationD(String destinationD) {
        this.destinationD = destinationD;
    }

    public boolean isAuthorizationD() {
        return authorizationD;
    }

    public void setAuthorizationD(boolean authorizationD) {
        this.authorizationD = authorizationD;
    }
}
