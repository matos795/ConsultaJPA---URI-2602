package com.devsuperior.uri2602.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "providers")
public class Provider {

    @Id
    private Long id;
    private String name;
    private String street;
    private String city;
    private String state;
    
    public Provider() { }

    public Provider(Long id, String name, String street, String city, String state) {
        this.id = id;
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Provider [id=" + id + ", name=" + name + ", street=" + street + ", city=" + city + ", state=" + state
                + "]";
    }

}
