package com.mariano_fernandez;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
//import static java.util..isnull;

public class Main {
    public static void main(String[] args) {

        List<Event> events = Arrays.asList (
                new Event(5,"Event 5", new Location(5, "Location 5", new City(5, "City 5"))),
                new Event(1, "Event 1", new Location(1, "Location 1", new City(1, "City 1"))),
                new Event(2,"Event 2", new Location(2, "Location 2", new City(2, "City 2"))),
                new Event(7,"Event 7", new Location(7, "Location 7", new City(7, "City 7"))),
                new Event(3,"Event 3", new Location(3, "Location 3", new City(3, "City 3"))),
                new Event(4,"Event 4", new Location(4, "Location 4", new City(4, "City 4"))),
                new Event(6,"Event 6", new Location(6, "Location 6", new City(6, "City 6"))),
                new Event(8,"Event 8", new Location(8, "Location 8", new City(8, "City 8")))
        );

        //get primeros 5 por id
        System.out.println(
                String.format("Primeros 5 elementos : %s",
                        events.stream().limit(5).collect(Collectors.toList())
                )
        );

    }
}
