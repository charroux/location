package com.example.location.data;

import com.example.location.web.Dates;
import jakarta.persistence.*;

@Entity
public class Car {

    long id;
    String plaque;
    boolean louer;
    Dates dates;

    public String getPlaque() {
        return plaque;
    }

    public void setPlaque(String plaque) {
        this.plaque = plaque;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isLouer() {
        return louer;
    }

    public void setLouer(boolean louer) {
        this.louer = louer;
    }

    @Transient
    public Dates getDates() {
        return dates;
    }

    public void setDates(Dates dates) {
        this.dates = dates;
    }
}
