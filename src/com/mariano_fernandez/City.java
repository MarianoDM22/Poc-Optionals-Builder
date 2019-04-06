package com.mariano_fernandez;

public class City {
    public int id;
    public String name;

    public City() {
    }

    public City(int id, String name) {
        super();
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "[id:" + id + " name:" + name + "]";
    }
/*
    public City build() {
            City c = new City();
            c.setId() = this.id;
            c.setName() = this.name;
            return c;
    }
*/

}

