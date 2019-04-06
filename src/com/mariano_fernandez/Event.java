package com.mariano_fernandez;

import java.util.List;

public class Event {
    public int id;
    public String name;
    public Location location;

    public Event(int id, String name) {
    }

    public Event(int id, String name, Location location) {
        super();
        this.id = id;
        this.name = name;
        this.location = location;
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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List getEventById(List event, int id) {
        return  event;
    }

    @Override
    public String toString() {
        return "[id:" + id + " name:" + name + "]";
    }
}
