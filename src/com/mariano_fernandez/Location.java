package com.mariano_fernandez;

import com.mariano_fernandez.City;

public class Location {
    public int id;
    public String name;
    public City city;

    public Location() {
    }

    public Location(int id, String name, City city) {
        super();
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "[id:" + id + " name:" + name + "]";
    }
}
