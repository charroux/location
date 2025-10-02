package com.example.location.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {

    long id;
    String plaque;

    public String getPlaque() {
        return plaque;
    }

    public void setPlaque(String plaque) {
        this.plaque = plaque;
    }

    @Id
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
