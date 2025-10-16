package com.example.location.service;

public class CarNotFoundException extends Exception {
    public CarNotFoundException(String immatriculation) {
        super(immatriculation);
    }
}
